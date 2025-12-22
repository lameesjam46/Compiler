package app;

import AST.*;
import Grammer.PyFlaskLexer;
import Grammer.PyFlaskParser;
import Visitor.ASTBuilder;
import org.antlr.v4.runtime.*;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        String path = "src/Input/flask_app.py";
        CharStream cs = CharStreams.fromFileName(path);

        PyFlaskLexer lexer = new PyFlaskLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PyFlaskParser parser = new PyFlaskParser(tokens);

        // إزالة مستمعي الأخطاء الافتراضيين وإضافة مستمع الكونسول
        parser.removeErrorListeners();
        parser.addErrorListener(ConsoleErrorListener.INSTANCE);

        // بناء الشجرة من البداية (program)
        PyFlaskParser.ProgramContext tree = parser.program();

        ASTBuilder builder = new ASTBuilder();
        ProgramNode prog = (ProgramNode) builder.visit(tree);

        // ربط الـ Routes بالدوال التابعة لها
        linkRoutesToFunctions(prog);

        // طباعة الشجرة بنمط محسن
        System.out.println("=== Abstract Syntax Tree Structure ===");
        prettyPrint(prog, "", true);
    }

    /**
     * منطق محسن للربط: بما أن الـ RouteNode تمت إضافته كـ Child داخل الـ FunctionNode
     */
    private static void linkRoutesToFunctions(ProgramNode prog) {
        for (ASTNode node : prog.getChildren()) {
            if (node instanceof FunctionNode) {
                FunctionNode fn = (FunctionNode) node;
                for (ASTNode child : fn.getChildren()) {
                    if (child instanceof RouteNode) {
                        // تعيين اسم الدالة كـ handler للـ route
                        ((RouteNode) child).handlerName = fn.getName();
                    }
                }
            }
        }
    }

    /**
     * ميثود الطباعة الشجرية المحسنة باستخدام رموز ASCII
     */
    static void prettyPrint(ASTNode n, String prefix, boolean isLast) {
        // طباعة الرمز المناسب بناءً على موقع العقدة
        System.out.print(prefix + (isLast ? "└── " : "├── "));

        // طباعة نوع العقدة ورقم السطر
        System.out.print(n.getNodeName() + " (line=" + n.getLineno() + ")");

        // طباعة تفاصيل إضافية بجانب الاسم
        if (n instanceof ImportNode) {
            ImportNode in = (ImportNode) n;
            System.out.print(" -> module: " + in.getModule());
        } else if (n instanceof RouteNode) {
            RouteNode rn = (RouteNode) n;
            System.out.print(" -> path: " + rn.getPath() + " [handler: " + rn.getHandlerName() + "]");
        } else if (n instanceof FunctionNode) {
            FunctionNode fn = (FunctionNode) n;
            System.out.print(" -> name: " + fn.getName());
        } else if (n instanceof AssignmentNode) {
            AssignmentNode an = (AssignmentNode) n;
            System.out.print(" -> " + an.getLeft() + " = " + an.getRight());
        }

        System.out.println(); // سطر جديد بعد كل عقدة

        // تجهيز الـ prefix للأبناء
        String newPrefix = prefix + (isLast ? "    " : "│   ");

        List<ASTNode> children = n.getChildren();
        for (int i = 0; i < children.size(); i++) {
            prettyPrint(children.get(i), newPrefix, i == children.size() - 1);
        }
    }
}