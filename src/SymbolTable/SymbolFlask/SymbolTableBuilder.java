package SymbolTable.SymbolFlask;

import AST.PaythonAST.*;

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
        else if (node instanceof ParamNode) {
            currentScope.define(new Symbol(
                    ((ParamNode) node).getName(),
                    SymbolKind.PARAMETER.toString(),
                    node.getLineno()
            ));
        }
        else if (node instanceof AssignmentNode) {
            visitAssignment((AssignmentNode) node);
        }
        else if (node instanceof IfNode) {
            visitIf((IfNode) node);
        }
        else if (node instanceof ForNode) {
            visitFor((ForNode) node);
        }
        else {
            if (node.getChildren() != null) {
                for (ASTNode c : node.getChildren()) {
                    visit(c);
                }
            }
        }
    }


    private void visitAssignment(AssignmentNode node) {
        String name = extractVarName(node.getLeft());

        if (name != null) {
            String kind = insideIf
                    ? SymbolKind.IF_VARIABLE.toString()
                    : SymbolKind.VARIABLE.toString();

            currentScope.define(new Symbol(name, kind, node.getLineno()));
        }

        if (node.getRight() != null) {
            visit(node.getRight());
        }
    }


    private String extractVarName(ASTNode left) {
        if (left == null || left.getNodeName() == null) return null;
        String name = left.getNodeName();
        if (name.startsWith("Var: ")) {
            return name.replace("Var: ", "").trim();
        }
        return null;
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
        String funcName = node.getName(); // استخدام getName() الجاهزة بدل تفكيك النص

        Symbol funcSym = new Symbol(funcName, SymbolKind.FUNCTION.toString(), node.getLineno());
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
        String varName = node.getVariable() != null ? node.getVariable() : "unknown";

        currentScope.define(new Symbol(
                varName,
                SymbolKind.LOOP_VARIABLE.toString(),
                node.getLineno()
        ));

        if (node.getChildren() != null) {
            for (ASTNode c : node.getChildren()) {
                visit(c);
            }
        }
    }
}