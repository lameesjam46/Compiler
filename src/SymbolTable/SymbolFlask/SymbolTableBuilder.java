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
        else if (node.getNodeName() != null && node.getNodeName().startsWith("Param:")) {
            String paramName = node.getNodeName().replace("Param:", "").trim();
            currentScope.define(new Symbol(paramName, SymbolKind.PARAMETER.toString(), node.getLineno()));
        }
        else if (node.getNodeName() != null && node.getNodeName().startsWith("Assignment:")) {
            visitAssignment(node);
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

    private void visitAssignment(ASTNode node) {
        String name = node.getNodeName().replace("Assignment:", "").trim();
        String kind = SymbolKind.VARIABLE.toString();

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
        // 🛠️ تم التعديل هنا: تنظيف اسم الدالة من النص الزائد "Function:" لتبسيط وتجميل المخرجات
        String funcName = node.getNodeName().replace("Function:", "").trim();

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
        String varName = "unknown";

        if (node.getChildren() != null && !node.getChildren().isEmpty()) {
            ASTNode varNode = node.getChildren().get(0);
            if (varNode.getNodeName() != null && varNode.getNodeName().startsWith("Var:")) {
                varName = varNode.getNodeName().replace("Var:", "").trim();
            }
        }

        currentScope.define(new Symbol(
                varName,
                SymbolKind.LOOP_VARIABLE.toString(),
                node.getLineno()
        ));

        Scope saved = currentScope;
        currentScope = new Scope("ForScope", saved);

        if (node.getChildren() != null) {
            for (int i = 1; i < node.getChildren().size(); i++) {
                visit(node.getChildren().get(i));
            }
        }

        currentScope = saved;
    }
}