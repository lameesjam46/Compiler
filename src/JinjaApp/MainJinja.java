package JinjaApp;

import JinjaAST.ASTNode;
import JinjaGrammer.JinjaLexer;
import JinjaGrammer.JinjaParser;
import JinjaVisitor.JinjaASTBuilder;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class MainJinja {
    public static void main(String[] args) {
        try {

            // 1️⃣ التحقق من وجود ملف الإدخال
//            if (args.length == 0) {
//                System.err.println("Usage: java MainJinja <template_file>");
//                return;
//            }

            String inputFile = "src/Input/display.html";

            // 2️⃣ قراءة الملف
            CharStream input = CharStreams.fromFileName(inputFile);

            // 3️⃣ إنشاء Lexer
            JinjaLexer lexer = new JinjaLexer(input);

            // 4️⃣ تحويل التوكنات إلى Stream
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // 5️⃣ إنشاء Parser
            JinjaParser parser = new JinjaParser(tokens);

            // 6️⃣ استدعاء قاعدة البداية (start rule)
            ParseTree tree = parser.document();


            // 7️⃣ بناء الـ AST باستخدام Visitor
            JinjaASTBuilder builder = new JinjaASTBuilder();
            ASTNode ast = builder.visit(tree);

            // 8️⃣ طباعة نتيجة الـ AST
            System.out.println("======= JINJA AST =======");
            printAST(ast, 0);

        } catch (IOException e) {
            System.err.println("File error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Compiler error:");
            e.printStackTrace();
        }
    }

    // 🟢 دالة مساعدة لطباعة الشجرة بشكل هرمي
    private static void printAST(ASTNode node, int indent) {
        if (node == null) return;

        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }
        System.out.println(node);

        try {
            var childrenField = node.getClass().getDeclaredField("children");
            childrenField.setAccessible(true);
            var children = (Iterable<?>) childrenField.get(node);

            if (children != null) {
                for (Object child : children) {
                    printAST((ASTNode) child, indent + 1);
                }
            }
        } catch (NoSuchFieldException | IllegalAccessException ignored) {
            // العقد التي لا تحتوي children يتم تجاهلها
        }
    }

}
