package Visitor;

import AST.*;
import Grammer.PyFlaskParser;
import Grammer.PyFlaskParser.*;
import Grammer.PyFlaskParserBaseVisitor;

public class ASTBuilder extends PyFlaskParserBaseVisitor<ASTNode> {

    // ============ ENTRY: ProgramRoot ============
    @Override
    public ASTNode visitProgramRoot(PyFlaskParser.ProgramRootContext ctx) {
        // الإصلاح: تمرير رقم السطر إذا كان مطلوباً، أو تركه فارغاً حسب تعريف الكلاس عندك
        ProgramNode program = new ProgramNode(ctx.getStart().getLine());

        for (PyFlaskParser.StatementContext stmtCtx : ctx.statement()) {
            ASTNode node = visit(stmtCtx);
            if (node != null) program.addChild(node);
        }
        return program;
    }

    // ============ IMPORT ============
    // ============ IMPORT ============
    @Override
    public ASTNode visitFromImportStmt(PyFlaskParser.FromImportStmtContext ctx) {
        // القاعدة: FROM ID (DOT ID)* IMPORT importList
        // الموديول هو الجزء الذي يتبع كلمة from
        String module = ctx.ID(0).getText();
        // القائمة المستوردة (مثل اسم الدالة)
        String name = ctx.importList().getText();

        return new ImportNode(module, name, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitGlobalImportStmt(PyFlaskParser.GlobalImportStmtContext ctx) {
        // القاعدة: IMPORT importList
        String module = ctx.importList().getText();
        String name = null; // في الـ import العادي قد لا يكون هناك اسم فرعي محدد بنفس الطريقة

        return new ImportNode(module, name, ctx.getStart().getLine());
    }

    // ============ DECORATOR & FUNCTION ============
    @Override
    public ASTNode visitStmtDecoratedFunction(PyFlaskParser.StmtDecoratedFunctionContext ctx) {
        FunctionNode funcNode = (FunctionNode) visit(ctx.functionDef());

        if (ctx.decorator() != null) {
            RouteNode route = new RouteNode(ctx.decorator().getText(), ctx.decorator().getStart().getLine());
            funcNode.addChild(route);
        }
        return funcNode;
    }

    @Override
    public ASTNode visitFunctionDefNode(PyFlaskParser.FunctionDefNodeContext ctx) {
        String name = ctx.ID().getText();
        FunctionNode fn = new FunctionNode(name, ctx.getStart().getLine());

        // إضافة نص البلوك كسطر مبدئي في الـ bodyLines
        if (ctx.block() != null) {
            fn.addBodyLine(ctx.block().getText());
        }

        // إكمال معالجة الأبناء...
        return fn;
    }

    // ============ CONTROL: If & For ============
    @Override
    public ASTNode visitIfStmtNode(PyFlaskParser.IfStmtNodeContext ctx) {
        IfNode ifNode = new IfNode(ctx.expr().getText(), ctx.getStart().getLine());
        ASTNode mainBlock = visit(ctx.block(0));
        if (mainBlock != null) ifNode.addChild(mainBlock);
        return ifNode;
    }

    @Override
    public ASTNode visitForStmtNode(PyFlaskParser.ForStmtNodeContext ctx) {
        // الإصلاح: بناء النص الذي يصف الحلقة التكرارية
        String loopInfo = ctx.ID().getText() + " in " + ctx.expr().getText();
        return new ForNode(loopInfo, ctx.getStart().getLine());
    }

    // ============ STATEMENTS ============
    @Override
    public ASTNode visitAssignStmtNode(PyFlaskParser.AssignStmtNodeContext ctx) {
        String left = ctx.expr(0).getText();
        String right = ctx.expr(1).getText();
        return new AssignmentNode(left, right, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitReturnStmtNode(PyFlaskParser.ReturnStmtNodeContext ctx) {
        // التحقق مما إذا كان هناك تعبير بعد كلمة return أم لا
        String returnVal = (ctx.expr() != null) ? ctx.expr().getText() : "None";
        return new ReturnNode(returnVal, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitBlockNode(PyFlaskParser.BlockNodeContext ctx) {
        // نستخدم كائن عام للبلوك أو نعتمد على كلاس مخصص إذا كان لديك
        ASTNode block = new ASTNode("Block", ctx.getStart().getLine()) {};
        for (PyFlaskParser.StatementContext st : ctx.statement()) {
            ASTNode child = visit(st);
            if (child != null) block.addChild(child);
        }
        return block;
    }

    @Override
    public ASTNode visitStmtSimple(PyFlaskParser.StmtSimpleContext ctx) {
        return visit(ctx.simpleStmt());
    }
    // أضف هذه الميثود للتعامل مع جملة الـ Inline If
    @Override
    public ASTNode visitTernaryExpr(PyFlaskParser.TernaryExprContext ctx) {
        // سننشئ عقدة بسيطة تمثل الشرط والقيم
        String content = ctx.expr(0).getText() + " if " + ctx.expr(1).getText() + " else " + ctx.expr(2).getText();
        return new ASTNode("Ternary: " + content, ctx.getStart().getLine()) {};
    }

    // تعديل ميثود الـ Return لتجنب الـ NullPointerException تماماً

}