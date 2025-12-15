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
        parser.removeErrorListeners();
        parser.addErrorListener(ConsoleErrorListener.INSTANCE);

        PyFlaskParser.ProgramContext tree = parser.program();
        ASTBuilder builder = new ASTBuilder();
        ProgramNode prog = (ProgramNode) builder.visit(tree);

        // connect routes to following function if possible
        linkRoutesToFunctions(prog);

        prettyPrint(prog, 0);
    }

    private static void linkRoutesToFunctions(ProgramNode prog) {
        List<ASTNode> children = prog.getChildren();
        for (int i = 0; i < children.size(); i++) {
            ASTNode n = children.get(i);
            if (n instanceof RouteNode) {
                // find next FunctionNode
                for (int j = i+1; j < children.size(); j++) {
                    ASTNode nxt = children.get(j);
                    if (nxt instanceof FunctionNode) {
                        ((RouteNode)n).handlerName = ((FunctionNode)nxt).getName();
                        break;
                    }
                }
            }
        }
    }

    static void prettyPrint(ASTNode n, int indent) {
        String pad = "  ".repeat(indent);
        System.out.println(pad + n.getNodeName() + " (line=" + n.getLineno() + ")");
        if (n instanceof ImportNode) {
            ImportNode in = (ImportNode) n;
            System.out.println(pad + "  module=" + in.getModule() + (in.getName()!=null ? " name=" + in.getName() : ""));
        } else if (n instanceof RouteNode) {
            RouteNode rn = (RouteNode) n;
            System.out.println(pad + "  path=" + rn.getPath() + " handler=" + rn.getHandlerName());
        } else if (n instanceof FunctionNode) {
            FunctionNode fn = (FunctionNode) n;
            System.out.println(pad + "  name=" + fn.getName());
            for (String line : fn.getBodyLines()) {
                System.out.println(pad + "    body: " + line);
            }
        }
        for (ASTNode c : n.getChildren()) prettyPrint(c, indent+1);
    }
}
