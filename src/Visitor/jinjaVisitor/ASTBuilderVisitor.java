package Visitor.jinjaVisitor;
import AST.JinjaAST.HtmlAttribute;
import AST.JinjaAST.HtmlElement;
import AST.JinjaAST.Node;
import AST.JinjaAST.HtmlComment;
import AST.JinjaAST.HtmlDoctype;
import AST.JinjaAST.JinjaExpression;
import AST.JinjaAST.JinjaStatement;
import AST.JinjaAST.IfStmt;
import AST.JinjaAST.ElifStmt;
import AST.JinjaAST.Identifier ;
import AST.JinjaAST.Literal;
import AST.JinjaAST.PostfixExpr;
import AST.JinjaAST.Expression;
import AST.JinjaAST.ElseStmt;
import AST.JinjaAST.ContinueStmt;
import AST.JinjaAST.BinaryExpr;
import AST.JinjaAST.ForStmt;
import AST.JinjaAST.BreakStmt;
import AST.JinjaAST.SetStmt;
import AST.JinjaAST.UnaryExpr;
import AST.JinjaAST.HtmlText;
import AST.JinjaAST.Program;
import AST.JinjaAST.IndexAccess;
import AST.JinjaAST.FilterCall;
import AST.JinjaAST.*;
import Grammer.JinjaAntlr.JinjaParser;
import Grammer.JinjaAntlr.JinjaParserBaseVisitor;

import java.util.*;
public class ASTBuilderVisitor extends JinjaParserBaseVisitor<Object> {


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
