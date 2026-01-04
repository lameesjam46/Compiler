package Visitor.jinjaVisitor;

import Grammer.JinjaAntlr.JinjaParser;
import Grammer.JinjaAntlr.JinjaParserBaseVisitor;
import SymbolTable.SymbolTablejinja.SymbolTable;

public class SymbolTableVisitor extends JinjaParserBaseVisitor<Void> {

    private final SymbolTable symbolTable;

    public SymbolTableVisitor() {
        symbolTable = new SymbolTable();
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }


    @Override
    public Void visitSetStatement(JinjaParser.SetStatementContext ctx) {

        String varName = ctx.JINJA_ID().getText();
        int line = ctx.getStart().getLine();
        symbolTable.addSymbol(varName, "local", line);

        return visitChildren(ctx);
    }




    @Override
    public Void visitForStatement(JinjaParser.ForStatementContext ctx) {
        String loopVar = ctx.JINJA_ID().getText();
        int line = ctx.getStart().getLine();


        symbolTable.enterScope("ForLoop: " + loopVar + " in ...");
        symbolTable.addSymbol(loopVar, "loop", line);

        visitChildren(ctx);

        symbolTable.exitScope();
        return null;
    }


    @Override
    public Void visitLiteralId(JinjaParser.LiteralIdContext ctx) {
        String varName = ctx.JINJA_ID().getText();
        int line = ctx.getStart().getLine();

        if (symbolTable.lookup(varName) == null) {
            symbolTable.addSymbol(varName, "parameter", line);
        }
        return visitChildren(ctx);
    }


    @Override
    public Void visitIfStatement(JinjaParser.IfStatementContext ctx) {
        symbolTable.enterScope("IfBlock");
        visitChildren(ctx);
        symbolTable.exitScope();
        return null;
    }

    @Override
    public Void visitElifStatement(JinjaParser.ElifStatementContext ctx) {
        symbolTable.enterScope("ElifBlock");
        visitChildren(ctx);
        symbolTable.exitScope();
        return null;
    }

    @Override
    public Void visitElseStatement(JinjaParser.ElseStatementContext ctx) {
        symbolTable.enterScope("ElseBlock");
        visitChildren(ctx);
        symbolTable.exitScope();
        return null;
    }
}
