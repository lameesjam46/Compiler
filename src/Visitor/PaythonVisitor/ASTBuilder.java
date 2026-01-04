package Visitor.PaythonVisitor;

import AST.PaythonAST.*;
import Grammer.PaythonGrammer.PyFlaskParser;
import Grammer.PaythonGrammer.PyFlaskParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class ASTBuilder extends PyFlaskParserBaseVisitor<ASTNode> {

    // ============ ENTRY: ProgramRoot ============
    @Override
    public ASTNode visitProgramRoot(PyFlaskParser.ProgramRootContext ctx) {
        ProgramNode program = new ProgramNode(ctx.getStart().getLine());

        for (PyFlaskParser.StatementContext stmtCtx : ctx.statement()) {
            ASTNode node = visit(stmtCtx);
            if (node != null) program.addChild(node);
        }
        return program;
    }


    @Override
    public ASTNode visitFromImportStmt(PyFlaskParser.FromImportStmtContext ctx) {
        String module = "unknown";
        StringBuilder names = new StringBuilder();
        boolean foundImport = false;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            String text = ctx.getChild(i).getText();

            if (i > 0 && ctx.getChild(i-1).getText().equals("from")) {
                module = text;
            }

            if (foundImport) {
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



    @Override
    public ASTNode visitStmtDecoratedFunction(PyFlaskParser.StmtDecoratedFunctionContext ctx) {

        ASTNode routeNode = visit(ctx.decorator());
        ASTNode funcNode  = visit(ctx.functionDef());

        ASTNode wrapper = new ASTNode("DecoratedFunction", ctx.getStart().getLine()) {};
        wrapper.addChild(routeNode);
        wrapper.addChild(funcNode);

        return wrapper;
    }

    @Override
    public ASTNode visitFunctionDefNode(PyFlaskParser.FunctionDefNodeContext ctx) {
        String name = ctx.ID().getText();
        FunctionNode fn = new FunctionNode(name, ctx.getStart().getLine());

        if (ctx.parameters() != null) {
            for (TerminalNode id : ctx.parameters().ID()) {
                fn.addChild(new ASTNode(
                        "Param: " + id.getText(),
                        id.getSymbol().getLine()
                ) {});
            }
        }


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
        IfNode ifNode = new IfNode("If", ctx.getStart().getLine());

        ASTNode condition = visit(ctx.expr()); // 🔥 هنا BinaryOp is / == / in
        ifNode.addChild(condition);

        ASTNode thenBlock = visit(ctx.block(0));
        for (ASTNode c : thenBlock.getChildren()) {
            ifNode.addChild(c);
        }

        if (ctx.block().size() > 1) {
            ASTNode elseNode = new ASTNode("Else", ctx.ELSE().getSymbol().getLine()) {};
            ASTNode elseBlock = visit(ctx.block(1));
            for (ASTNode c : elseBlock.getChildren()) {
                elseNode.addChild(c);
            }
            ifNode.addChild(elseNode);
        }

        return ifNode;
    }






    @Override
    public ASTNode visitForStmtNode(PyFlaskParser.ForStmtNodeContext ctx) {
        ASTNode forNode = new ASTNode("For", ctx.getStart().getLine()) {};

        // left: variable
        ASTNode left = new ASTNode(
                "Var: " + ctx.ID().getText(),
                ctx.getStart().getLine()
        ) {};

        // right: iterable expression
        ASTNode right = visit(ctx.expr());

        // in condition
        BinaryOpNode inCondition = new BinaryOpNode(
                left,
                "in",
                right,
                ctx.getStart().getLine()
        );

        // add condition first
        forNode.addChild(inCondition);

        // add loop body
        ASTNode block = visit(ctx.block());
        if (block != null) {
            for (ASTNode stmt : block.getChildren()) {
                forNode.addChild(stmt);
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

    @Override
    public ASTNode visitContinueStmt(PyFlaskParser.ContinueStmtContext ctx) {
        int line = ctx.CONTINUE().getSymbol().getLine();
        return new ContinueNode(line);
    }

//    @Override
//    public ASTNode visitAddition(PyFlaskParser.AdditionContext ctx) {
//        ASTNode left = visit(ctx.expr(0));
//        ASTNode right = visit(ctx.expr(1));
//
//        return new BinaryOpNode(
//                left,
//                "+",
//                right,
//                ctx.getStart().getLine()
//        );
//    }


//
//    @Override
//    public ASTNode visitSubscript(PyFlaskParser.SubscriptContext ctx) {
//        ASTNode target = visit(ctx.expr(0));
//        ASTNode index = visit(ctx.expr(1));
//
//        return new SubscriptNode(target, index, ctx.getStart().getLine());
//    }


    @Override
    public ASTNode visitAttribute(PyFlaskParser.AttributeContext ctx) {
        ASTNode obj = visit(ctx.expr());
        String attr = ctx.ID().getText();

        ASTNode node = new ASTNode("Attribute: " + attr,
                ctx.getStart().getLine()) {};
        node.addChild(obj);
        return node;
    }




    @Override
    public ASTNode visitSubscript(PyFlaskParser.SubscriptContext ctx) {
        // getText() يعطي: p["price"]
        return new SubscriptNode(
                ctx.getText(),
                ctx.getStart().getLine()
        );
    }



    @Override
    public ASTNode visitInExpr(PyFlaskParser.InExprContext ctx) {
        ASTNode left = visit(ctx.expr(0));
        ASTNode right = visit(ctx.expr(1));
        return new BinaryOpNode(left, "in", right, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitIsExpr(PyFlaskParser.IsExprContext ctx) {
        ASTNode left = visit(ctx.expr(0));
        ASTNode right = visit(ctx.expr(1));
        return new BinaryOpNode(left, "is", right, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitCompareExpr(PyFlaskParser.CompareExprContext ctx) {
        ASTNode left = visit(ctx.expr(0));
        ASTNode right = visit(ctx.expr(1));
        String op = ctx.getChild(1).getText();
        return new BinaryOpNode(left, op, right, ctx.getStart().getLine());
    }


    @Override
    public ASTNode visitAtomIdNode(PyFlaskParser.AtomIdNodeContext ctx) {
        return new ASTNode(
                "Var: " + ctx.ID().getText(),
                ctx.ID().getSymbol().getLine()
        ) {};
    }


    @Override
    public ASTNode visitAtomNumberNode(PyFlaskParser.AtomNumberNodeContext ctx) {
        return new ASTNode(
                "Number: " + ctx.NUMBER().getText(),
                ctx.NUMBER().getSymbol().getLine()
        ) {};
    }


    @Override
    public ASTNode visitAtomStringNode(PyFlaskParser.AtomStringNodeContext ctx) {
        return new ASTNode(
                "String: " + ctx.STRING().getText(),
                ctx.STRING().getSymbol().getLine()
        ) {};
    }

    @Override
    public ASTNode visitAddition(PyFlaskParser.AdditionContext ctx) {
        return super.visitAddition(ctx);
    }

//    @Override
//    public ASTNode visitSubscript(PyFlaskParser.SubscriptContext ctx) {
//        ASTNode container = visit(ctx.expr(0));
//        ASTNode index = visit(ctx.expr(1));
//
//        ASTNode node = new ASTNode("Subscript",
//                ctx.getStart().getLine()) {};
//        node.addChild(container);
//        node.addChild(index);
//        return node;
//    }




//    @Override
//    public ASTNode visitContinueStmtNode(PyFlaskParser.ContinueStmtNodeContext ctx) {
//        // اختيارياً: إذا أردت دعم Continue أيضاً
//        return new ASTNode("Continue", ctx.getStart().getLine()) {};
//    }
}