package SymbolTable.SymbolTablejinja;

import AST.JinjaAST.*;
import java.util.*;

public class SemanticAnalyzer {
    private final SymbolTable symbolTable;
    private final List<String> scopeErrors = new ArrayList<>();
    private final Set<String> reportedUndefinedVariables = new HashSet<>();

    public SemanticAnalyzer(SymbolTable symbolTable) { this.symbolTable = symbolTable; }

    public SemanticAnalyzer(SymbolTable symbolTable, Set<String> externalVariables) {
        this.symbolTable = symbolTable;
        if (externalVariables != null) {
            for (String name : externalVariables) {
                this.symbolTable.addExternalSymbol(name);
            }
        }
    }

    public void analyze(Program program) {
        for (Node node : program.getNodes()) visit(node);
    }

    private void visit(Node node) {
        if (node instanceof SetStmt) {
            SetStmt s = (SetStmt) node;
            checkExpressionScope(s.getValue());
            if (!symbolTable.addSymbol(s.getVar(), Symbol.SymbolType.SET_VAR, s.getLine())) {
                scopeErrors.add("Scope Error: Variable '" + s.getVar() + "' already defined at line " + s.getLine());
            }
        }
        else if (node instanceof ForStmt) {
            visitForStmt((ForStmt) node);
        }
        else if (node instanceof IfStmt) {
            visitIfStmt((IfStmt) node);
        }
        // استخدام اسم الكلاس الصحيح في مشروعك
        else if (node instanceof JinjaExpression) {
            checkExpressionScope(((JinjaExpression) node).getExpr());
        }
        else if (node instanceof HtmlElement) {
            for (Node child : ((HtmlElement) node).getChildren()) visit(child);
        }
    }

    private void visitIfStmt(IfStmt node) {
        checkExpressionScope(node.getCondition());
        symbolTable.enterScope("If");
        for (Node child : node.getThenBranch()) visit(child);
        symbolTable.exitScope();

        for (ElifStmt elif : node.getElifBlocks()) {
            checkExpressionScope(elif.getCondition());
            symbolTable.enterScope("Elif");
            for (Node child : elif.getBody()) visit(child);
            symbolTable.exitScope();
        }

        if (node.getElseBlock() != null) {
            symbolTable.enterScope("Else");
            for (Node child : node.getElseBlock().getBody()) visit(child);
            symbolTable.exitScope();
        }
    }

    private void visitForStmt(ForStmt node) {
        if (symbolTable.existsInAnyScope(node.getVar())) {
            scopeErrors.add("Scope Warning: Loop variable '" + node.getVar() + "' shadows existing variable.");
        }
        checkExpressionScope(node.getIterable());
        symbolTable.enterScope("ForBlock");

        symbolTable.addSymbol(node.getVar(), Symbol.SymbolType.LOOP_VAR, node.getLine());
        for (Node child : node.getBody()) visit(child);

        symbolTable.exitScope();
    }

    private void checkExpressionScope(Expression expr) {
        if (expr == null) return;

        if (expr instanceof Identifier) {
            String name = ((Identifier) expr).getName();
            if (symbolTable.wasDefinedInClosedScope(name)) {
                scopeErrors.add("Scope Error: Variable '" + name + "' used out of scope at line " + expr.getLine());
            }
            else if (symbolTable.lookup(name) == null) {
                addUndefinedVariableError(name, expr.getLine());
            }
        }
        else if (expr instanceof PostfixExpr) {
            PostfixExpr postfix = (PostfixExpr) expr;
            checkExpressionScope(postfix.getBase());

            for (PostfixPart part : postfix.getParts()) {
                if (part instanceof IndexAccess index) {
                    checkExpressionScope(index.getStart());
                    checkExpressionScope(index.getEnd());
                }
            }
        }
        else if (expr instanceof BinaryExpr) { // الاسم الصحيح هو BinaryExpr
            BinaryExpr bin = (BinaryExpr) expr;
            checkExpressionScope(bin.getLeft());
            checkExpressionScope(bin.getRight());
        }
        else if (expr instanceof UnaryExpr) {
            checkExpressionScope(((UnaryExpr) expr).getExpr());
        }
    }

    private void addUndefinedVariableError(String name, int line) {
        String key = name + "@" + line;
        if (reportedUndefinedVariables.add(key)) {
            scopeErrors.add("Undefined Variable Error: Variable '" + name + "' is not defined at line " + line);
        }
    }

    public List<String> getErrors() { return scopeErrors; }
}
