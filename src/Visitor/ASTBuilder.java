package Visitor;

import AST.*;
import Grammer.PyFlaskParser;
import Grammer.PyFlaskParser.*;
import Grammer.PyFlaskParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

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
        String module = "unknown";
        StringBuilder names = new StringBuilder();
        boolean foundImport = false;

        // نمر على كل الأبناء (Tokens and Rules)
        for (int i = 0; i < ctx.getChildCount(); i++) {
            String text = ctx.getChild(i).getText();

            // 1. تحديد اسم المكتبة (يأتي دائماً بعد 'from')
            if (i > 0 && ctx.getChild(i-1).getText().equals("from")) {
                module = text;
            }

            // 2. بمجرد رؤية كلمة 'import'، كل ما بعدها هو أسماء نريد جمعها
            if (foundImport) {
                // نتجاهل الفواصل والمسافات الزائدة
                if (!text.equals(",") && !text.isEmpty()) {
                    if (names.length() > 0 && !text.equals("(")) names.append(", ");
                    names.append(text.replace("(", "").replace(")", "")); // تنظيف الأقواس إن وجدت
                }
            }

            if (text.equals("import")) {
                foundImport = true;
            }
        }

        return new ASTNode("Import (From: " + module + ") -> Names: [" + names.toString().trim() + "]", ctx.getStart().getLine()) {};
    }


    // ============ DECORATOR & FUNCTION ============
    @Override
    public ASTNode visitStmtDecoratedFunction(PyFlaskParser.StmtDecoratedFunctionContext ctx) {
        // 1. زر قاعدة الدالة أولاً للحصول على عقدة FunctionNode
        FunctionNode funcNode = (FunctionNode) visit(ctx.functionDef());

        // 2. زر قاعدة الديكوريتور للحصول على عقدة RouteNode
        if (ctx.decorator() != null && funcNode != null) {
            ASTNode routeNode = visit(ctx.decorator());
            if (routeNode != null) {
                // إضافة الراوت في أول قائمة الأبناء (Index 0)
                funcNode.getChildren().add(0, routeNode);
            }
        }

        // 3. أعد عقدة الدالة بعد أن أصبح الراوت بداخلها كأول ابن
        return funcNode;
    }

    @Override
    public ASTNode visitFunctionDefNode(PyFlaskParser.FunctionDefNodeContext ctx) {
        String name = ctx.ID().getText();
        FunctionNode fn = new FunctionNode(name, ctx.getStart().getLine());

        // زيارة البلوك الخاص بالدالة
        if (ctx.block() != null) {
            ASTNode blockNode = visit(ctx.block());
            if (blockNode != null) {
                // إضافة جميع الجمل الموجودة داخل البلوك كأبناء لعقدة الدالة مباشرة
                for (ASTNode child : blockNode.getChildren()) {
                    fn.addChild(child);
                }
            }
        }

        return fn;
    }

    // ============ CONTROL: If & For ============
    @Override
    public ASTNode visitIfStmtNode(PyFlaskParser.IfStmtNodeContext ctx) {
        // 1. إنشاء عقدة الـ If الأساسية
        IfNode ifNode = new IfNode(ctx.expr().getText(), ctx.getStart().getLine());

        // 2. معالجة بلوك الـ If (True Branch)
        if (ctx.block(0) != null) {
            ASTNode mainBlock = visit(ctx.block(0));
            if (mainBlock != null) {
                for (ASTNode child : mainBlock.getChildren()) {
                    ifNode.addChild(child);
                }
            }
        }

        // 3. معالجة بلوك الـ Else (False Branch) - هذا هو الجزء المفقود
        if (ctx.block().size() > 1) { // إذا كان هناك أكثر من بلوك، فالثاني هو الـ else
            ASTNode elseMarker = new ASTNode("Else", ctx.ELSE().getSymbol().getLine()) {};
            ASTNode elseBlock = visit(ctx.block(1));

            if (elseBlock != null) {
                for (ASTNode child : elseBlock.getChildren()) {
                    elseMarker.addChild(child);
                }
            }
            ifNode.addChild(elseMarker); // إضافته كابن لعقدة الـ If
        }

        return ifNode;
    }
    @Override
    public ASTNode visitForStmtNode(PyFlaskParser.ForStmtNodeContext ctx) {
        // إنشاء عقدة الـ For
        String loopInfo = ctx.ID().getText() + " in " + ctx.expr().getText();
        ForNode forNode = new ForNode(loopInfo, ctx.getStart().getLine());

        // الجزء المفقود: الدخول إلى البلوك وإضافة محتوياته (مثل الـ if) كأبناء للـ For
        if (ctx.block() != null) {
            ASTNode blockNode = visit(ctx.block());
            if (blockNode != null) {
                for (ASTNode child : blockNode.getChildren()) {
                    forNode.addChild(child); // هنا نضيف الـ if والـ break للشجرة
                }
            }
        }
        return forNode;
    }

    // ============ STATEMENTS ============
    @Override
    public ASTNode visitAssignStmtNode(PyFlaskParser.AssignStmtNodeContext ctx) {
        // الطرف الأيسر (اسم المتغير)
        String varName = ctx.expr(0).getText();

        // الطرف الأيمن: هنا السر!
        // بدلاً من getText()، نستخدم visit() لكي يذهب إلى visitDictLiteralNode
        ASTNode rightSideNode = visit(ctx.expr(1));

        // إنشاء عقدة التعيين
        ASTNode assignNode = new ASTNode("Assignment: " + varName, ctx.getStart().getLine()) {};

        // إضافة نتيجة القاموس أو التعبير كأبن
        assignNode.addChild(rightSideNode);

        return assignNode;
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
        // نحن نجمعهم هنا في عقدة واحدة لأنهم يعملون معاً لإعطاء قيمة واحدة
        String res = ctx.expr(0).getText() + " IF " + ctx.expr(1).getText() + " ELSE " + ctx.expr(2).getText();
        return new ASTNode("ConditionalValue: " + res, ctx.getStart().getLine()) {};
    }

    @Override
    public ASTNode visitDecoratorNode(PyFlaskParser.DecoratorNodeContext ctx) {
        // استخراج النص الكامل للتعبير بعد علامة @
        // ctx.expr().getText() سيعطيك شيئاً مثل app.route("/products")
        String path = "@" + ctx.expr().getText();

        // إنشاء عقدة RouteNode جديدة
        return new RouteNode(path, ctx.getStart().getLine());
    }


    @Override
    public ASTNode visitBreakStmtNode(PyFlaskParser.BreakStmtNodeContext ctx) {
        // إنشاء عقدة BreakNode وتمرير رقم السطر
        return new BreakNode(ctx.getStart().getLine());
    }



    @Override
    public ASTNode visitDictLiteralNode(PyFlaskParser.DictLiteralNodeContext ctx) {
        ASTNode dictNode = new ASTNode("Dictionary Structure", ctx.getStart().getLine()) {};

        List<TerminalNode> keys = ctx.STRING();
        List<PyFlaskParser.ExprContext> values = ctx.expr();

        for (int i = 0; i < keys.size(); i++) {
            // تنظيف اسم المفتاح من علامات التنصيص
            String keyName = keys.get(i).getText().replace("\"", "");

            // إنشاء عقدة للمفتاح
            ASTNode keyNode = new ASTNode("Field: " + keyName, keys.get(i).getSymbol().getLine()) {};

            // إضافة القيمة كأبن للمفتاح (قد تكون Id أو Function Call)
            keyNode.addChild(visit(values.get(i)));

            dictNode.addChild(keyNode);
        }

        return dictNode;
    }



    @Override
    public ASTNode visitListLiteralNode(PyFlaskParser.ListLiteralNodeContext ctx) {
        ASTNode listNode = new ASTNode("List Structure", ctx.getStart().getLine()) {};
        for (PyFlaskParser.ExprContext expr : ctx.expr()) {
            listNode.addChild(visit(expr)); // سيقوم بزيارة كل قاموس داخل القائمة
        }
        return listNode;
    }




//    @Override
//    public ASTNode visitContinueStmtNode(PyFlaskParser.ContinueStmtNodeContext ctx) {
//        // اختيارياً: إذا أردت دعم Continue أيضاً
//        return new ASTNode("Continue", ctx.getStart().getLine()) {};
//    }
}