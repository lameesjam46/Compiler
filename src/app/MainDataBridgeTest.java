package app;

import AST.PaythonAST.ProgramNode;
import DataBridge.DataBridge;
import Grammer.PaythonGrammer.PyFlaskLexer;
import Grammer.PaythonGrammer.PyFlaskParser;
import Visitor.PaythonVisitor.ASTBuilder;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;
import java.util.Map;

/**
 * اختبار مستقل ومباشر لـ DataBridge — بيقرا flask_app.py الحقيقي،
 * يبني شجرة Python، وبيطبع نتيجة كل دالة بـ DataBridge بالتيرمينال،
 * عشان نتأكد بالعين المجردة إنه البيانات المستخرجة صحيحة ومطابقة
 * لمحتوى الملف الأصلي.
 */
public class MainDataBridgeTest {

    public static void main(String[] args) throws Exception {

        // ============================================================
        // 1. تحليل flask_app.py الحقيقي لشجرة AST
        //    ⚠ عدّلي المسار هون ليطابق مكان ملفك الفعلي بالمشروع
        // ============================================================
        String filename = "src/Input/flask_app.py";
        CharStream cs = CharStreams.fromFileName(filename);
        PyFlaskLexer lexer = new PyFlaskLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PyFlaskParser parser = new PyFlaskParser(tokens);
        ParseTree tree = parser.program();

        ASTBuilder builder = new ASTBuilder();
        ProgramNode program = (ProgramNode) builder.visit(tree);

        // ============================================================
        // 2. اختبار extractProducts() — لازم يطلع منتجين (Phone, Laptop)
        // ============================================================
        System.out.println("==============================================");
        System.out.println("   Test 1: extractProducts()                 ");
        System.out.println("==============================================");
        List<Map<String, Object>> products = DataBridge.extractProducts(program);
        System.out.println("عدد المنتجات المستخرجة: " + products.size());
        for (Map<String, Object> p : products) {
            System.out.println("  " + p);
        }

        // ============================================================
        // 3. اختبار computeAveragePrice() — لازم يطلع (100+500)/2 = 300.0
        // ============================================================
        System.out.println("\n==============================================");
        System.out.println("   Test 2: computeAveragePrice()              ");
        System.out.println("==============================================");
        double avg = DataBridge.computeAveragePrice(products);
        System.out.println("متوسط السعر: " + avg + " (المتوقع: 300.0)");

        // ============================================================
        // 4. اختبار findById() — لازم يطلع منتج الـ Laptop (id=2)
        // ============================================================
        System.out.println("\n==============================================");
        System.out.println("   Test 3: findById(2)                        ");
        System.out.println("==============================================");
        Map<String, Object> found = DataBridge.findById(products, 2);
        System.out.println("النتيجة: " + found);

        // اختبار حالة غير موجودة (لازم يطلع null)
        Map<String, Object> notFound = DataBridge.findById(products, 999);
        System.out.println("id=999 (متوقع null): " + notFound);

        // ============================================================
        // 5. اختبار searchByKeyword() — بحث بكلمة "lap" لازم يلاقي Laptop
        // ============================================================
        System.out.println("\n==============================================");
        System.out.println("   Test 4: searchByKeyword(\"lap\")             ");
        System.out.println("==============================================");
        List<Map<String, Object>> searchResults = DataBridge.searchByKeyword(products, "lap");
        System.out.println("عدد النتائج: " + searchResults.size());
        for (Map<String, Object> p : searchResults) {
            System.out.println("  " + p);
        }

        // بحث بكلمة مش موجودة — لازم يطلع فاضي
        List<Map<String, Object>> emptySearch = DataBridge.searchByKeyword(products, "xyz123");
        System.out.println("بحث 'xyz123' (متوقع فاضي): " + emptySearch);
    }
}