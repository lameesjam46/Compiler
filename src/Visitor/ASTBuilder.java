package Visitor;

import AST.*;
import Grammer.PyFlaskParser;
import Grammer.PyFlaskParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class ASTBuilder extends PyFlaskParserBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(PyFlaskParser.ProgramContext ctx) {
        ProgramNode prog = new ProgramNode(1);
        for (PyFlaskParser.StatementContext s : ctx.statement()) {
            ASTNode n = visit(s);
            if (n != null) prog.addChild(n);
        }
        return prog;
    }


    @Override
    public ASTNode visitImportStmt(PyFlaskParser.ImportStmtContext ctx) {
        Integer line = ctx.getStart().getLine();

        // حالتان: FROM ID IMPORT importList   أو   IMPORT importList
        if (ctx.FROM() != null) {
            // ctx.ID() هنا عادة تمثل الـ module بعد FROM
            String module = null;
            if (ctx.ID() != null) {
                module = ctx.ID().getText();
            }

            // أسماء المستوردين موجودة في importList (قواعدنا عرّفت importList)
            List<TerminalNode> names = null;
            if (ctx.importList() != null && ctx.importList().ID() != null) {
                names = ctx.importList().ID();
            }

            // خذ أول اسم إن أردت حقلاً 'name' واحداً، أو عدّل ImportNode ليحفظ قائمة إذا أردت
            String firstName = (names != null && names.size() > 0) ? names.get(0).getText() : null;
            return new ImportNode(module, firstName, line);

        } else { // مجرد "IMPORT importList"
            List<TerminalNode> names = null;
            if (ctx.importList() != null && ctx.importList().ID() != null) {
                names = ctx.importList().ID();
            }
            String firstModule = (names != null && names.size() > 0) ? names.get(0).getText() : null;
            // هنا نضع module = firstModule و name = null (أو عدّل ImportNode إن أردت ليتخزن list)
            return new ImportNode(firstModule, null, line);
        }
    }

    @Override
    public ASTNode visitRouteStmt(PyFlaskParser.RouteStmtContext ctx) {
        Integer line = ctx.getStart().getLine();
        String raw = ctx.STRING().getText(); // includes quotes
        String path = raw.length() >= 2 ? raw.substring(1, raw.length()-1) : raw;
        return new RouteNode(path, null, line);
    }

    @Override
    public ASTNode visitFunctionDef(PyFlaskParser.FunctionDefContext ctx) {
        Integer line = ctx.getStart().getLine();
        String name = ctx.ID().getText();
        FunctionNode fn = new FunctionNode(name, line);
        // visit block -> simpleStmt*
        for (PyFlaskParser.SimpleStmtContext sctx : ctx.block().simpleStmt()) {
            if (sctx.RETURN() != null) {
                // return expr NEWLINE
                String text = sctx.exprStart().getText();
                fn.addBodyLine("return " + text);
            } else if (sctx.exprStart() != null) {
                fn.addBodyLine(sctx.exprStart().getText());
            }
        }
        return fn;
    }

    @Override
    public ASTNode visitStatement(PyFlaskParser.StatementContext ctx) {
        if (ctx.importStmt() != null) return visit(ctx.importStmt());
        if (ctx.routeStmt() != null) return visit(ctx.routeStmt());
        if (ctx.functionDef() != null) return visit(ctx.functionDef());
        if (ctx.simpleStmt() != null) {
            // top-level simple lines (ignore or store)
            return null;
        }
        return null;
    }
}
