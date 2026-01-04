package APP.Paythonapp;

import AST.PaythonAST.*;
import Grammer.PaythonGrammer.PyFlaskLexer;
import Grammer.PaythonGrammer.PyFlaskParser;
import SymbolTable.SymbolFlask.Scope;
import SymbolTable.SymbolFlask.SymbolTableBuilder;
import Visitor.PaythonVisitor.ASTBuilder;
import org.antlr.v4.runtime.*;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        String path = "Input/flask_app.py";
        CharStream cs = CharStreams.fromFileName(path);

        PyFlaskLexer lexer = new PyFlaskLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PyFlaskParser parser = new PyFlaskParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(ConsoleErrorListener.INSTANCE);

        PyFlaskParser.ProgramContext tree = parser.program();

        ASTBuilder builder = new ASTBuilder();
        ProgramNode prog = (ProgramNode) builder.visit(tree);

        linkRoutesToFunctions(prog);

        System.out.println("=== Abstract Syntax Tree Structure ===");
        prettyPrint(prog, "", true);
        SymbolTableBuilder symBuilder = new SymbolTableBuilder();
        Scope globalScope = symBuilder.build(prog);

        System.out.println("\n=== Symbol Table ===");
        globalScope.print("");

    }

    private static void linkRoutesToFunctions(ProgramNode prog) {
        for (ASTNode node : prog.getChildren()) {
            if (node instanceof FunctionNode) {
                FunctionNode fn = (FunctionNode) node;
                for (ASTNode child : fn.getChildren()) {
                    if (child instanceof RouteNode) {
                        ((RouteNode) child).handlerName = fn.getName();
                    }
                }
            }
        }
    }


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

        System.out.println();

        String newPrefix = prefix + (isLast ? "    " : "│   ");

        List<ASTNode> children = n.getChildren();
        for (int i = 0; i < children.size(); i++) {
            prettyPrint(children.get(i), newPrefix, i == children.size() - 1);
        }
    }
}