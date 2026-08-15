package app.Integration;



import AST.JinjaAST.Program;
import AST.PaythonAST.ProgramNode;
import DataBridge.DataBridge;
import Grammer.JinjaAntlr.Grammer.JinjaAntlr.JinjaLexer;
import Grammer.JinjaAntlr.Grammer.JinjaAntlr.JinjaParser;
import Grammer.PaythonGrammer.PyFlaskLexer;
import Grammer.PaythonGrammer.PyFlaskParser;
import Integrator.OutputManager;
import Visitor.PaythonVisitor.ASTBuilder;
import Visitor.jinjaVisitor.ASTBuilderVisitor;
import Visitor.jinjaVisitor.JinjaEvaluator;
import Visitor.jinjaVisitor.RenderContext;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;
import java.util.Map;

/**
 * ===============================================================
 * التكامل الكامل والحقيقي — من ملف Python الفعلي لحد output/
 * ===============================================================
 *
 * بعكس النسخة السابقة (يلي كانت تستخدم بيانات وهمية Mock)، هاد
 * الإصدار بيمشي على المسار الحقيقي بالكامل:
 *
 *   flask_app.py → Python AST → DataBridge → Context Data الحقيقية
 *        → Jinja AST → JinjaEvaluator → HTML نهائي حقيقي → output/
 *
 * صفر بيانات وهمية. كل قيمة بالـ HTML النهائي جايّة فعليًا من
 * flask_app.py عبر DataBridge.
 */
public class MainIntegration {

    public static void main(String[] args) throws Exception {

        OutputManager outputManager = new OutputManager();
        outputManager.prepareStructure();

        // ============================================================
        // 1. تحليل flask_app.py الحقيقي واستخراج المنتجات عبر DataBridge
        //    ⚠ تأكدي إنه المسار مطابق لمكان ملفك الفعلي
        // ============================================================
        ProgramNode pythonAst = parsePythonFile("Input/flask_app.py");
        List<Map<String, Object>> products = DataBridge.extractProducts(pythonAst);
        double avgPrice = DataBridge.computeAveragePrice(products);

        System.out.println("=== DataBridge: بيانات حقيقية مستخرجة ===");
        System.out.println("  عدد المنتجات: " + products.size());
        System.out.println("  متوسط السعر: " + avgPrice);

        // ============================================================
        // 2. توليد صفحة index.html (home) — بيانات حقيقية 100%
        // ============================================================
        Program indexAst = parseJinjaFile("Input/templates/Index.html");
        RenderContext homeContext = RenderContext.forHome(products, avgPrice);
        String indexHtml = new JinjaEvaluator(homeContext).render(indexAst);
        outputManager.writeGeneratedPage("Index.html", indexHtml);

        // ============================================================
        // 3. توليد صفحة products.html (show_products) — بيانات حقيقية
        // ============================================================
        Program productsAst = parseJinjaFile("Input/templates/products.html");
        RenderContext productsContext = RenderContext.forProducts(products);
        String productsHtml = new JinjaEvaluator(productsContext).render(productsAst);
        outputManager.writeGeneratedPage("products.html", productsHtml);

        // ============================================================
        // 4. توليد صفحة product_detail.html — لمنتج حقيقي واحد (id=1 مثلاً)
        // ============================================================
        Map<String, Object> firstProduct = DataBridge.findById(products, 1);
        if (firstProduct != null) {
            Program detailAst = parseJinjaFile("Input/templates/product_detail.html");
            RenderContext detailContext = RenderContext.forProductDetail(firstProduct);
            String detailHtml = new JinjaEvaluator(detailContext).render(detailAst);
            outputManager.writeGeneratedPage("product_detail.html", detailHtml);
        }

        // ============================================================
        // 5. توليد صفحة add_product.html (فورم ثابت، بدون بيانات)
        // ============================================================
        Program addProductAst = parseJinjaFile("Input/templates/add_product.html");
        String addProductHtml = new JinjaEvaluator(new RenderContext()).render(addProductAst);
        outputManager.writeGeneratedPage("add_product.html", addProductHtml);

        // ============================================================
        // 6. توليد صفحة search.html — بحث حقيقي بكلمة تجريبية "lap"
        // ============================================================
        String keyword = "lap";
        List<Map<String, Object>> searchResults = DataBridge.searchByKeyword(products, keyword);
        Program searchAst = parseJinjaFile("Input/templates/search.html");
        RenderContext searchContext = RenderContext.forSearch(keyword, searchResults);
        String searchHtml = new JinjaEvaluator(searchContext).render(searchAst);
        outputManager.writeGeneratedPage("search.html", searchHtml);

        // ============================================================
        // 7. نسخ الملفات المرافقة كما هي (بدون أي معالجة - حسب الدكتور)
        //    ⚠ تأكدي من المسارات حسب مكان ملفاتك الفعلي
        // ============================================================
        outputManager.copySupportingFile("Input/flask_app.py", "app.py");
        outputManager.copySupportingFile("Input/static/css/style.css", "style.css");
        // outputManager.copySupportingFile("src/Input/static/js/script.js", "script.js"); // اختياري

        // ============================================================
        // 8. سجل التوليد (generation_log.txt) بمجلد compiler_output/
        // ============================================================
        StringBuilder log = new StringBuilder();
        log.append("[").append(java.time.LocalDateTime.now()).append("] بدء عملية التوليد\n");
        log.append("[").append(java.time.LocalDateTime.now()).append("] DataBridge: تم استخراج ")
                .append(products.size()).append(" منتج من flask_app.py\n");
        log.append("[").append(java.time.LocalDateTime.now()).append("] تم توليد: index.html\n");
        log.append("[").append(java.time.LocalDateTime.now()).append("] تم توليد: products.html\n");
        log.append("[").append(java.time.LocalDateTime.now()).append("] تم توليد: product_detail.html\n");
        log.append("[").append(java.time.LocalDateTime.now()).append("] تم توليد: add_product.html\n");
        log.append("[").append(java.time.LocalDateTime.now()).append("] تم توليد: search.html (بحث تجريبي: \"")
                .append(keyword).append("\")\n");
        log.append("[").append(java.time.LocalDateTime.now()).append("] تم نسخ: app.py, style.css كما هي\n");
        outputManager.writeCompilerArtifact("generation_log.txt", log.toString());

        System.out.println("\n✔ التكامل اكتمل بنجاح. راجعي مجلدي output/ و compiler_output/");
    }

    // ================= Helpers =================

    private static ProgramNode parsePythonFile(String filename) throws Exception {
        CharStream cs = CharStreams.fromFileName(filename);
        PyFlaskLexer lexer = new PyFlaskLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PyFlaskParser parser = new PyFlaskParser(tokens);
        ParseTree tree = parser.program(); // ⚠ عدّلي اسم القاعدة لو مختلف عندك
        ASTBuilder builder = new ASTBuilder();
        return (ProgramNode) builder.visit(tree);
    }

    private static Program parseJinjaFile(String filename) throws Exception {
        CharStream cs = CharStreams.fromFileName(filename);
        JinjaLexer lexer = new JinjaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JinjaParser parser = new JinjaParser(tokens);
        ParseTree tree = parser.document();
        ASTBuilderVisitor visitor = new ASTBuilderVisitor();
        return (Program) visitor.visit(tree);
    }
}