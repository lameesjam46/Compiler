package Visitor.jinjaVisitor;

import AST.JinjaAST.*;

import java.util.*;

/**
 * ===============================================================
 * المرحلة الثانية: التنفيذ الحقيقي (Rendering)
 * ===============================================================
 *
 * بعكس الـ toString() (المرحلة الأولى، Round-trip)، هاد الكلاس
 * "بينفذ" الشجرة فعليًا: بيقيّم كل تعبير لقيمته الحقيقية من
 * RenderContext، وبيختار الفرع الصح بالـ if/elif/else، وبيلف فعليًا
 * على عناصر الـ for. الناتج النهائي HTML صافٍ 100% — بدون أي أثر
 * لـ {{ }} أو {% %}.
 *
 * ⚠️ قيد معروف (موثّق من قبل): تعبيرات Jinja داخل قيم الـ HTML
 * attributes (مثل href="/product/{{ p.id }}") مش ممثّلة كتعبير
 * بالشجرة أصلاً (TAG_STRING بيلقطها كنص خام) — فبتنطبع زي ما هي
 * بدون تعويض، بهاد الكلاس وبأي كلاس تاني بيشتغل عالشجرة.
 */
public class JinjaEvaluator {

    // Stack من الـ scopes: كل for-loop بيضيف scope جديد فوق،
    // ولما يخلص الحلقة بينشال. هيك متغيرات الحلقة (p مثلاً)
    // ما بتتسرب برا نطاقها.
    private final Deque<Map<String, Object>> scopes = new ArrayDeque<>();

    public JinjaEvaluator(RenderContext globalContext) {
        scopes.push(new HashMap<>(globalContext.asMap()));
    }

    public String render(Program program) {
        StringBuilder sb = new StringBuilder();
        for (Node n : program.getNodes()) {
            sb.append(renderNode(n));
        }
        return sb.toString();
    }

    // ================= Node Rendering =================

    private String renderNode(Node node) {
        if (node == null) return "";

        if (node instanceof HtmlText t) return t.getText();
        if (node instanceof HtmlDoctype d) return d.getValue();
        if (node instanceof HtmlComment c) return "<!--" + c.getComment() + "-->";

        if (node instanceof HtmlElement el) {
            return renderHtmlElement(el);
        }

        if (node instanceof JinjaExpression je) {
            Object value = eval(je.getExpr());
            return value == null ? "" : String.valueOf(value);
        }

        if (node instanceof SetStmt s) {
            Object value = eval(s.getValue());
            scopes.peek().put(s.getVar(), value);
            return ""; // {% set %} ما بيطلع أي نص بالمخرجات
        }

        if (node instanceof IfStmt ifs) {
            return renderIf(ifs);
        }

        if (node instanceof ForStmt fs) {
            return renderFor(fs);
        }

        // BreakStmt / ContinueStmt: غير مؤثرين على التنفيذ الحقيقي
        // لأنه الحلقة عندنا بتلف على Iterable كامل مباشرة (بدون فرصة
        // للـ break/continue تتحكم بالتدفق حاليًا)
        return "";
    }

    private String renderHtmlElement(HtmlElement el) {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(el.getTagName());
        for (HtmlAttribute attr : el.getAttributes()) {
            sb.append(" ").append(attr.getName()).append("=").append(renderAttributeValue(attr));
        }
        if (el.isSelfClosing()) {
            sb.append(" />");
        } else {
            sb.append(">");
            for (Node child : el.getChildren()) {
                sb.append(renderNode(child));
            }
            sb.append("</").append(el.getTagName()).append(">");
        }
        return sb.toString();
    }

    // ================================================================
    // تعديل: هاي الدالة جديدة — تحل مشكلة موثّقة سابقًا (قيد معروف):
    // قيمة HTML attribute (زي href="/product/{{ p.id }}") كانت تُطبع
    // كنص خام بدون تعويض {{ }} جوّاها، بسبب طريقة معالجة TAG_STRING
    // بالـ Lexer (بتلقط كل شي بين علامتي الاقتباس كنص واحد). صرنا هون
    // نفحص القيمة يدويًا، نلاقي أي {{ ... }} جوّاها، ونقيّمها فعليًا
    // بمعزل عن شجرة Jinja الأساسية (عبر evalSimplePath، تدعم فقط
    // مسارات بسيطة identifier.field.field..، وهو بالضبط كل الحالات
    // الفعلية المستخدمة بقيم attributes بهالمشروع).
    //
    // بعدين، لو الـ attribute اسمها href أو action، منمرر القيمة
    // النهائية (بعد التعويض) على LinkRewriter، يلي بيحوّل مسار
    // Flask الديناميكي (مثل "/product/3") لاسم ملف HTML ثابت مطابق
    // (مثل "product_detail_3.html") — حل مشكلة الروابط المكسورة
    // بالنسخة الـ static المولّدة، بدل ما تعطي 404 بالمتصفح.
    // ================================================================
    private String renderAttributeValue(HtmlAttribute attr) {
        String rawWithQuotes = attr.getValue();
        char quoteChar = (rawWithQuotes.length() >= 2 && (rawWithQuotes.charAt(0) == '"' || rawWithQuotes.charAt(0) == '\''))
                ? rawWithQuotes.charAt(0) : '"';
        String inner = stripQuotes(rawWithQuotes);

        // 1) تعويض كل {{ ... }} الموجودة جوا قيمة الـ attribute
        java.util.regex.Pattern p = java.util.regex.Pattern.compile("\\{\\{\\s*(.*?)\\s*}}");
        java.util.regex.Matcher m = p.matcher(inner);
        StringBuilder resolved = new StringBuilder();
        int last = 0;
        while (m.find()) {
            resolved.append(inner, last, m.start());
            Object val = evalSimplePath(m.group(1));
            resolved.append(val == null ? "" : String.valueOf(val));
            last = m.end();
        }
        resolved.append(inner.substring(last));
        String finalValue = resolved.toString();

        // 2) تحويل روابط التنقل (href/action) من مسار Flask لاسم ملف ثابت
        String attrName = attr.getName();
        if (attrName.equals("href") || attrName.equals("action")) {
            finalValue = Integrator.LinkRewriter.toStaticFile(finalValue);
        }

        return quoteChar + finalValue + quoteChar;
    }

    private String stripQuotes(String s) {
        if (s.length() >= 2 && (s.charAt(0) == '"' || s.charAt(0) == '\'')) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }

    /**
     * تقييم مسار بسيط زي "p.id" أو "product.name" أو "count" —
     * لا يدعم عمليات حسابية/منطقية (غير محتاجينها بقيم attributes
     * فعليًا بهالمشروع). لو احتجنا تعبير أعقد مستقبلًا داخل attribute،
     * لازم نوسّعها وقتها.
     */
    private Object evalSimplePath(String exprText) {
        String[] parts = exprText.trim().split("\\.");
        if (parts.length == 0) return null;
        Object current = resolve(parts[0]);
        for (int i = 1; i < parts.length && current != null; i++) {
            if (current instanceof Map<?, ?> map) {
                current = ((Map<String, Object>) map).get(parts[i]);
            } else {
                return null;
            }
        }
        return current;
    }

    private String renderIf(IfStmt ifs) {
        if (isTruthy(eval(ifs.getCondition()))) {
            return renderBody(ifs.getThenBranch());
        }
        for (ElifStmt elif : ifs.getElifBlocks()) {
            if (isTruthy(eval(elif.getCondition()))) {
                return renderBody(elif.getBody());
            }
        }
        if (ifs.getElseBlock() != null) {
            return renderBody(ifs.getElseBlock().getBody());
        }
        return "";
    }

    private String renderFor(ForStmt fs) {
        Object iterableVal = eval(fs.getIterable());
        StringBuilder sb = new StringBuilder();

        if (iterableVal instanceof Iterable<?> iterable) {
            for (Object item : iterable) {
                Map<String, Object> loopScope = new HashMap<>();
                loopScope.put(fs.getVar(), item);
                scopes.push(loopScope);
                sb.append(renderBody(fs.getBody()));
                scopes.pop();
            }
        }
        return sb.toString();
    }

    private String renderBody(List<Node> body) {
        StringBuilder sb = new StringBuilder();
        for (Node n : body) sb.append(renderNode(n));
        return sb.toString();
    }

    // ================= Expression Evaluation =================

    private Object eval(Expression expr) {
        if (expr == null) return null;

        if (expr instanceof Literal lit) return lit.getValue();
        if (expr instanceof Identifier id) return resolve(id.getName());

        if (expr instanceof PostfixExpr pf) {
            Object current = eval(pf.getBase());
            for (PostfixPart part : pf.getParts()) {
                current = applyPart(current, part);
            }
            return current;
        }

        if (expr instanceof BinaryExpr bin) return evalBinary(bin);

        if (expr instanceof UnaryExpr un) {
            String op = un.getOp().trim();
            if (op.equals("not")) return !isTruthy(eval(un.getExpr()));
            if (op.equals("-")) return negate(eval(un.getExpr()));
            return eval(un.getExpr());
        }

        return null;
    }

    @SuppressWarnings("unchecked")
    private Object applyPart(Object current, PostfixPart part) {
        if (current == null) return null;

        if (part instanceof PropertyAccess pa) {
            if (current instanceof Map<?, ?> map) {
                return ((Map<String, Object>) map).get(pa.getProperty());
            }
            return null; // ما لقينا الخاصية (مش Map)
        }

        if (part instanceof FilterCall fc) {
            return applyFilter(current, fc.getFilter());
        }

        if (part instanceof IndexAccess ia) {
            return applyIndex(current, ia);
        }

        return current;
    }

    private Object applyFilter(Object value, String filterName) {
        return switch (filterName) {
            case "length" -> lengthOf(value);
            case "upper" -> value == null ? null : String.valueOf(value).toUpperCase();
            case "lower" -> value == null ? null : String.valueOf(value).toLowerCase();
            default -> value; // فلتر غير معروف: منرجع القيمة متل ما هي بدل ما نطيح
        };
    }

    private int lengthOf(Object value) {
        if (value instanceof Collection<?> c) return c.size();
        if (value instanceof Map<?, ?> m) return m.size();
        if (value instanceof String s) return s.length();
        return 0;
    }

    private Object applyIndex(Object value, IndexAccess ia) {
        if (!(value instanceof List<?> list)) return null;
        if (ia.isSlice()) {
            int start = ia.getStart() != null ? asInt(eval(ia.getStart())) : 0;
            int end = ia.getEnd() != null ? asInt(eval(ia.getEnd())) : list.size();
            start = Math.max(0, Math.min(start, list.size()));
            end = Math.max(start, Math.min(end, list.size()));
            return list.subList(start, end);
        } else {
            int index = asInt(eval(ia.getStart()));
            if (index < 0 || index >= list.size()) return null;
            return list.get(index);
        }
    }

    private Object evalBinary(BinaryExpr bin) {
        String op = bin.getOp();

        if (op.equals("and")) return isTruthy(eval(bin.getLeft())) && isTruthy(eval(bin.getRight()));
        if (op.equals("or")) return isTruthy(eval(bin.getLeft())) || isTruthy(eval(bin.getRight()));

        Object l = eval(bin.getLeft());
        Object r = eval(bin.getRight());

        return switch (op) {
            case "+" -> add(l, r);
            case "-" -> arith(l, r, '-');
            case "*" -> arith(l, r, '*');
            case "/" -> arith(l, r, '/');
            case "%" -> arith(l, r, '%');
            case "==" -> Objects.equals(l, r);
            case "!=" -> !Objects.equals(l, r);
            case "is" -> Objects.equals(l, r);
            case ">" -> compare(l, r) > 0;
            case "<" -> compare(l, r) < 0;
            case ">=" -> compare(l, r) >= 0;
            case "<=" -> compare(l, r) <= 0;
            default -> null;
        };
    }

    private Object add(Object l, Object r) {
        // لو أي طرف نص، منعمل concatenation (زي Jinja الحقيقية تقريبًا)
        if (l instanceof String || r instanceof String) {
            return String.valueOf(l) + String.valueOf(r);
        }
        return arith(l, r, '+');
    }

    private Object arith(Object l, Object r, char op) {
        double a = asDouble(l), b = asDouble(r);
        double result = switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> b == 0 ? 0 : a / b;
            case '%' -> b == 0 ? 0 : a % b;
            default -> 0;
        };
        // لو الاثنين Integer أصلاً، رجعي Integer (نتيجة أنضف بالعرض)
        if (l instanceof Integer && r instanceof Integer && op != '/') {
            return (int) result;
        }
        return result;
    }

    private int compare(Object l, Object r) {
        return Double.compare(asDouble(l), asDouble(r));
    }

    private double asDouble(Object v) {
        if (v instanceof Number n) return n.doubleValue();
        if (v instanceof String s) {
            try { return Double.parseDouble(s); } catch (NumberFormatException ignored) {}
        }
        return 0;
    }

    private int asInt(Object v) {
        return (int) asDouble(v);
    }

    private Object negate(Object v) {
        if (v instanceof Integer i) return -i;
        return -asDouble(v);
    }

    private boolean isTruthy(Object v) {
        if (v == null) return false;
        if (v instanceof Boolean b) return b;
        if (v instanceof Number n) return n.doubleValue() != 0;
        if (v instanceof String s) return !s.isEmpty();
        if (v instanceof Collection<?> c) return !c.isEmpty();
        if (v instanceof Map<?, ?> m) return !m.isEmpty();
        return true;
    }

    // ================= Scope Resolution =================

    private Object resolve(String name) {
        for (Map<String, Object> scope : scopes) {
            if (scope.containsKey(name)) return scope.get(name);
        }
        return null; // متغير مش معرّف = null (بدل ما يطيح البرنامج)
    }
}