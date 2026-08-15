package DataBridge;

import AST.PaythonAST.*;

import java.util.*;

/**
 * ===============================================================
 * DataBridge — عضو 1 (Data Bridge)
 * ===============================================================
 *
 * يمشي على شجرة Python الحقيقية (ProgramNode)، يلاقي المتغير العام
 * "products"، ويحوّله فعليًا إلى List<Map<String,Object>> — نفس
 * الشكل بالضبط يلي RenderContext.forHome/forProducts/... محتاجينه.
 *
 * تعديل: بعد ما صار ASTBuilder.visitDictLiteralNode/visitListLiteralNode
 * يستخدموا الكلاسات الحقيقية DictNode/ListNode/DictEntryNode، صرنا
 * نتعامل معهم هون بـ instanceof نوعي وواضح، بدل تحليل نصوص هش
 * (كان الحل المؤقت السابق). القيم الخام (أرقام/نصوص) لسا معتمدة
 * على نفس أسلوب الترميز النصي المستخدم بباقي المشروع كله
 * (مثال: "Var: x", "Number: 100") — هاد الجزء ما تغيّر لأنه أعمق
 * وأوسع من نطاق DataBridge (نفس النمط مستخدم بالـ SymbolTableBuilder
 * وغيرها)، ومش له علاقة بمشكلة Dict/List تحديدًا.
 */
public class DataBridge {

    /**
     * يستخرج قائمة المنتجات كاملة من شجرة Python.
     * بيدور على: products = [ {...}, {...} ]  بالمستوى العام.
     */
    public static List<Map<String, Object>> extractProducts(ProgramNode program) {
        for (ASTNode child : program.getChildren()) {
            if (child instanceof AssignmentNode assign) {
                ASTNode left = assign.getLeft();
                if (left != null && "Var: products".equals(left.getNodeName())) {
                    ASTNode right = assign.getRight();
                    if (right instanceof ListNode list) {
                        return convertListNode(list);
                    }
                    System.err.println("⚠ DataBridge: 'products' موجود بس مش ListNode (النوع: "
                            + right.getClass().getSimpleName() + ")");
                    return new ArrayList<>();
                }
            }
        }
        System.err.println("⚠ DataBridge: لم يتم العثور على متغير 'products' بالمستوى العام.");
        return new ArrayList<>();
    }

    /** يحسب متوسط السعر (نفس منطق avg_price بـ app.py، محسوب بجافا بدل تفسير الحلقة). */
    public static double computeAveragePrice(List<Map<String, Object>> products) {
        if (products.isEmpty()) return 0;
        double total = 0;
        for (Map<String, Object> p : products) {
            Object price = p.get("price");
            if (price instanceof Number n) total += n.doubleValue();
        }
        return total / products.size();
    }

    /** يلاقي منتج واحد بالـ id — يلزم صفحة product_detail. */
    public static Map<String, Object> findById(List<Map<String, Object>> products, int id) {
        for (Map<String, Object> p : products) {
            Object pid = p.get("id");
            if (pid instanceof Number n && n.intValue() == id) return p;
        }
        return null;
    }

    /** يفلتر المنتجات بكلمة بحث — يلزم صفحة search. */
    public static List<Map<String, Object>> searchByKeyword(List<Map<String, Object>> products, String keyword) {
        List<Map<String, Object>> results = new ArrayList<>();
        if (keyword == null || keyword.isBlank()) return results;
        String lower = keyword.toLowerCase();
        for (Map<String, Object> p : products) {
            Object name = p.get("name");
            if (name != null && name.toString().toLowerCase().contains(lower)) {
                results.add(p);
            }
        }
        return results;
    }

    // ================= Helpers داخلية =================

    private static List<Map<String, Object>> convertListNode(ListNode listNode) {
        List<Map<String, Object>> result = new ArrayList<>();
        for (ASTNode item : listNode.getChildren()) {
            if (item instanceof DictNode dict) {
                result.add(convertDictNode(dict));
            } else {
                System.err.println("⚠ DataBridge: عنصر بالقائمة مش DictNode (النوع: "
                        + item.getClass().getSimpleName() + ") — تم تجاهله.");
            }
        }
        return result;
    }

    private static Map<String, Object> convertDictNode(DictNode dictNode) {
        Map<String, Object> map = new LinkedHashMap<>();
        for (ASTNode child : dictNode.getChildren()) {
            if (child instanceof DictEntryNode entry) {
                map.put(entry.getKey(), parseLiteral(entry.getValue()));
            }
        }
        return map;
    }

    /**
     * القيم الخام (أرقام/نصوص/بوليان) لسا جايّة كعقد ASTNode عامة
     * بأسماء نصية مشفّرة (مثال: "Number: 100", "String: \"Phone\"")،
     * بنفس أسلوب باقي المشروع بأكمله (زي "Var: " بالمتغيرات). هاد
     * جزء أعمق من موضوع Dict/List ومنفصل عنه، فخلّيناه كما هو.
     */
    private static Object parseLiteral(ASTNode node) {
        if (node == null) return null;
        String name = node.getNodeName();

        if (name.startsWith("Number: ")) {
            String raw = name.substring(8);
            try {
                if (raw.contains(".")) return Double.parseDouble(raw);
                return Integer.parseInt(raw);
            } catch (NumberFormatException e) {
                return raw;
            }
        }
        if (name.startsWith("String: ")) {
            String raw = name.substring(8);
            if (raw.length() >= 2 && raw.startsWith("\"") && raw.endsWith("\"")) {
                raw = raw.substring(1, raw.length() - 1);
            }
            return raw;
        }
        if (name.equals("Boolean: True")) return true;
        if (name.equals("Boolean: False")) return false;
        if (name.equals("Literal: None")) return null;

        return name; // fallback، ما لازم يوصلها بالحالة الطبيعية
    }
}