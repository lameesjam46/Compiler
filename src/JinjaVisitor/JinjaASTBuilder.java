package JinjaVisitor;

import JinjaAST.*;
import JinjaGrammer.JinjaParser;
import JinjaGrammer.JinjaParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class JinjaASTBuilder extends JinjaParserBaseVisitor<ASTNode> {

    // ======================================================
    // document
    // ======================================================
    @Override
    public ASTNode visitDocumentRoot(JinjaParser.DocumentRootContext ctx) {

        List<ASTNode> children = new ArrayList<>();

        for (JinjaParser.NodeContext n : ctx.node()) {
            ASTNode child = visit(n);
            if (child != null) {
                children.add(child);
            }
        }

        return new HtmlNode("template", children, ctx.getStart().getLine());
    }

    // ======================================================
    // TEXT
    // ======================================================
    @Override
    public ASTNode visitNodeHtmlText(JinjaParser.NodeHtmlTextContext ctx) {
        return new TextNode(
                ctx.HTML_TEXT().getText(),
                ctx.getStart().getLine()
        );
    }

    // ======================================================
    // HTML <tag>...</tag>
    // ======================================================
    @Override
    public ASTNode visitHtmlNormalElement(JinjaParser.HtmlNormalElementContext ctx) {

        String tag = ctx.TAG_NAME().getText();
        List<ASTNode> children = new ArrayList<>();

        if (ctx.htmlContent() != null) {

            JinjaParser.HtmlContentBlockContext content =
                    (JinjaParser.HtmlContentBlockContext) ctx.htmlContent();

            for (JinjaParser.NodeContext n : content.node()) {
                ASTNode child = visit(n);
                if (child != null) {
                    children.add(child);
                }
            }
        }

        return new HtmlNode(tag, children, ctx.getStart().getLine());
    }


    @Override
    public ASTNode visitHtmlSelfClosingElement(JinjaParser.HtmlSelfClosingElementContext ctx) {
        return new HtmlNode(
                ctx.TAG_NAME().getText(),
                new ArrayList<>(),
                ctx.getStart().getLine()
        );
    }

    // ======================================================
    // {{ expression }}
    // ======================================================
    @Override
    public ASTNode visitJinjaExpression(JinjaParser.JinjaExpressionContext ctx) {
        return new JinjaExprNode(
                ctx.expression().getText(),
                ctx.getStart().getLine()
        );
    }

    // ======================================================
    // {% if %}
    // ======================================================
    @Override
    public ASTNode visitIfStatement(JinjaParser.IfStatementContext ctx) {

        JinjaExprNode condition =
                new JinjaExprNode(
                        ctx.expression().getText(),
                        ctx.getStart().getLine()
                );

        return new JinjaIfNode(
                condition,
                new ArrayList<>(),
                ctx.getStart().getLine()
        );
    }

    // ======================================================
    // {% for %}
    // ======================================================
    @Override
    public ASTNode visitForStatement(JinjaParser.ForStatementContext ctx) {

        String variable = ctx.JINJA_ID().getText();

        JinjaExprNode iterable =
                new JinjaExprNode(
                        ctx.expression().getText(),
                        ctx.getStart().getLine()
                );

        return new JinjaForNode(
                variable,
                iterable,
                new ArrayList<>(),
                ctx.getStart().getLine()
        );
    }
}
