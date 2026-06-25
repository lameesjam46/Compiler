package Visitor.jinjaVisitor;

import Grammer.JinjaAntlr.Grammer.JinjaAntlr.JinjaParser;
import Grammer.JinjaAntlr.Grammer.JinjaAntlr.JinjaParserBaseVisitor;
import SymbolTable.SymbolTablejinja.Symbol;
import SymbolTable.SymbolTablejinja.SymbolTable;

public class SymbolTableVisitor extends JinjaParserBaseVisitor<Void> {

    private final SymbolTable symbolTable;

    public SymbolTableVisitor() {
        this.symbolTable = new SymbolTable();
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public Void visitBlockSet(JinjaParser.BlockSetContext ctx) {
        String varName = ctx.JINJA_ID().getText();
        int line = ctx.getStart().getLine();

        symbolTable.addSymbol(varName, Symbol.SymbolType.SET_VAR, line);

        return visitChildren(ctx);
    }

    @Override
    public Void visitBlockFor(JinjaParser.BlockForContext ctx) {
        String loopVar = ctx.JINJA_ID().getText();
        int line = ctx.getStart().getLine();

        symbolTable.enterScope("ForLoop_" + line);

        symbolTable.addSymbol(loopVar, Symbol.SymbolType.LOOP_VAR, line);
        symbolTable.addSymbol("loop", Symbol.SymbolType.VARIABLE, line);

        visitChildren(ctx);

        symbolTable.exitScope();
        return null;
    }

    @Override
    public Void visitLiteralId(JinjaParser.LiteralIdContext ctx) {
        String varName = ctx.JINJA_ID().getText();
        int line = ctx.getStart().getLine();

        if (symbolTable.lookup(varName) == null) {
            symbolTable.addSymbol(varName, Symbol.SymbolType.VARIABLE, line);
        }
        return visitChildren(ctx);
    }


    @Override
    public Void visitBlockIf(JinjaParser.BlockIfContext ctx) {
        symbolTable.enterScope("IfBlock_" + ctx.getStart().getLine());
        visitChildren(ctx);
        symbolTable.exitScope();
        return null;
    }


}