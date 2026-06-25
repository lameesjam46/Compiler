 package APP.JinjaApp;

import AST.JinjaAST.*;
import Grammer.JinjaAntlr.Grammer.JinjaAntlr.JinjaLexer;
import Grammer.JinjaAntlr.Grammer.JinjaAntlr.JinjaParser;
import SymbolTable.SymbolTablejinja.SemanticAnalyzer;
import SymbolTable.SymbolTablejinja.SymbolTable;
import Visitor.jinjaVisitor.ASTBuilderVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class MainJinja {

    public static void main(String[] args) throws Exception {

        String filename = "src/Input/templates/add_product.html";
        CharStream cs = CharStreams.fromFileName(filename);
        JinjaLexer lexer = new JinjaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        JinjaParser parser = new JinjaParser(tokens);
        ParseTree tree = parser.document();

        ASTBuilderVisitor visitor = new ASTBuilderVisitor();
        Program ast = (Program) visitor.visit(tree);

        System.out.println("==============================================");
        System.out.println("      Abstract Syntax Tree (AST) Structure    ");
        System.out.println("==============================================");
        printNode(ast, "", true);

        SymbolTable symbolTable = new SymbolTable();

        System.out.println("\n==============================================");
        System.out.println("      Semantic Analysis (Scope Check)         ");
        System.out.println("==============================================");

        SemanticAnalyzer analyzer = new SemanticAnalyzer(symbolTable);
        analyzer.analyze(ast);
        symbolTable.printReport();
        List<String> scopeErrors = analyzer.getErrors();
        if (scopeErrors.isEmpty()) {
            System.out.println("\n[SUCCESS] No Scope Errors detected.");
        } else {
            System.err.println("\n[FAILED] Total Scope Errors Found: " + scopeErrors.size());
            for (String error : scopeErrors) {
                System.err.println(" -> " + error);
            }
        }
    }

    /**
     * دالة لطباعة عقد الشجرة (Nodes) مع أرقام الأسطر
     */
    private static void printNode(Node node, String indent, boolean isLast) {
        if (node == null) return;
        String prefix = isLast ? "└── " : "├── ";
        String lineInfo = " (line=" + node.getLine() + ")"; // جلب رقم السطر من العقدة

        if (node instanceof Program p) {
            System.out.println(indent + prefix + "Program" + lineInfo);
            List<Node> children = p.getNodes();
            for (int i = 0; i < children.size(); i++) {
                printNode(children.get(i), indent + (isLast ? "    " : "│   "), i == children.size() - 1);
            }
        } else if (node instanceof HtmlElement el) {
            System.out.println(indent + prefix + "HTML Tag: <" + el.getTagName() + ">" + lineInfo);
            List<Node> children = el.getChildren();
            for (int i = 0; i < children.size(); i++) {
                printNode(children.get(i), indent + (isLast ? "    " : "│   "), i == children.size() - 1);
            }
        } else if (node instanceof HtmlText t) {
            String text = t.toString().trim();
            if (!text.isEmpty()) {
                System.out.println(indent + prefix + "Text: \"" + (text.length() > 30 ? text.substring(0, 30) + "..." : text) + "\"" + lineInfo);
            }
        } else if (node instanceof JinjaExpression je) {
            System.out.println(indent + prefix + "Jinja Output {{...}}" + lineInfo);
            printExpression(je.getExpr(), indent + (isLast ? "    " : "│   "), true);
        } else if (node instanceof IfStmt ifStmt) {
            System.out.println(indent + prefix + "IF Statement" + lineInfo);
            String childIndent = indent + (isLast ? "    " : "│   ");
            System.out.println(childIndent + "├── Condition");
            printExpression(ifStmt.getCondition(), childIndent + "│   ", true);
            System.out.println(childIndent + "└── Body");
            for (int i = 0; i < ifStmt.getThenBranch().size(); i++) {
                printNode(ifStmt.getThenBranch().get(i), childIndent + "    ", i == ifStmt.getThenBranch().size() - 1);
            }
        } else if (node instanceof ForStmt fs) {
            System.out.println(indent + prefix + "FOR Loop (var: " + fs.getVar() + ")" + lineInfo);
            String childIndent = indent + (isLast ? "    " : "│   ");
            System.out.println(childIndent + "├── Iterable");
            printExpression(fs.getIterable(), childIndent + "│   ", true);
            System.out.println(childIndent + "└── Body");
            for (int i = 0; i < fs.getBody().size(); i++) {
                printNode(fs.getBody().get(i), childIndent + "    ", i == fs.getBody().size() - 1);
            }
        } else if (node instanceof SetStmt ss) {
            System.out.println(indent + prefix + "SET Variable: " + ss.getVar() + lineInfo);
            printExpression(ss.getValue(), indent + (isLast ? "    " : "│   "), true);
        }
    }

    /**
     * دالة لطباعة التعبيرات (Expressions) مع أرقام الأسطر
     */
    private static void printExpression(Expression expr, String indent, boolean isLast) {
        if (expr == null) return;
        String prefix = isLast ? "└── " : "├── ";
        String lineInfo = " (line=" + expr.getLine() + ")"; // جلب رقم السطر من التعبير

        if (expr instanceof Literal lit) {
            System.out.println(indent + prefix + "Literal: " + lit.toString() + lineInfo);
        } else if (expr instanceof Identifier id) {
            System.out.println(indent + prefix + "Identifier: " + id.toString() + lineInfo);
        } else if (expr instanceof BinaryExpr bin) {
            System.out.println(indent + prefix + "Binary Op [" + bin.getOp() + "]" + lineInfo);
            String childIndent = indent + (isLast ? "    " : "│   ");
            printExpression(bin.getLeft(), childIndent, false);
            printExpression(bin.getRight(), childIndent, true);
        } else if (expr instanceof UnaryExpr un) {
            System.out.println(indent + prefix + "Unary Op [" + un.getOp() + "]" + lineInfo);
            printExpression(un.getExpr(), indent + (isLast ? "    " : "│   "), true);
        } else if (expr instanceof PostfixExpr pf) {
            System.out.println(indent + prefix + "Postfix Expr" + lineInfo);
            String childIndent = indent + (isLast ? "    " : "│   ");
            printExpression(pf.getBase(), childIndent, pf.getParts().isEmpty());
            for (int i = 0; i < pf.getParts().size(); i++) {
                boolean last = (i == pf.getParts().size() - 1);
                System.out.println(childIndent + (last ? "└── " : "├── ") + "Access: " + pf.getParts().get(i));
            }
        } else {
            System.out.println(indent + prefix + "Expr: " + expr.toString() + lineInfo);
        }
    }
}