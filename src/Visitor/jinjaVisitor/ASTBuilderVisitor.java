package Visitor.jinjaVisitor;

import AST.JinjaAST.*;
import Grammer.JinjaAntlr.Grammer.JinjaAntlr.JinjaParser;
import Grammer.JinjaAntlr.Grammer.JinjaAntlr.JinjaParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ASTBuilderVisitor extends JinjaParserBaseVisitor<Object> {


    private static final Set<String> VOID_TAGS = Set.of(
            "area", "base", "br", "col", "embed", "hr", "img", "input",
            "link", "meta", "param", "source", "track", "wbr"
    );
    @Override
    public Program visitDocumentRoot(JinjaParser.DocumentRootContext ctx) {
        Program program = new Program(ctx.getStart().getLine());
        if (ctx.node() != null) {
            for (var n : ctx.node()) {
                Node child = (Node) visit(n);
                if (child != null) {
                    program.addNode(child);
                }
            }
        }
        return program;
    }

    // ======================================================
    // HTML NODES (Hierarchical)
    // ======================================================

    @Override
    public Node visitHtmlNormalElement(JinjaParser.HtmlNormalElementContext ctx) {
        // 1. جلب اسم التاج الافتتاحي (هذا يعمل لأنه في القاعدة الأم)
        String openTag = ctx.TAG_NAME().getText();

        // 2. الوصول للقاعدة endTag
        JinjaParser.EndTagContext endTagCtx = ctx.endTag();

        // 3. الحل الجذري: استخدام getChild للوصول للتوكن مباشرة
        // في قاعدتك: endTag : TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE;
        // الترتيب: 0=TAG_OPEN, 1=TAG_SLASH, 2=TAG_NAME, 3=TAG_CLOSE
        String closeTag = endTagCtx.getChild(2).getText();

        // التحقق من المطابقة
        if (!openTag.equals(closeTag)) {
            throw new RuntimeException("Error at line " + ctx.getStart().getLine() +
                    ": Tag mismatch! Expected </" + openTag + "> but found </" + closeTag + ">");
        }

        // بناء العنصر (مع تحديد أنه ليس Self-Closing)
        HtmlElement el = new HtmlElement(ctx.getStart().getLine(), openTag, false);

        // إضافة الخصائص
        for (JinjaParser.HtmlAttributeContext attrCtx : ctx.htmlAttribute()) {
            el.addAttribute((HtmlAttribute) visit(attrCtx));
        }

        // إضافة الأبناء
        for (JinjaParser.HtmlContentContext contentCtx : ctx.htmlContent()) {
            Node child = (Node) visit(contentCtx);
            if (child != null) {
                el.addChild(child);
            }
        }

        return el;
    }

    @Override
    public Node visitHtmlSelfClosingElement(JinjaParser.HtmlSelfClosingElementContext ctx) {
        String tagName = ctx.TAG_NAME().getText();

        // نمرر true لأن القواعد حددته كـ self-closing
        HtmlElement el = new HtmlElement(ctx.getStart().getLine(), tagName, true);

        for (var attr : ctx.htmlAttribute()) {
            el.addAttribute((HtmlAttribute) visit(attr));
        }
        return el;
    }

    @Override
    public HtmlAttribute visitHtmlAttr(JinjaParser.HtmlAttrContext ctx) {
        return new HtmlAttribute(
                ctx.getStart().getLine(),
                ctx.TAG_NAME().getText(),
                ctx.TAG_STRING().getText()
        );
    }

    @Override
    public Node visitHtmlContentNode(JinjaParser.HtmlContentNodeContext ctx) {
        return (Node) visit(ctx.node());
    }

    // ======================================================
    // JINJA BLOCKS (Control Flow)
    // ======================================================

    @Override
    public IfStmt visitBlockIf(JinjaParser.BlockIfContext ctx) {
        Expression condition = (Expression) visit(ctx.expression());

        // 1. الأبناء داخل الـ IF الرئيسي (Then Branch)
        List<Node> thenBranch = new ArrayList<>();
        for (JinjaParser.NodeContext n : ctx.node()) {
            thenBranch.add((Node) visit(n));
        }

        // 2. الـ Elifs باستخدام الأسماء الجديدة في الـ G4
        List<ElifStmt> elifs = new ArrayList<>();
        for (var e : ctx.elifBlock()) {
            elifs.add((ElifStmt) visit(e));
        }

        // 3. الـ Else
        ElseStmt elseStmt = ctx.elseBlock() != null ? (ElseStmt) visit(ctx.elseBlock()) : null;

        return new IfStmt(ctx.getStart().getLine(), condition, thenBranch, elifs, elseStmt);
    }

    @Override
    public ElifStmt visitElifBlockStmt(JinjaParser.ElifBlockStmtContext ctx) {
        Expression condition = (Expression) visit(ctx.expression());
        List<Node> body = new ArrayList<>();
        for (JinjaParser.NodeContext n : ctx.node()) {
            body.add((Node) visit(n));
        }
        return new ElifStmt(ctx.getStart().getLine(), condition, body);
    }

    @Override
    public ElseStmt visitElseBlockStmt(JinjaParser.ElseBlockStmtContext ctx) {
        List<Node> body = new ArrayList<>();
        for (var n : ctx.node()) {
            body.add((Node) visit(n));
        }
        return new ElseStmt(ctx.getStart().getLine(), body);
    }

    @Override
    public ForStmt visitBlockFor(JinjaParser.BlockForContext ctx) {
        String varName = ctx.JINJA_ID().getText();
        Expression iterable = (Expression) visit(ctx.expression());

        List<Node> body = new ArrayList<>();
        for (var n : ctx.node()) {
            body.add((Node) visit(n));
        }
        return new ForStmt(ctx.getStart().getLine(), varName, iterable, body);
    }

    @Override
    public SetStmt visitBlockSet(JinjaParser.BlockSetContext ctx) {
        return new SetStmt(
                ctx.getStart().getLine(),                 // السطر// العمود (هذا ما سيتم تخزينه في كلاس SetStmt)
                ctx.JINJA_ID().getText(),                 // اسم المتغير
                (Expression) visit(ctx.expression())      // القيمة المسندة
        );
    }

    @Override
    public Node visitBlockSimple(JinjaParser.BlockSimpleContext ctx) {
        if (ctx.JINJA_BREAK() != null) return new BreakStmt(ctx.getStart().getLine());
        return new ContinueStmt(ctx.getStart().getLine());
    }

    // ======================================================
    // EXPRESSIONS & LITERALS
    // ======================================================

    @Override
    public JinjaExpression visitJinjaExpression(JinjaParser.JinjaExpressionContext ctx) {
        return new JinjaExpression(ctx.getStart().getLine(), (Expression) visit(ctx.expression()));
    }

    @Override
    public Expression visitExprOr(JinjaParser.ExprOrContext ctx) {
        Expression left = (Expression) visit(ctx.logicalAndExpr(0));
        for (int i = 1; i < ctx.logicalAndExpr().size(); i++) {
            left = new BinaryExpr(ctx.getStart().getLine(), left, "or", (Expression) visit(ctx.logicalAndExpr(i)));
        }
        return left;
    }

    @Override
    public Expression visitExprAnd(JinjaParser.ExprAndContext ctx) {
        Expression left = (Expression) visit(ctx.logicalNotExpr(0));
        for (int i = 1; i < ctx.logicalNotExpr().size(); i++) {
            left = new BinaryExpr(ctx.getStart().getLine(), left, "and", (Expression) visit(ctx.logicalNotExpr(i)));
        }
        return left;
    }

    @Override
    public Expression visitExprNot(JinjaParser.ExprNotContext ctx) {
        return new UnaryExpr(ctx.getStart().getLine(), "not ", (Expression) visit(ctx.logicalNotExpr()));
    }

    @Override
    public Expression visitExprCompare(JinjaParser.ExprCompareContext ctx) {
        Expression left = (Expression) visit(ctx.additiveExpr(0));
        for (int i = 1; i < ctx.additiveExpr().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            left = new BinaryExpr(ctx.getStart().getLine(), left, op, (Expression) visit(ctx.additiveExpr(i)));
        }
        return left;
    }

    @Override
    public Expression visitExprPostfix(JinjaParser.ExprPostfixContext ctx) {
        Expression base = (Expression) visit(ctx.primary());
        PostfixExpr pe = new PostfixExpr(ctx.getStart().getLine(), base);
        for (var p : ctx.postfixPart()) {
            pe.addPart((PostfixPart) visit(p));
        }
        return pe;
    }

    // --- Postfix Parts (Using your specific AST classes) ---

    @Override
    public PostfixPart visitPostfixProperty(JinjaParser.PostfixPropertyContext ctx) {
        return new PropertyAccess(ctx.getStart().getLine(), ctx.JINJA_ID().getText());
    }

    @Override
    public PostfixPart visitPostfixFilter(JinjaParser.PostfixFilterContext ctx) {
        return new FilterCall(ctx.getStart().getLine(), ctx.JINJA_ID().getText());
    }

    @Override
    public PostfixPart visitPostfixIndex(JinjaParser.PostfixIndexContext ctx) {
        if (ctx.sliceExpr() instanceof JinjaParser.SliceIndexContext slice) {
            return new IndexAccess(ctx.getStart().getLine(), (Expression) visit(slice.expression()));
        } else {
            JinjaParser.SliceRangeContext range = (JinjaParser.SliceRangeContext) ctx.sliceExpr();
            Expression start = range.expression(0) != null ? (Expression) visit(range.expression(0)) : null;
            Expression end = range.expression(1) != null ? (Expression) visit(range.expression(1)) : null;
            return new IndexAccess(ctx.getStart().getLine(), start, end);
        }
    }

    // --- Literals (Handling all types from grammar) ---

    @Override
    public Expression visitLiteralId(JinjaParser.LiteralIdContext ctx) {
        return new Identifier(ctx.getStart().getLine(), ctx.JINJA_ID().getText());
    }

    @Override
    public Expression visitLiteralInt(JinjaParser.LiteralIntContext ctx) {
        return new Literal(ctx.getStart().getLine(), Integer.parseInt(ctx.JINJA_INT().getText()));
    }

    @Override
    public Expression visitLiteralDouble(JinjaParser.LiteralDoubleContext ctx) {
        return new Literal(ctx.getStart().getLine(), Double.parseDouble(ctx.JINJA_DOUBLE().getText()));
    }

    @Override
    public Expression visitLiteralString(JinjaParser.LiteralStringContext ctx) {
        return new Literal(ctx.getStart().getLine(), ctx.JINJA_STRING().getText());
    }

    @Override
    public Expression visitLiteralTrue(JinjaParser.LiteralTrueContext ctx) {
        return new Literal(ctx.getStart().getLine(), true);
    }

    @Override
    public Expression visitLiteralFalse(JinjaParser.LiteralFalseContext ctx) {
        return new Literal(ctx.getStart().getLine(), false);
    }

    @Override
    public Expression visitLiteralNone(JinjaParser.LiteralNoneContext ctx) {
        return new Literal(ctx.getStart().getLine(), null);
    }

    @Override
    public Expression visitLiteralParen(JinjaParser.LiteralParenContext ctx) {
        return (Expression) visit(ctx.expression());
    }

    // ======================================================
    // HELPER VISITS
    // ======================================================

    @Override
    public Node visitNodeHtmlText(JinjaParser.NodeHtmlTextContext ctx) {
        return new HtmlText(ctx.getStart().getLine(), ctx.HTML_TEXT().getText());
    }

    @Override
    public Node visitNodeHtmlComment(JinjaParser.NodeHtmlCommentContext ctx) {
        return new HtmlComment(ctx.getStart().getLine(), ctx.HTML_COMMENT().getText());
    }

    @Override
    public Node visitNodeHtmlDoctype(JinjaParser.NodeHtmlDoctypeContext ctx) {
        return new HtmlDoctype(ctx.getStart().getLine(), ctx.HTML_DOCTYPE().getText());
    }
    @Override
    public Expression visitExprUnaryMinus(JinjaParser.ExprUnaryMinusContext ctx) {
        return new UnaryExpr(ctx.getStart().getLine(), "-", (Expression) visit(ctx.unaryExpr()));
    }
}