package Integrator;

import AST.JinjaAST.Program;
import AST.PaythonAST.ProgramNode;
import DataBridge.DataBridge;
import Grammer.JinjaAntlr.Grammer.JinjaAntlr.JinjaLexer;
import Grammer.JinjaAntlr.Grammer.JinjaAntlr.JinjaParser;
import Grammer.PaythonGrammer.PyFlaskLexer;
import Grammer.PaythonGrammer.PyFlaskParser;
import SemanticAnalyzer.FlaskSemanticAnalyzer;
import SymbolTable.SymbolFlask.Scope;
import SymbolTable.SymbolFlask.SymbolTableBuilder;
import SymbolTable.SymbolTablejinja.SymbolTable;
import SymbolTable.SymbolTablejinja.SemanticAnalyzer;
import Visitor.PaythonVisitor.ASTBuilder;
import Visitor.jinjaVisitor.ASTBuilderVisitor;
import Visitor.jinjaVisitor.JinjaEvaluator;
import Visitor.jinjaVisitor.RenderContext;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ===============================================================
 * MainIntegration — التكامل الكامل والنهائي (عضو 5 - Integrator)
 * ===============================================================
 *
 * يمشي على المسار الكامل حسب مخطط الدكتورة بالضبط:
 *
 *   flask_app.py → Python AST → Semantic Analysis → DataBridge
 *        → Context Data → Jinja AST → JinjaEvaluator → HTML نهائي
 *
 * وبالتوازي، يصدّر كل نواتج التحليل والتوليد لمجلد compiler_output/:
 *   ast_python.json, ast_jinja.json, semantic_report.txt, generation_log.txt
 *
 * وينسخ الملفات المرافقة (app.py, style.css, script.js) كما هي لمجلد output/.
 *
 * ============================================================
 * تعديل: فصلنا منطق التوليد بالكامل من main() لميثود عامة اسمها
 * generate() — نفس المنطق بالضبط، بدون أي تغيير، بس صار قابل
 * للاستدعاء المتكرر من أي مكان تاني بالمشروع (تحديدًا من
 * AutoRegenerateWatcher، اللي بيراقب flask_app.py وبينادي عليها
 * تلقائيًا كل ما يصير تعديل وحفظ على الملف).
 * ============================================================
 */
public class MainIntegration {

    public static void main(String[] args) throws Exception {
        generate();
    }

    /**
     * الميثود الأساسية يلي بتنفذ دورة التوليد الكاملة مرة وحدة —
     * من قراءة flask_app.py لحد كتابة output/ و compiler_output/.
     * قابلة للاستدعاء أكتر من مرة (كل استدعاء = إعادة توليد كاملة
     * بأحدث بيانات من flask_app.py وقت الاستدعاء).
     */
    public static void generate() throws Exception {

        System.out.println("Working Directory: " + System.getProperty("user.dir"));

        OutputManager outputManager = new OutputManager();
        outputManager.prepareStructure();

        StringBuilder log = new StringBuilder();
        log.append("[").append(java.time.LocalDateTime.now()).append("] بدء عملية التوليد\n");

        // ============================================================
        // 1. تحليل flask_app.py: AST → Symbol Table → Semantic Analysis
        // ============================================================
        String pythonFile = "Input/flask_app.py"; // ⚠ تأكدي من المسار عندك
        ProgramNode pythonAst = parsePythonFile(pythonFile);

        SymbolTableBuilder symBuilder = new SymbolTableBuilder();
        Scope globalScope = symBuilder.build(pythonAst);

        FlaskSemanticAnalyzer pythonAnalyzer = new FlaskSemanticAnalyzer();
        pythonAnalyzer.check(pythonAst, globalScope);
        List<String> pythonErrors = pythonAnalyzer.getErrors();

        log.append("[").append(java.time.LocalDateTime.now()).append("] تحليل Python: ")
                .append(pythonErrors.size()).append(" خطأ دلالي\n");

        // ============================================================
        // 2. استخراج بيانات حقيقية عبر DataBridge (Context Data)
        // ============================================================
        List<Map<String, Object>> products = DataBridge.extractProducts(pythonAst);
        double avgPrice = DataBridge.computeAveragePrice(products);

        System.out.println("=== DataBridge: بيانات حقيقية مستخرجة ===");
        System.out.println("  عدد المنتجات: " + products.size());
        System.out.println("  متوسط السعر: " + avgPrice);

        log.append("[").append(java.time.LocalDateTime.now()).append("] DataBridge: تم استخراج ")
                .append(products.size()).append(" منتج من flask_app.py\n");

        // ============================================================
        // 3. توليد صفحة index.html (home) + تحليل دلالي لشجرتها
        // ============================================================
        Program indexAst = parseJinjaFile("Input/templates/index.html");
        List<String> jinjaErrorsAll = new ArrayList<>();
        jinjaErrorsAll.addAll(analyzeJinja(indexAst));

        RenderContext homeContext = RenderContext.forHome(products, avgPrice);
        String indexHtml = new JinjaEvaluator(homeContext).render(indexAst);
        outputManager.writeGeneratedPage("index.html", indexHtml);
        log.append("[").append(java.time.LocalDateTime.now()).append("] تم توليد: index.html\n");

        // ============================================================
        // 4. توليد صفحة products.html (show_products)
        // ============================================================
        Program productsAst = parseJinjaFile("Input/templates/products.html");
        jinjaErrorsAll.addAll(analyzeJinja(productsAst));

        RenderContext productsContext = RenderContext.forProducts(products);
        String productsHtml = new JinjaEvaluator(productsContext).render(productsAst);
        outputManager.writeGeneratedPage("products.html", productsHtml);
        log.append("[").append(java.time.LocalDateTime.now()).append("] تم توليد: products.html\n");

        // ============================================================
        // 5. توليد صفحة product_detail لكل منتج على حدة
        // ============================================================
        Program detailAst = parseJinjaFile("Input/templates/product_detail.html");
        jinjaErrorsAll.addAll(analyzeJinja(detailAst));

        for (Map<String, Object> product : products) {
            RenderContext detailContext = RenderContext.forProductDetail(product);
            String detailHtml = new JinjaEvaluator(detailContext).render(detailAst);
            String fileName = LinkRewriter.productDetailFileName(product.get("id"));
            outputManager.writeGeneratedPage(fileName, detailHtml);
            log.append("[").append(java.time.LocalDateTime.now()).append("] تم توليد: ").append(fileName).append("\n");
        }

        // ============================================================
        // 6. توليد صفحة add_product.html (فورم ثابت، بدون بيانات)
        // ============================================================
        Program addProductAst = parseJinjaFile("Input/templates/add_product.html");
        jinjaErrorsAll.addAll(analyzeJinja(addProductAst));

        String addProductHtml = new JinjaEvaluator(new RenderContext()).render(addProductAst);
        outputManager.writeGeneratedPage("add_product.html", addProductHtml);
        log.append("[").append(java.time.LocalDateTime.now()).append("] تم توليد: add_product.html\n");

        // ============================================================
        // 7. توليد صفحة search.html — بحث JavaScript لحظي (بدون سيرفر)
        // ============================================================
        Program searchAst = parseJinjaFile("Input/templates/search.html");
        jinjaErrorsAll.addAll(analyzeJinja(searchAst));

        RenderContext searchContext = RenderContext.forProducts(products);
        String searchHtml = new JinjaEvaluator(searchContext).render(searchAst);
        outputManager.writeGeneratedPage("search.html", searchHtml);
        log.append("[").append(java.time.LocalDateTime.now())
                .append("] تم توليد: search.html (بحث JavaScript لحظي، ")
                .append(products.size()).append(" منتج مضمّن)\n");

        // ============================================================
        // 8. نسخ الملفات المرافقة كما هي (بدون أي معالجة - حسب الدكتورة)
        // ============================================================
        outputManager.copySupportingFile("Input/flask_app.py", "app.py");
        outputManager.copySupportingFile("Input/static/css/style.css", "style.css");
        outputManager.copySupportingFile("Input/static/js/script.js", "script.js");
        log.append("[").append(java.time.LocalDateTime.now()).append("] تم نسخ: app.py, style.css, script.js كما هي\n");

        // ============================================================
        // 9. تصدير compiler_output/: ast_python.json, ast_jinja.json,
        //    semantic_report.txt, generation_log.txt
        // ============================================================
        String pythonJson = AstJsonExporter.pythonAstToJson(pythonAst);
        outputManager.writeCompilerArtifact("ast_python.json", pythonJson);

        String jinjaJson = AstJsonExporter.jinjaAstToJson(indexAst);
        outputManager.writeCompilerArtifact("ast_jinja.json", jinjaJson);

        String report = SemanticReportWriter.buildReport(pythonErrors, jinjaErrorsAll);
        outputManager.writeCompilerArtifact("semantic_report.txt", report);

        log.append("[").append(java.time.LocalDateTime.now()).append("] تم تصدير: ast_python.json, ast_jinja.json, semantic_report.txt\n");
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

    private static List<String> analyzeJinja(Program jinjaAst) {
        SymbolTable symbolTable = new SymbolTable();
        SemanticAnalyzer analyzer = new SemanticAnalyzer(symbolTable);
        analyzer.analyze(jinjaAst);
        return analyzer.getErrors();
    }
}