package Integrator;

import AST.JinjaAST.*;
import AST.PaythonAST.ASTNode;
import AST.PaythonAST.ProgramNode;

import java.util.List;

/**
 * ===============================================================
 * AstJsonExporter — تصدير شجرتي Python وJinja لصيغة JSON حقيقية
 * ===============================================================
 *
 * مطلوب صراحة بإعلان الدكتورة: ast_python.json و ast_jinja.json
 * بمجلد compiler_output/. مكتوب يدويًا (بدون مكتبة JSON خارجية)
 * لتجنب أي تعقيد بالاعتماديات (dependencies) بمشروع ANTLR الحالي.
 */
public class AstJsonExporter {

    // ================================================================
    // تعديل: كان الناتج (من pythonAstToJson / jinjaAstToJson) نص JSON
    // صحيح تركيبيًا 100%، بس مضغوط بسطر واحد طويل — صعب قراءته بالعين
    // المجردة. صرنا نمرره على prettyPrintJson() قبل الإرجاع، فيصير
    // منسّق بأسطر ومسافات بادئة (2 مسافة لكل مستوى)، بدون أي تغيير
    // على البيانات نفسها أو ترتيبها — فقط شكل العرض.
    // ================================================================
    private static String prettyPrintJson(String compactJson) {
        StringBuilder sb = new StringBuilder();
        int indent = 0;
        boolean inQuotes = false;

        for (int i = 0; i < compactJson.length(); i++) {
            char c = compactJson.charAt(i);

            if (c == '"' && (i == 0 || compactJson.charAt(i - 1) != '\\')) {
                inQuotes = !inQuotes;
                sb.append(c);
                continue;
            }

            if (inQuotes) {
                sb.append(c);
                continue;
            }

            switch (c) {
                case '{':
                case '[':
                    sb.append(c);
                    // حالة خاصة: {} أو [] فاضية — نخليها بسطر واحد بدون قفزة
                    if (i + 1 < compactJson.length()
                            && (compactJson.charAt(i + 1) == '}' || compactJson.charAt(i + 1) == ']')) {
                        break;
                    }
                    indent++;
                    sb.append("\n").append("  ".repeat(indent));
                    break;
                case '}':
                case ']':
                    if (i > 0 && (compactJson.charAt(i - 1) == '{' || compactJson.charAt(i - 1) == '[')) {
                        sb.append(c); // حالة {} أو [] فاضية
                    } else {
                        indent--;
                        sb.append("\n").append("  ".repeat(Math.max(indent, 0))).append(c);
                    }
                    break;
                case ',':
                    sb.append(c).append("\n").append("  ".repeat(indent));
                    break;
                case ':':
                    sb.append(": ");
                    break;
                default:
                    sb.append(c);
            }
        }
        return sb.toString();
    }


    // ================================================================
    // القسم الأول: تصدير شجرة Python
    // (بنية موحّدة: كل عقدة عندها nodeName + lineno + children فقط،
    // فالتصدير هون بسيط ومباشر لأنه لا يوجد تنوع بالكلاسات)
    // ================================================================
    public static String pythonAstToJson(ProgramNode program) {
        StringBuilder sb = new StringBuilder();
        pythonNodeToJson(program, sb);
        return prettyPrintJson(sb.toString());
    }

    private static void pythonNodeToJson(ASTNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("null");
            return;
        }
        sb.append("{");
        sb.append("\"type\":\"").append(escape(node.getNodeName())).append("\",");
        sb.append("\"line\":").append(node.getLineno() == null ? "null" : node.getLineno()).append(",");
        sb.append("\"children\":[");
        List<ASTNode> children = node.getChildren();
        for (int i = 0; i < children.size(); i++) {
            pythonNodeToJson(children.get(i), sb);
            if (i < children.size() - 1) sb.append(",");
        }
        sb.append("]}");
    }

    // ================================================================
    // القسم الثاني: تصدير شجرة Jinja
    // (بنية غير موحّدة: كل نوع عقدة عنده حقول مختلفة، فبنفحص النوع
    // بـ instanceof — نفس أسلوب printNode بـ MainJinja بالظبط)
    // ================================================================
    public static String jinjaAstToJson(Program program) {
        StringBuilder sb = new StringBuilder();
        jinjaNodeToJson(program, sb);
        return prettyPrintJson(sb.toString());
    }

    // ================================================================
    // تعديل: HTML_TEXT بالـ Lexer بتلقط أي مسافة/سطر جديد بين الوسوم
    // كعقدة HtmlText منفصلة (سلوك طبيعي لأي محلل HTML، حتى المتصفحات
    // بتعمل نفس الشي بالـ DOM). بالتصدير لـ JSON فقط (مش بالشجرة
    // الحقيقية بالذاكرة، ومش بالطباعة التشخيصية printNode)، صرنا
    // نتجاهل عقد HtmlText يلي محتواها مسافات/أسطر فاضية بس، عشان
    // ast_jinja.json يبين أنضف ويركّز على العقد المهمة فعليًا.
    // ================================================================
    private static boolean isBlankHtmlText(Node node) {
        return node instanceof HtmlText t && t.getText() != null && t.getText().isBlank();
    }

    private static void writeNodeList(StringBuilder sb, List<Node> list) {
        List<Node> filtered = new java.util.ArrayList<>();
        for (Node n : list) {
            if (!isBlankHtmlText(n)) filtered.add(n);
        }
        for (int i = 0; i < filtered.size(); i++) {
            jinjaNodeToJson(filtered.get(i), sb);
            if (i < filtered.size() - 1) sb.append(",");
        }
    }

    private static void jinjaNodeToJson(Node node, StringBuilder sb) {
        if (node == null) {
            sb.append("null");
            return;
        }

        if (node instanceof Program p) {
            sb.append("{");
            field(sb, "type", "Program");
            sb.append(",\"line\":").append(node.getLine()).append(",");
            sb.append("\"children\":[");
            writeNodeList(sb, p.getNodes());
            sb.append("]}");

        } else if (node instanceof HtmlElement el) {
            sb.append("{");
            field(sb, "type", "HtmlElement");
            sb.append(",");
            field(sb, "tag", el.getTagName());
            sb.append(",\"line\":").append(node.getLine()).append(",");
            sb.append("\"children\":[");
            writeNodeList(sb, el.getChildren());
            sb.append("]}");

        } else if (node instanceof HtmlText t) {
            sb.append("{");
            field(sb, "type", "HtmlText");
            sb.append(",");
            field(sb, "text", t.getText());
            sb.append(",\"line\":").append(node.getLine()).append("}");

        } else if (node instanceof HtmlDoctype d) {
            sb.append("{");
            field(sb, "type", "HtmlDoctype");
            sb.append(",");
            field(sb, "value", d.getValue());
            sb.append(",\"line\":").append(node.getLine()).append("}");

        } else if (node instanceof HtmlComment c) {
            sb.append("{");
            field(sb, "type", "HtmlComment");
            sb.append(",");
            field(sb, "comment", c.getComment());
            sb.append(",\"line\":").append(node.getLine()).append("}");

        } else if (node instanceof JinjaExpression je) {
            sb.append("{");
            field(sb, "type", "JinjaExpression");
            sb.append(",");
            field(sb, "expr", safeToString(je.getExpr()));
            sb.append(",\"line\":").append(node.getLine()).append("}");

        } else if (node instanceof IfStmt ifs) {
            sb.append("{");
            field(sb, "type", "IfStmt");
            sb.append(",");
            field(sb, "condition", safeToString(ifs.getCondition()));
            sb.append(",\"line\":").append(node.getLine()).append(",");
            sb.append("\"then\":[");
            writeNodeList(sb, ifs.getThenBranch());
            sb.append("],");
            sb.append("\"elif\":[");
            List<ElifStmt> elifs = ifs.getElifBlocks();
            for (int i = 0; i < elifs.size(); i++) {
                ElifStmt e = elifs.get(i);
                sb.append("{");
                field(sb, "condition", safeToString(e.getCondition()));
                sb.append(",\"body\":[");
                writeNodeList(sb, e.getBody());
                sb.append("]}");
                if (i < elifs.size() - 1) sb.append(",");
            }
            sb.append("],");
            sb.append("\"else\":");
            if (ifs.getElseBlock() != null) {
                sb.append("[");
                writeNodeList(sb, ifs.getElseBlock().getBody());
                sb.append("]");
            } else {
                sb.append("null");
            }
            sb.append("}");

        } else if (node instanceof ForStmt fs) {
            sb.append("{");
            field(sb, "type", "ForStmt");
            sb.append(",");
            field(sb, "var", fs.getVar());
            sb.append(",");
            field(sb, "iterable", safeToString(fs.getIterable()));
            sb.append(",\"line\":").append(node.getLine()).append(",");
            sb.append("\"body\":[");
            writeNodeList(sb, fs.getBody());
            sb.append("]}");

        } else if (node instanceof SetStmt ss) {
            sb.append("{");
            field(sb, "type", "SetStmt");
            sb.append(",");
            field(sb, "var", ss.getVar());
            sb.append(",");
            field(sb, "value", safeToString(ss.getValue()));
            sb.append(",\"line\":").append(node.getLine()).append("}");

        } else {
            // fallback عام لأي نوع عقدة غير متوقع (BreakStmt, ContinueStmt...)
            sb.append("{");
            field(sb, "type", node.getClass().getSimpleName());
            sb.append(",\"line\":").append(node.getLine()).append("}");
        }
    }

    // ================= Helpers =================

    private static void field(StringBuilder sb, String key, String value) {
        sb.append("\"").append(key).append("\":\"").append(escape(value)).append("\"");
    }

    private static String safeToString(Object o) {
        return o == null ? "" : o.toString();
    }

    private static String escape(String s) {
        if (s == null) return "";
        return s.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", " ")
                .replace("\r", "");
    }
}