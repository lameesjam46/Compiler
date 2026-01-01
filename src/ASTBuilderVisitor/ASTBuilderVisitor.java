package ASTBuilderVisitor;
import JinjaAST.HtmlAttribute;
import JinjaAST.HtmlElement;
import JinjaAST.Node;
import JinjaAST.HtmlComment;
import JinjaAST.HtmlDoctype;
import JinjaAST.JinjaExpression;
import JinjaAST.JinjaStatement;
import JinjaAST.IfStmt;
import JinjaAST.ElifStmt;
import JinjaAST.Identifier ;
import JinjaAST.Literal;
import JinjaAST.PostfixExpr;
import JinjaAST.Expression;
import JinjaAST.ElseStmt;
import JinjaAST.ContinueStmt;
import JinjaAST.BinaryExpr;
import JinjaAST.ForStmt;
import JinjaAST.BreakStmt;
import JinjaAST.SetStmt;
import JinjaAST.UnaryExpr;
import JinjaAST.HtmlText;
import JinjaAST.Program;
import JinjaAST.IndexAccess;
import JinjaAST.FilterCall;
import JinjaAST.*;
import JinjaGrammer.JinjaParser;
import JinjaGrammer.JinjaParserBaseVisitor;

import java.util.*;
public class ASTBuilderVisitor extends JinjaParserBaseVisitor<Object> {

    // =====================================================
    // Document
    // =====================================================
    @Override
    public Program visitDocumentRoot(JinjaParser.DocumentRootContext ctx) {
        Program program = new Program(ctx.getStart().getLine());
        for (var n : ctx.node()) {
            Node child = (Node) visit(n);
            if (child != null) {
                program.addNode(child);
            }
        }
        return program;
    }

    // =====================================================
    // Generic nodes
    // =====================================================
    @Override
    public Node visitNodeHtml(JinjaParser.NodeHtmlContext ctx) {
        return (Node) visit(ctx.htmlElement());
    }

    @Override
    public Node visitNodeJinjaExpr(JinjaParser.NodeJinjaExprContext ctx) {
        return (Node) visit(ctx.jinjaExpr());
    }

    @Override
    public Node visitNodeJinjaStmt(JinjaParser.NodeJinjaStmtContext ctx) {
        return (Node) visit(ctx.jinjaStmt());
    }

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

    // =====================================================
    // HTML
    // =====================================================
    @Override
    public Node visitHtmlNormalElement(JinjaParser.HtmlNormalElementContext ctx) {
        HtmlElement el = new HtmlElement(
                ctx.getStart().getLine(),
                ctx.TAG_NAME().getText()
        );

        // attributes
        for (var attr : ctx.htmlAttribute()) {
            el.addAttribute((HtmlAttribute) visit(attr));
        }

        // html content (FIX)
        for (var hc : ctx.htmlContent()) {
            Object result = visit(hc);
            if (result instanceof List<?> list) {
                for (Object o : list) {
                    el.addChild((Node) o);
                }
            }
        }

        return el;
    }

    @Override
    public Node visitHtmlSelfClosingElement(JinjaParser.HtmlSelfClosingElementContext ctx) {
        HtmlElement el = new HtmlElement(
                ctx.getStart().getLine(),
                ctx.TAG_NAME().getText()
        );
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

    // =====================================================
    // HTML Content Block  (IMPORTANT FIX)
    // =====================================================
    @Override
    public Object visitHtmlContentBlock(JinjaParser.HtmlContentBlockContext ctx) {
        List<Node> nodes = new ArrayList<>();
        for (var n : ctx.node()) {
            Node child = (Node) visit(n);
            if (child != null) {
                nodes.add(child);
            }
        }
        return nodes;
    }

    // =====================================================
    // Jinja
    // =====================================================
    @Override
    public JinjaExpression visitJinjaExpression(JinjaParser.JinjaExpressionContext ctx) {
        return new JinjaExpression(
                ctx.getStart().getLine(),
                (Expression) visit(ctx.expression())
        );
    }

    @Override
    public JinjaStatement visitJinjaStatement(JinjaParser.JinjaStatementContext ctx) {
        return new JinjaStatement(
                ctx.getStart().getLine(),
                (Stmt) visit(ctx.stmt())
        );
    }

    // =====================================================
    // Statements
    // =====================================================
    @Override
    public IfStmt visitIfStatement(JinjaParser.IfStatementContext ctx) {
        return new IfStmt(
                ctx.getStart().getLine(),
                (Expression) visit(ctx.expression())
        );
    }

    @Override
    public ElifStmt visitElifStatement(JinjaParser.ElifStatementContext ctx) {
        return new ElifStmt(
                ctx.getStart().getLine(),
                (Expression) visit(ctx.expression())
        );
    }

    @Override
    public ElseStmt visitElseStatement(JinjaParser.ElseStatementContext ctx) {
        return new ElseStmt(ctx.getStart().getLine());
    }

    @Override
    public ForStmt visitForStatement(JinjaParser.ForStatementContext ctx) {
        return new ForStmt(
                ctx.getStart().getLine(),
                ctx.JINJA_ID().getText(),
                (Expression) visit(ctx.expression())
        );
    }

    @Override

    public SetStmt visitSetStatement(JinjaParser.SetStatementContext ctx) {
        return new SetStmt(
                ctx.getStart().getLine(),                 // line
                ctx.getStart().getCharPositionInLine(),   // column
                ctx.JINJA_ID().getText(),                 // variable name
                (Expression) visit(ctx.expression())      // value
        );
    }


    @Override
    public BreakStmt visitStmtBreak(JinjaParser.StmtBreakContext ctx) {
        return new BreakStmt(ctx.getStart().getLine());
    }

    @Override
    public ContinueStmt visitStmtContinue(JinjaParser.StmtContinueContext ctx) {
        return new ContinueStmt(ctx.getStart().getLine());
    }

    @Override
    public EndIfStmt visitStmtEndIf(JinjaParser.StmtEndIfContext ctx) {
        return new EndIfStmt(ctx.getStart().getLine());
    }

    @Override
    public EndForStmt visitStmtEndFor(JinjaParser.StmtEndForContext ctx) {
        return new EndForStmt(ctx.getStart().getLine());
    }

    // =====================================================
    // Expressions
    // =====================================================
    @Override
    public Expression visitExprOr(JinjaParser.ExprOrContext ctx) {
        Expression left = (Expression) visit(ctx.logicalAndExpr(0));
        for (int i = 1; i < ctx.logicalAndExpr().size(); i++) {
            left = new BinaryExpr(
                    ctx.getStart().getLine(),
                    left,
                    "or",
                    (Expression) visit(ctx.logicalAndExpr(i))
            );
        }
        return left;
    }

    @Override
    public Expression visitExprAnd(JinjaParser.ExprAndContext ctx) {
        Expression left = (Expression) visit(ctx.logicalNotExpr(0));
        for (int i = 1; i < ctx.logicalNotExpr().size(); i++) {
            left = new BinaryExpr(
                    ctx.getStart().getLine(),
                    left,
                    "and",
                    (Expression) visit(ctx.logicalNotExpr(i))
            );
        }
        return left;
    }

    @Override
    public Expression visitExprNot(JinjaParser.ExprNotContext ctx) {
        return new UnaryExpr(
                ctx.getStart().getLine(),
                "not ",
                (Expression) visit(ctx.logicalNotExpr())
        );
    }

    @Override
    public Expression visitExprCompare(JinjaParser.ExprCompareContext ctx) {
        Expression left = (Expression) visit(ctx.additiveExpr(0));
        for (int i = 1; i < ctx.additiveExpr().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            left = new BinaryExpr(
                    ctx.getStart().getLine(),
                    left,
                    op,
                    (Expression) visit(ctx.additiveExpr(i))
            );
        }
        return left;
    }

    @Override
    public Expression visitExprUnaryMinus(JinjaParser.ExprUnaryMinusContext ctx) {
        return new UnaryExpr(
                ctx.getStart().getLine(),
                "-",
                (Expression) visit(ctx.unaryExpr())
        );
    }

    // =====================================================
    // Literals
    // =====================================================
    @Override
    public Expression visitLiteralId(JinjaParser.LiteralIdContext ctx) {
        return new Identifier(ctx.getStart().getLine(), ctx.JINJA_ID().getText());
    }

    @Override
    public Expression visitLiteralInt(JinjaParser.LiteralIntContext ctx) {
        return new Literal(ctx.getStart().getLine(), Integer.parseInt(ctx.JINJA_INT().getText()));
    }

    @Override
    public Expression visitLiteralString(JinjaParser.LiteralStringContext ctx) {
        return new Literal(ctx.getStart().getLine(), ctx.JINJA_STRING().getText());
    }

    // =====================================================
    // Postfix
    // =====================================================
    @Override
    public Expression visitExprPostfix(JinjaParser.ExprPostfixContext ctx) {
        Expression base = (Expression) visit(ctx.primary());
        PostfixExpr pe = new PostfixExpr(ctx.getStart().getLine(), base);
        for (var p : ctx.postfixPart()) {
            pe.addPart((PostfixPart) visit(p));
        }
        return pe;
    }

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
        if (ctx.sliceExpr() instanceof JinjaParser.SliceRangeContext range) {
            Expression start = range.expression(0) != null ? (Expression) visit(range.expression(0)) : null;
            Expression end = range.expression(1) != null ? (Expression) visit(range.expression(1)) : null;
            return new IndexAccess(ctx.getStart().getLine(), start, end);
        } else {
            JinjaParser.SliceIndexContext idx = (JinjaParser.SliceIndexContext) ctx.sliceExpr();
            return new IndexAccess(
                    ctx.getStart().getLine(),
                    (Expression) visit(idx.expression())
            );
        }
    }
}
