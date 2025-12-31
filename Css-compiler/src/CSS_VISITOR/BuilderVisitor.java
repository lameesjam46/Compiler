package CSS_VISITOR;

import CSS_AST.*;
import CSS_Antlr.ParserCss;
import CSS_Antlr.ParserCssBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

 public class BuilderVisitor extends ParserCssBaseVisitor<ASTNode> {


    @Override
    public ASTNode visitStyle(ParserCss.StyleContext ctx) {

        StyleNode style = new StyleNode(ctx.getStart().getLine());

        for (ParserCss.StatementContext st : ctx.statement()) {
            StatementNode stmt = (StatementNode) visit(st);
            style.statements.add(stmt);
        }

        return style;
    }

    @Override
    public ASTNode visitStatement(ParserCss.StatementContext ctx) {


        if (ctx.importStatement() != null) {
            return visit(ctx.importStatement());
        }


        if (ctx.rule_() != null) {
            return visit(ctx.rule_());
        }


        if (ctx.mediaRule() != null) {
            return visit(ctx.mediaRule());
        }

        return null;
    }

    @Override
    public ASTNode visitImportStatement(ParserCss.ImportStatementContext ctx) {

         String fullText = ctx.STRING().getText();
        String fileName = fullText.substring(1, fullText.length() - 1);

        return new ImportNode(fileName, ctx.getStart().getLine());
    }
    @Override
    public ASTNode visitRule(ParserCss.RuleContext ctx) {

        SelectorGroupNode selectors =
                (SelectorGroupNode) visit(ctx.selectorGroup());

        List<PropertyNode> properties = new ArrayList<>();
        for (ParserCss.PropertyContext p : ctx.property()) {
            properties.add((PropertyNode) visit(p));
        }

        return new RuleNode(selectors, properties, ctx.getStart().getLine());
    }

     @Override
     public ASTNode visitMediaRule(ParserCss.MediaRuleContext ctx) {
         MediaNode media = new MediaNode(ctx.getStart().getLine());

          for (ParserCss.RuleContext r : ctx.rule_()) {
              media.rules.add((RuleNode) visit(r));
          }

         return media;
     }

    @Override
    public ASTNode visitSelectorGroup(ParserCss.SelectorGroupContext ctx) {
        SelectorGroupNode group =
                new SelectorGroupNode(ctx.getStart().getLine());

        for (ParserCss.SelectorContext s : ctx.selector()) {
            group.selectors.add((SelectorNode) visit(s));
        }

        return group;
    }

    @Override
    public ASTNode visitSelector(ParserCss.SelectorContext ctx) {
        return new SelectorNode(
                (SimpleSelectorNode) visit(ctx.simpleSelector()),
                ctx.getStart().getLine()
        );
    }

    @Override
    public ASTNode visitSimpleSelector(ParserCss.SimpleSelectorContext ctx) {
        SimpleSelectorNode simple =
                new SimpleSelectorNode(ctx.getStart().getLine());

        if (ctx.elementName() != null)
            simple.elementName =
                    (ElementNameNode) visit(ctx.elementName());

        for (ParseTree t : ctx.children) {
            String txt = t.getText();
            int line = ctx.getStart().getLine();

            if (txt.startsWith("#"))
                simple.modifiers.add(
                        new ModifierNode(ModifierType.ID, txt.substring(1), line));

            else if (txt.startsWith("."))
                simple.modifiers.add(
                        new ModifierNode(ModifierType.CLASS, txt.substring(1), line));

            else if (txt.startsWith(":"))
                simple.modifiers.add(
                        new ModifierNode(ModifierType.PSEUDO, txt.substring(1), line));
        }

        return simple;
    }

    @Override
    public ASTNode visitElementName(ParserCss.ElementNameContext ctx) {
        return new ElementNameNode(ctx.getText(), ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitProperty(ParserCss.PropertyContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public ASTNode visitColor_rule(ParserCss.Color_ruleContext ctx) {
        return new ColorNode(ctx.COLOR_VALUE().getText(),
                ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitFont_size_rule(ParserCss.Font_size_ruleContext ctx) {
        return new FontSizeNode(ctx.getChild(2).getText(),
                ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitFont_family(ParserCss.Font_familyContext ctx) {
        return new FontFamilyNode(ctx.CSS_ELEMENT().getText(),
                ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitFont_weight_rule(ParserCss.Font_weight_ruleContext ctx) {
        return new FontWeightNode(ctx.VALUE_FONT_WEIGHT().getText(),
                ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitTextalign_rule(ParserCss.Textalign_ruleContext ctx) {
        return new TextAlignNode(ctx.VALUE_TEXT_ALIGN().getText(),
                ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitDisplay_rule(ParserCss.Display_ruleContext ctx) {
        return new DisplayNode(ctx.getChild(2).getText(),
                ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitOpacity_rule(ParserCss.Opacity_ruleContext ctx) {
        return new OpacityNode(ctx.VALUE_GENERAL().getText(),
                ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitPosition_rule(ParserCss.Position_ruleContext ctx) {
        return new PositionNode(ctx.VALUE_POSITION().getText(),
                ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitBackground_rule(ParserCss.Background_ruleContext ctx) {
        return new BackgroundNode(ctx.COLOR_VALUE().getText(),
                ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitBorder_rule(ParserCss.Border_ruleContext ctx) {
        int line = ctx.getStart().getLine();

        if (ctx.NONE_KW() != null)
            return new BorderNode("none", "", "", line);

        return new BorderNode(
                ctx.VALUE_GENERAL().getText(),
                ctx.BORDER_STYLE().getText(),
                ctx.COLOR_VALUE() != null ? ctx.COLOR_VALUE().getText() : null,
                line
        );
    }

    @Override
    public ASTNode visitSize1_rule(ParserCss.Size1_ruleContext ctx) {
        return new Size1Node(
                ctx.SIZE_1().getText(),
                ctx.getChild(2).getText(),
                ctx.getStart().getLine()
        );
    }

    @Override
    public ASTNode visitSize2_rule(ParserCss.Size2_ruleContext ctx) {
        List<String> values = new ArrayList<>();
        for (ParseTree t : ctx.box_value().children)
            values.add(t.getText());

        return new Size2Node(
                ctx.SIZE_2().getText(),
                values,
                ctx.getStart().getLine()
        );
    }


}





