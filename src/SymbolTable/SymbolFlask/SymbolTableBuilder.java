package SymbolTable.SymbolFlask;


//import AST.*;
import AST.PaythonAST.*;
import SymbolTable.SymbolFlask.Scope;
import SymbolTable.SymbolFlask.Symbol;
import SymbolTable.SymbolFlask.SymbolKind;

public class SymbolTableBuilder {

    private Scope currentScope;
    private boolean insideIf = false;

    public Scope build(ASTNode root) {
        currentScope = new Scope("Global", null);
        visit(root);
        return currentScope;
    }

    private void visit(ASTNode node) {
        if (node == null) return;

        if (node instanceof FunctionNode) {
            visitFunction((FunctionNode) node);
        }
        else if (node.getNodeName() != null && node.getNodeName().startsWith("Param:")) {
            String paramName = node.getNodeName().replace("Param:", "").trim();
            currentScope.define(new Symbol(paramName, "PARAMETER", node.getLineno()));
        }
        else if (node.getNodeName() != null && node.getNodeName().startsWith("Assignment:")) {
            visitAssignment(node);
        }
        else if (node.getNodeName() != null && node.getNodeName().startsWith("Var:")) {
            String varName = node.getNodeName().replace("Var:", "").trim();
            currentScope.define(new Symbol(varName, "LOOP_VARIABLE", node.getLineno()));
        }
        else if (node instanceof IfNode) {
            visitIf((IfNode) node);
        }

        else {
            if (node.getChildren() != null) {
                for (ASTNode c : node.getChildren()) {
                    visit(c);
                }
            }
        }
    }


    private void visitAssignment(ASTNode node) {
        String name = node.getNodeName().replace("Assignment:", "").trim();

        String kind = "VARIABLE";

        if (insideIf) {
            kind = SymbolKind.IF_VARIABLE.toString();
        }

        currentScope.define(new Symbol(name, kind, node.getLineno()));

        if (node.getChildren() != null) {
            for (ASTNode c : node.getChildren()) {
                visit(c);
            }
        }
    }

    private void visitProgram(ProgramNode node) {
        if (node.getChildren() != null) {
            for (ASTNode c : node.getChildren()) {
                visit(c);
            }
        }
    }


    private void visitIf(IfNode node) {
        boolean saved = insideIf;
        insideIf = true;

        if (node.getChildren() != null) {
            for (ASTNode c : node.getChildren()) {
                visit(c);
            }
        }

        insideIf = saved;
    }


    private void visitFunction(FunctionNode node) {
        String funcName = node.getNodeName();

        Symbol funcSym = new Symbol(funcName, "FUNCTION", node.getLineno());
        currentScope.define(funcSym);

        Scope saved = currentScope;
        currentScope = new Scope("Scope_" + funcName, saved);
        funcSym.setInnerScope(currentScope);

        if (node.getChildren() != null) {
            for (ASTNode c : node.getChildren()) {
                visit(c);
            }
        }

        currentScope = saved;
    }
    private void visitFor(ForNode node) {
        String varName = node.getNodeName().replace("Var:", "").trim();
        currentScope.define(new Symbol(
                varName,
                SymbolKind.LOOP_VARIABLE.toString(),
                node.getLineno()
        ));

        Scope saved = currentScope;
        currentScope = new Scope("ForScope", saved);

        if (node.getChildren() != null) {
            for (ASTNode c : node.getChildren()) {
                visit(c);
            }
        }

        currentScope = saved;
    }


}