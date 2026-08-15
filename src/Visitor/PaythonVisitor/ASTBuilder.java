package Visitor.PaythonVisitor;

import AST.PaythonAST.*;
import Grammer.PaythonGrammer.PyFlaskParser;
import Grammer.PaythonGrammer.PyFlaskParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
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
        List<String> moduleParts = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) == ctx.importList()) break;
            if (ctx.getChild(i) instanceof TerminalNode) {
                String text = ctx.getChild(i).getText();
                if (!text.equals("from") && !text.equals("import") && !text.equals(".")) {
                    moduleParts.add(text);
                }
            }
        }
        String module = moduleParts.isEmpty() ? "unknown" : String.join(".", moduleParts);

        List<String> names = extractImportNames(ctx.importList());

        return new ImportNode(module, names, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitGlobalImportStmt(PyFlaskParser.GlobalImportStmtContext ctx) {
        List<String> names = extractImportNames(ctx.importList());
        return new ImportNode(null, names, ctx.getStart().getLine());
    }

    private List<String> extractImportNames(PyFlaskParser.ImportListContext importListCtx) {
        List<String> names = new ArrayList<>();
        if (importListCtx == null) return names;
        for (int i = 0; i < importListCtx.getChildCount(); i++) {
            if (importListCtx.getChild(i) instanceof TerminalNode) {
                String text = importListCtx.getChild(i).getText();
                if (!text.equals(",")) names.add(text);
            }
        }
        return names;
    }

    // ============ DECORATED FUNCTION ============
    @Override
    public ASTNode visitStmtDecoratedFunction(PyFlaskParser.StmtDecoratedFunctionContext ctx) {

        ASTNode routeNode = visit(ctx.decorator());
        ASTNode funcNode  = visit(ctx.functionDef());

        ASTNode wrapper = new ASTNode("DecoratedFunction", ctx.getStart().getLine()) {};
        wrapper.addChild(routeNode);
        wrapper.addChild(funcNode);

        return wrapper;
    }

    // ============ FUNCTION ============
    @Override
    public ASTNode visitFunctionDefNode(PyFlaskParser.FunctionDefNodeContext ctx) {
        String name = ctx.ID().getText();
        FunctionNode fn = new FunctionNode(name, ctx.getStart().getLine());

        if (ctx.parameters() != null) {
            for (TerminalNode id : ctx.parameters().ID()) {
                fn.addChild(new ParamNode(id.getText(), id.getSymbol().getLine()));
            }
        }

        if (ctx.block() != null) {
            ASTNode blockNode = visit(ctx.block());
            if (blockNode != null) {
                fn.addChild(blockNode);
            }
        }

        return fn;
    }

    // ============ IF ============
    @Override
    public ASTNode visitIfStmtNode(PyFlaskParser.IfStmtNodeContext ctx) {
        IfNode ifNode = new IfNode("If", ctx.getStart().getLine());

        ASTNode condition = visit(ctx.expr());
        ifNode.addChild(condition);

        ASTNode thenBlock = visit(ctx.block(0));
        if (thenBlock != null) {
            ifNode.addChild(thenBlock);
        }

        if (ctx.block().size() > 1) {
            ASTNode elseNode = new ASTNode("Else", ctx.ELSE().getSymbol().getLine()) {};
            ASTNode elseBlock = visit(ctx.block(1));
            if (elseBlock != null) {
                elseNode.addChild(elseBlock);
            }
            ifNode.addChild(elseNode);
        }

        return ifNode;
    }

    // ============ FOR ============
    @Override
    public ASTNode visitForStmtNode(PyFlaskParser.ForStmtNodeContext ctx) {
        String variable = ctx.ID().getText();
        ASTNode iterable = visit(ctx.expr());

        ForNode forNode = new ForNode(variable, iterable, ctx.getStart().getLine());

        ASTNode block = visit(ctx.block());
        if (block != null) {
            forNode.addChild(block);
        }

        return forNode;
    }

    // ============ ASSIGNMENT ============
    @Override
    public ASTNode visitAssignStmtNode(PyFlaskParser.AssignStmtNodeContext ctx) {
        ASTNode left  = visit(ctx.expr(0));
        ASTNode right = visit(ctx.expr(1));
        return new AssignmentNode(left, right, ctx.getStart().getLine());
    }

    // ============ RETURN ============
    @Override
    public ASTNode visitReturnStmtNode(PyFlaskParser.ReturnStmtNodeContext ctx) {
        ASTNode value;
        if (ctx.expr() != null) {
            value = visit(ctx.expr());
        } else {
            value = new LiteralNode("Literal", "None", ctx.getStart().getLine());
        }
        return new ReturnNode(value, ctx.getStart().getLine());
    }

    // ============ BLOCK ============
    @Override
    public ASTNode visitBlockNode(PyFlaskParser.BlockNodeContext ctx) {
        BlockNode block = new BlockNode(ctx.getStart().getLine());
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

    // ============ TERNARY ============
    @Override
    public ASTNode visitTernaryExpr(PyFlaskParser.TernaryExprContext ctx) {
        ASTNode trueValue  = visit(ctx.expr(0));
        ASTNode condition  = visit(ctx.expr(1));
        ASTNode falseValue = visit(ctx.expr(2));
        return new TernaryNode(trueValue, condition, falseValue, ctx.getStart().getLine());
    }

    // ============ DECORATOR ============
    @Override
    public ASTNode visitDecoratorNode(PyFlaskParser.DecoratorNodeContext ctx) {
        ASTNode decExpr = visit(ctx.decoratorExpr());
        RouteNode node = new RouteNode("@", ctx.getStart().getLine());
        node.addChild(decExpr);
        return node;
    }

    @Override
    public ASTNode visitDecName(PyFlaskParser.DecNameContext ctx) {
        return new ASTNode("DecName: " + ctx.ID().getText(), ctx.getStart().getLine()) {};
    }

    @Override
    public ASTNode visitDecAttribute(PyFlaskParser.DecAttributeContext ctx) {
        ASTNode parent = visit(ctx.decoratorExpr());
        ASTNode node = new ASTNode("DecAttribute: " + ctx.ID().getText(), ctx.getStart().getLine()) {};
        node.addChild(parent);
        return node;
    }

    @Override
    public ASTNode visitDecCall(PyFlaskParser.DecCallContext ctx) {
        ASTNode target = visit(ctx.decoratorExpr());
        ASTNode node = new ASTNode("DecCall", ctx.getStart().getLine()) {};
        node.addChild(target);

        if (ctx.argList() != null) {
            ASTNode argListNode = visit(ctx.argList());
            if (argListNode != null) {
                node.addChild(argListNode);
            }
        }
        return node;
    }

    // ============ BREAK / CONTINUE ============
    @Override
    public ASTNode visitBreakStmtNode(PyFlaskParser.BreakStmtNodeContext ctx) {
        return new BreakNode(ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitContinueStmt(PyFlaskParser.ContinueStmtContext ctx) {
        int line = ctx.CONTINUE().getSymbol().getLine();
        return new ContinueNode(line);
    }

    // ============ DICT / LIST LITERALS ============
    // ============================================================
    // تعديل: كانت هاي الدوال ببني عقد ASTNode عامة بأسماء نصية
    // ("Dictionary Structure", "Field: id") بدل استخدام الكلاسات
    // الحقيقية DictNode/ListNode/DictEntryNode المعرّفة أصلاً
    // بالمشروع (وكانت موجودة بس غير مستخدمة، تمامًا متل VOID_TAGS
    // بجانب Jinja). صرنا نستخدمها فعليًا، عشان DataBridge (وأي كود
    // لاحق) يقدر يتعامل معها بـ instanceof نوعي وواضح، بدل تحليل
    // نصوص هش (fragile string parsing). هاد التعديل مقصود ومقبول
    // رغم كسر التوافق مع PythonCodeGenerator (round-trip)، لأنه
    // الأخير تمرين أكاديمي إضافي فقط ومش جزء من خط التسليم الرسمي
    // (الدكتور حدد إنه "Generator" الحقيقي بيطلّع Context Data،
    // مش كود Python من جديد).
    // ============================================================
    @Override
    public ASTNode visitDictLiteralNode(PyFlaskParser.DictLiteralNodeContext ctx) {
        DictNode dictNode = new DictNode(ctx.getStart().getLine());

        List<TerminalNode> keys = ctx.STRING();
        List<PyFlaskParser.ExprContext> values = ctx.expr();

        for (int i = 0; i < keys.size(); i++) {
            String keyName = keys.get(i).getText().replace("\"", "");
            ASTNode value = visit(values.get(i));
            DictEntryNode entry = new DictEntryNode(keyName, value, keys.get(i).getSymbol().getLine());
            dictNode.addChild(entry);
        }

        return dictNode;
    }

    @Override
    public ASTNode visitListLiteralNode(PyFlaskParser.ListLiteralNodeContext ctx) {
        ListNode listNode = new ListNode(ctx.getStart().getLine());
        for (PyFlaskParser.ExprContext expr : ctx.expr()) {
            listNode.addChild(visit(expr));
        }
        return listNode;
    }

    // ============ ATTRIBUTE / SUBSCRIPT ============
    @Override
    public ASTNode visitAttribute(PyFlaskParser.AttributeContext ctx) {
        ASTNode obj = visit(ctx.expr());
        String attr = ctx.ID().getText();

        ASTNode node = new ASTNode("Attribute: " + attr, ctx.getStart().getLine()) {};
        node.addChild(obj);
        return node;
    }

    @Override
    public ASTNode visitSubscript(PyFlaskParser.SubscriptContext ctx) {
        ASTNode target = visit(ctx.expr(0));
        ASTNode index  = visit(ctx.expr(1));

        ASTNode node = new ASTNode("Subscript", ctx.getStart().getLine()) {};
        node.addChild(target);
        node.addChild(index);
        return node;
    }

    // ============ FUNCTION CALL ============
    @Override
    public ASTNode visitFunctionCall(PyFlaskParser.FunctionCallContext ctx) {
        ASTNode function = visit(ctx.expr());

        List<ASTNode> args = new ArrayList<>();
        if (ctx.argList() != null) {
            ASTNode argListNode = visit(ctx.argList());
            if (argListNode != null) {
                args.addAll(argListNode.getChildren());
            }
        }

        return new CallNode(function, args, ctx.getStart().getLine());
    }

    // ============ BOOLEAN / COMPARISON EXPRESSIONS ============
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

    // ============ ATOMS ============
    @Override
    public ASTNode visitAtomIdNode(PyFlaskParser.AtomIdNodeContext ctx) {
        return new ASTNode("Var: " + ctx.ID().getText(), ctx.ID().getSymbol().getLine()) {};
    }

    @Override
    public ASTNode visitAtomNumberNode(PyFlaskParser.AtomNumberNodeContext ctx) {
        return new ASTNode("Number: " + ctx.NUMBER().getText(), ctx.NUMBER().getSymbol().getLine()) {};
    }

    @Override
    public ASTNode visitAtomStringNode(PyFlaskParser.AtomStringNodeContext ctx) {
        return new ASTNode("String: " + ctx.STRING().getText(), ctx.STRING().getSymbol().getLine()) {};
    }

    // ============ ARITHMETIC ============
    @Override
    public ASTNode visitAddition(PyFlaskParser.AdditionContext ctx) {
        ASTNode left = visit(ctx.expr(0));
        ASTNode right = visit(ctx.expr(1));
        return new BinaryOpNode(left, "+", right, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitSubtraction(PyFlaskParser.SubtractionContext ctx) {
        ASTNode left = visit(ctx.expr(0));
        ASTNode right = visit(ctx.expr(1));
        return new BinaryOpNode(left, "-", right, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitMultiplication(PyFlaskParser.MultiplicationContext ctx) {
        ASTNode left = visit(ctx.expr(0));
        ASTNode right = visit(ctx.expr(1));
        return new BinaryOpNode(left, "*", right, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitDivision(PyFlaskParser.DivisionContext ctx) {
        ASTNode left = visit(ctx.expr(0));
        ASTNode right = visit(ctx.expr(1));
        return new BinaryOpNode(left, "/", right, ctx.getStart().getLine());
    }

    // ============ LITERALS ============
    @Override
    public ASTNode visitTrueLit(PyFlaskParser.TrueLitContext ctx) {
        return new ASTNode("Boolean: True", ctx.getStart().getLine()) {};
    }

    @Override
    public ASTNode visitFalseLit(PyFlaskParser.FalseLitContext ctx) {
        return new ASTNode("Boolean: False", ctx.getStart().getLine()) {};
    }

    @Override
    public ASTNode visitNoneLit(PyFlaskParser.NoneLitContext ctx) {
        return new ASTNode("Literal: None", ctx.getStart().getLine()) {};
    }

    @Override
    public ASTNode visitParens(PyFlaskParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    // ============ ARG LIST / ARG ============
    @Override
    public ASTNode visitArgList(PyFlaskParser.ArgListContext ctx) {
        ASTNode argListNode = new ASTNode("ArgList", ctx.getStart().getLine()) {};
        if (ctx.arg() != null) {
            for (PyFlaskParser.ArgContext argCtx : ctx.arg()) {
                ASTNode childArg = visit(argCtx);
                if (childArg != null) argListNode.addChild(childArg);
            }
        }
        return argListNode;
    }


    @Override
    public ASTNode visitArg(PyFlaskParser.ArgContext ctx) {
        if (ctx.ID() != null) {
            ASTNode value = visit(ctx.expr());
            return new KeywordArgNode(ctx.ID().getText(), value, ctx.getStart().getLine());
        }
        return visit(ctx.expr());
    }
}