package JinjaVisitor;

import JinjaAST.*;
import JinjaGrammer.JinjaParser;
import JinjaGrammer.JinjaParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class JinjaASTBuilder extends JinjaParserBaseVisitor<ASTNode> {

    // =====================
    // template
    // =====================
    @Override
    public ASTNode visitTemplate(JinjaParser.TemplateContext ctx) {

        List<ASTNode> children = new ArrayList<>();

        for (JinjaParser.ElementContext el : ctx.element()) {
            ASTNode node = visit(el);
            if (node != null) {
                children.add(node);
            }
        }

        return new HtmlNode("template", children, ctx.getStart().getLine());
    }

    // =====================
    // TEXT
    // element : TEXT #TextNode
    // =====================
    @Override
    public ASTNode visitTextNode(JinjaParser.TextNodeContext ctx) {
        return new TextNode(
                ctx.TEXT().getText(),
                ctx.getStart().getLine()
        );
    }

    // =====================
    // {{ variable }}
    // element : variable #JinjaExprNode
    // =====================
    @Override
    public ASTNode visitJinjaExprNode(JinjaParser.JinjaExprNodeContext ctx) {
        return new JinjaExprNode(
                ctx.variable().ID().getText(),
                ctx.getStart().getLine()
        );
    }

    // =====================
    // {% if ID %}
    // element : ifStatement #JinjaIfNode
    // =====================
    @Override
    public ASTNode visitJinjaIfNode(JinjaParser.JinjaIfNodeContext ctx) {

        String condition = ctx.ifStatement().ID().getText();

        List<ASTNode> body = new ArrayList<>();

        for (JinjaParser.ElementContext el : ctx.ifStatement().element()) {
            body.add(visit(el));
        }

        return new JinjaIfNode(
                new JinjaExprNode(condition, ctx.getStart().getLine()),
                body,
                ctx.getStart().getLine()
        );
    }

    // =====================
    // {% for ID in ID %}
    // element : forStatement #JinjaForNode
    // =====================
    @Override
    public ASTNode visitJinjaForNode(JinjaParser.JinjaForNodeContext ctx) {

        String item = ctx.forStatement().ID(0).getText();
        String iterable = ctx.forStatement().ID(1).getText();

        List<ASTNode> body = new ArrayList<>();

        for (JinjaParser.ElementContext el : ctx.forStatement().element()) {
            body.add(visit(el));
        }

        return new JinjaForNode(
                item,
                new JinjaExprNode(iterable, ctx.getStart().getLine()),
                body,
                ctx.getStart().getLine()
        );
    }
}
