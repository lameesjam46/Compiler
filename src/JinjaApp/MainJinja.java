package JinjaApp;

import JinjaAST.*;
import ASTBuilderVisitor.ASTBuilderVisitor;
import ASTBuilderVisitor.SymbolTableVisitor;
import JinjaGrammer.JinjaLexer;
import JinjaGrammer.JinjaParser;
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


        System.out.println("=== Abstract Syntax Tree Structure ===");
        printNode(ast, "", true);
        // بعد بناء AST
        SymbolTableVisitor symVisitor = new SymbolTableVisitor();
        symVisitor.visit(tree);

        System.out.println("=== Symbol Table ===");
        symVisitor.getSymbolTable().print();

    }


    private static void printNode(Node node, String indent, boolean isLast) {
        if (node == null) return;

        String prefix = isLast ? "└── " : "├── ";

        if (node instanceof Program p) {
            System.out.println(indent + prefix + "Program (line=" + p.getLine() + ")");
            List<Node> children = p.getNodes();
            for (int i = 0; i < children.size(); i++) {
                printNode(children.get(i), indent + (isLast ? "    " : "│   "), i == children.size() - 1);
            }

        } else if (node instanceof HtmlElement el) {
            System.out.println(indent + prefix + "HtmlElement: <" + el.getTagName() + "> (line=" + el.getLine() + ")");
            List<HtmlAttribute> attrs = el.getAttributes();
            for (HtmlAttribute attr : attrs) {
                System.out.println(indent + (isLast ? "    " : "│   ") + "├── HtmlAttribute: "
                        + attr + " (line=" + attr.getLine() + ")");
            }
            List<Node> children = el.getChildren();
            for (int i = 0; i < children.size(); i++) {
                printNode(children.get(i), indent + (isLast ? "    " : "│   "), i == children.size() - 1);
            }

            System.out.println(indent + (isLast ? "    " : "│   ") + "└── HtmlEndTag: </" + el.getTagName() + "> (line=" + el.getLine() + ")");

        } else if (node instanceof HtmlText t) {
            System.out.println(indent + prefix + "HtmlText: \"" + t.toString() + "\" (line=" + t.getLine() + ")");

        } else if (node instanceof HtmlComment c) {
            System.out.println(indent + prefix + "HtmlComment: \"" + c.toString() + "\" (line=" + c.getLine() + ")");

        } else if (node instanceof HtmlDoctype d) {
            System.out.println(indent + prefix + "HtmlDoctype: \"" + d.toString() + "\" (line=" + d.getLine() + ")");

        } else if (node instanceof JinjaExpression je) {
            System.out.println(indent + prefix + "JinjaExpression (line=" + je.getLine() + ")");
            printExpression(je.getExpr(), indent + (isLast ? "    " : "│   "), true);

        } else if (node instanceof JinjaStatement js) {
            System.out.println(indent + prefix + "JinjaStatement (line=" + js.getLine() + ")");
            printNode(js.getStmt(), indent + (isLast ? "    " : "│   "), true);

        } else if (node instanceof IfStmt ifStmt) {
            System.out.println(indent + prefix + "IfStmt (line=" + ifStmt.getLine() + ")");
            printExpression(ifStmt.getCondition(), indent + (isLast ? "    " : "│   "), true);

        } else if (node instanceof ElifStmt elifStmt) {
            System.out.println(indent + prefix + "ElifStmt (line=" + elifStmt.getLine() + ")");
            printExpression(elifStmt.getCondition(), indent + (isLast ? "    " : "│   "), true);

        } else if (node instanceof ElseStmt) {
            System.out.println(indent + prefix + "ElseStmt (line=" + node.getLine() + ")");

        } else if (node instanceof ForStmt fs) {
            System.out.println(indent + prefix + "ForStmt: " + fs.getVar() + " in ... (line=" + fs.getLine() + ")");
            printExpression(fs.getIterable(), indent + (isLast ? "    " : "│   "), true);

        } else if (node instanceof SetStmt ss) {
            System.out.println(indent + prefix + "SetStmt: " + ss.getVar() + " = ... (line=" + ss.getLine() + ")");
            printExpression(ss.getValue(), indent + (isLast ? "    " : "│   "), true);

        } else if (node instanceof BreakStmt) {
            System.out.println(indent + prefix + "BreakStmt (line=" + node.getLine() + ")");

        } else if (node instanceof ContinueStmt) {
            System.out.println(indent + prefix + "ContinueStmt (line=" + node.getLine() + ")");

        } else if (node instanceof EndIfStmt) {
            System.out.println(indent + prefix + "EndIfStmt (line=" + node.getLine() + ")");

        } else if (node instanceof EndForStmt) {
            System.out.println(indent + prefix + "EndForStmt (line=" + node.getLine() + ")");

        } else {
            System.out.println(indent + prefix + "Unknown Node: " + node + " (line=" + node.getLine() + ")");
        }
    }


    private static void printExpression(Expression expr, String indent, boolean isLast) {
        if (expr == null) return;

        String prefix = isLast ? "└── " : "├── ";

        if (expr instanceof Literal lit) {
            System.out.println(indent + prefix + "Literal: " + lit + " (line=" + lit.getLine() + ")");

        } else if (expr instanceof Identifier id) {
            System.out.println(indent + prefix + "Identifier: " + id + " (line=" + id.getLine() + ")");

        } else if (expr instanceof BinaryExpr bin) {
            System.out.println(indent + prefix + "BinaryExpr: " + bin + " (line=" + bin.getLine() + ")");
            printExpression(bin.getLeft(), indent + (isLast ? "    " : "│   "), false);
            printExpression(bin.getRight(), indent + (isLast ? "    " : "│   "), true);

        } else if (expr instanceof UnaryExpr un) {
            System.out.println(indent + prefix + "UnaryExpr: " + un + " (line=" + un.getLine() + ")");
            printExpression(un.getExpr(), indent + (isLast ? "    " : "│   "), true);

        } else if (expr instanceof PostfixExpr pf) {
            System.out.println(indent + prefix + "PostfixExpr: (line=" + pf.getLine() + ")");
            printExpression(pf.getBase(), indent + (isLast ? "    " : "│   "), false);
            List<PostfixPart> parts = pf.getParts();
            for (int i = 0; i < parts.size(); i++) {
                System.out.println(indent + (isLast ? "    " : "│   ") + (i == parts.size() - 1 ? "└── " : "├── ") + "PostfixPart: " + parts.get(i));
            }

        } else {
            System.out.println(indent + prefix + "Unknown Expression: " + expr + " (line=" + expr.getLine() + ")");
        }
    }


}
