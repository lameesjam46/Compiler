package Visitor.jinjaVisitor;

import java.util.*;

/**
 * ===============================================================
 * عقد البيانات الرسمي بين عضو 1 (Data Bridge) وعضو 3 (Jinja Renderer)
 * ===============================================================
 *
 * هاد الكلاس هو "الصندوق" يلي عضو 1 لازم يعبّيه بالبيانات الحقيقية
 * (المستخرجة من AST تبع Python)، وبعدين يسلّمه لـ JinjaEvaluator
 * عشان يولّد صفحات HTML نهائية وصافية (بدون أي {{ }} أو {% %}).
 *
 * التزام عضو 1 بالضبط بهالأسماء والأشكال يضمن التوافق 100% مع
 * templates الموجودة فعليًا (index.html, products.html, ...),
 * لأنها مطابقة لنفس الأسماء المستخدمة داخلها.
 */
public class RenderContext {

    private final Map<String, Object> variables = new HashMap<>();

    public void set(String name, Object value) {
        variables.put(name, value);
    }

    public Object get(String name) {
        return variables.get(name);
    }

    public boolean has(String name) {
        return variables.containsKey(name);
    }

    public Map<String, Object> asMap() {
        return variables;
    }

    // ================================================================
    // مصانع جاهزة (Factory Methods) لكل صفحة — هاي التوقيعات بالضبط
    // يلي عضو 1 لازم يبنيها ويستدعيها. كل منتج لازم يكون
    // Map<String, Object> فيه المفاتيح: id, name, price, details, image
    // ================================================================

    /** لصفحة home (index.html): products + avg_price */
    public static RenderContext forHome(List<Map<String, Object>> products, double avgPrice) {
        RenderContext ctx = new RenderContext();
        ctx.set("products", products);
        ctx.set("avg_price", avgPrice);
        return ctx;
    }

    /** لصفحة show_products (products.html): products + count */
    public static RenderContext forProducts(List<Map<String, Object>> products) {
        RenderContext ctx = new RenderContext();
        ctx.set("products", products);
        ctx.set("count", products.size());
        return ctx;
    }

    /** لصفحة product_detail (product_detail.html): product واحد فقط */
    public static RenderContext forProductDetail(Map<String, Object> product) {
        RenderContext ctx = new RenderContext();
        ctx.set("product", product);
        return ctx;
    }

    /** لصفحة search (search.html): keyword + results (ممكن تكون فاضية) */
    public static RenderContext forSearch(String keyword, List<Map<String, Object>> results) {
        RenderContext ctx = new RenderContext();
        ctx.set("keyword", keyword);
        ctx.set("results", results);
        return ctx;
    }
}