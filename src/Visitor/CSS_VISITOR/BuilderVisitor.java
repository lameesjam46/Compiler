package Visitor.CSS_VISITOR;

import AST.CSS_AST.*;
import Grammer.CSSAntlr.ParserCss;
import Grammer.CSSAntlr.ParserCssBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class BuilderVisitor extends ParserCssBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitStyle(ParserCss.StyleContext ctx) {
        StyleNode style = new StyleNode(ctx.getStart().getLine());

        if (ctx.statement() != null) {
            for (ParserCss.StatementContext st : ctx.statement()) {
                StatementNode stmt = (StatementNode) visit(st);
                if (stmt != null) {
                    style.statements.add(stmt);
                }
            }
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
        if (ctx.STRING() == null) return null;

        String fullText = ctx.STRING().getText();
        String fileName = fullText.length() >= 2 ? fullText.substring(1, fullText.length() - 1) : fullText;

        return new ImportNode(fileName, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitRule(ParserCss.RuleContext ctx) {
        SelectorGroupNode selectors = ctx.selectorGroup() != null ? (SelectorGroupNode) visit(ctx.selectorGroup()) : null;

        List<PropertyNode> properties = new ArrayList<>();
        if (ctx.property() != null) {
            for (ParserCss.PropertyContext p : ctx.property()) {
                PropertyNode prop = (PropertyNode) visit(p);
                if (prop != null) {
                    properties.add(prop);
                }
            }
        }

        return new RuleNode(selectors, properties, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitMediaRule(ParserCss.MediaRuleContext ctx) {
        MediaNode media = new MediaNode(ctx.getStart().getLine());

        if (ctx.rule_() != null) {
            for (ParserCss.RuleContext r : ctx.rule_()) {
                ASTNode ruleNode = visit(r);
                if (ruleNode instanceof RuleNode) {
                    media.rules.add((RuleNode) ruleNode);
                }
            }
        }

        return media;
    }

    @Override
    public ASTNode visitSelectorGroup(ParserCss.SelectorGroupContext ctx) {
        SelectorGroupNode group = new SelectorGroupNode(ctx.getStart().getLine());

        if (ctx.selector() != null) {
            for (ParserCss.SelectorContext s : ctx.selector()) {
                ASTNode selectorNode = visit(s);
                if (selectorNode instanceof SelectorNode) {
                    group.selectors.add((SelectorNode) selectorNode);
                }
            }
        }

        return group;
    }

    @Override
    public ASTNode visitSelector(ParserCss.SelectorContext ctx) {
        if (ctx.simpleSelector() == null || ctx.simpleSelector().isEmpty()) {
            return null;
        }

        SimpleSelectorNode firstSimple = (SimpleSelectorNode) visit(ctx.simpleSelector(0));

        return new SelectorNode(
                firstSimple,
                ctx.getStart().getLine()
        );
    }

    @Override
    public ASTNode visitSimpleSelector(ParserCss.SimpleSelectorContext ctx) {
        SimpleSelectorNode simple = new SimpleSelectorNode(ctx.getStart().getLine());

        if (ctx.elementName() != null) {
            simple.elementName = (ElementNameNode) visit(ctx.elementName());
        }

        if (ctx.children != null) {
            for (ParseTree t : ctx.children) {
                String txt = t.getText();
                int line = ctx.getStart().getLine();

                if (txt.startsWith("#")) {
                    simple.modifiers.add(new ModifierNode(ModifierType.ID, txt.substring(1), line));
                } else if (txt.startsWith(".")) {
                    simple.modifiers.add(new ModifierNode(ModifierType.CLASS, txt.substring(1), line));
                } else if (txt.startsWith(":")) {
                    simple.modifiers.add(new ModifierNode(ModifierType.PSEUDO, txt.substring(1), line));
                }
            }
        }

        return simple;
    }

    @Override
    public ASTNode visitElementName(ParserCss.ElementNameContext ctx) {
        return new ElementNameNode(ctx.getText(), ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitSize1Property(ParserCss.Size1PropertyContext ctx) {
        return ctx.size1_rule() != null ? visit(ctx.size1_rule()) : null;
    }

    @Override
    public ASTNode visitSize2Property(ParserCss.Size2PropertyContext ctx) {
        return ctx.size2_rule() != null ? visit(ctx.size2_rule()) : null;
    }

    @Override
    public ASTNode visitTextAlignProperty(ParserCss.TextAlignPropertyContext ctx) {
        return ctx.textalign_rule() != null ? visit(ctx.textalign_rule()) : null;
    }

    @Override
    public ASTNode visitColorProperty(ParserCss.ColorPropertyContext ctx) {
        return ctx.color_rule() != null ? visit(ctx.color_rule()) : null;
    }

    @Override
    public ASTNode visitFontSizeProperty(ParserCss.FontSizePropertyContext ctx) {
        return ctx.font_size_rule() != null ? visit(ctx.font_size_rule()) : null;
    }

    @Override
    public ASTNode visitFontFamilyProperty(ParserCss.FontFamilyPropertyContext ctx) {
        return ctx.font_family() != null ? visit(ctx.font_family()) : null;
    }

    @Override
    public ASTNode visitDisplayProperty(ParserCss.DisplayPropertyContext ctx) {
        return ctx.display_rule() != null ? visit(ctx.display_rule()) : null;
    }

    @Override
    public ASTNode visitOpacityProperty(ParserCss.OpacityPropertyContext ctx) {
        return ctx.opacity_rule() != null ? visit(ctx.opacity_rule()) : null;
    }

    @Override
    public ASTNode visitBorderProperty(ParserCss.BorderPropertyContext ctx) {
        return ctx.border_rule() != null ? visit(ctx.border_rule()) : null;
    }

    @Override
    public ASTNode visitPositionProperty(ParserCss.PositionPropertyContext ctx) {
        return ctx.position_rule() != null ? visit(ctx.position_rule()) : null;
    }

    @Override
    public ASTNode visitFontWeightProperty(ParserCss.FontWeightPropertyContext ctx) {
        return ctx.font_weight_rule() != null ? visit(ctx.font_weight_rule()) : null;
    }

    @Override
    public ASTNode visitBackgroundProperty(ParserCss.BackgroundPropertyContext ctx) {
        return ctx.background_rule() != null ? visit(ctx.background_rule()) : null;
    }

    @Override
    public ASTNode visitColor_rule(ParserCss.Color_ruleContext ctx) {
        String colorValue = ctx.COLOR_VALUE() != null ? ctx.COLOR_VALUE().getText() : "";
        int line = ctx.getStart().getLine();
        return new ColorNode(colorValue, line);
    }

    @Override
    public ASTNode visitFont_size_rule(ParserCss.Font_size_ruleContext ctx) {
        // القاعدة تجلب VALUE_GENERAL أو VALUE_FONT_SIZE كطفل عند الفهرس 2
        String sizeVal = ctx.getChildCount() >= 3 ? ctx.getChild(2).getText() : "";
        return new FontSizeNode(sizeVal, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitFont_family(ParserCss.Font_familyContext ctx) {
        StringBuilder fontNames = new StringBuilder();
        if (ctx.fontFamilyItem() != null) {
            List<ParserCss.FontFamilyItemContext> items = ctx.fontFamilyItem();
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i) != null) {
                    fontNames.append(items.get(i).getText());
                    if (i < items.size() - 1) {
                        fontNames.append(", ");
                    }
                }
            }
        }
        return new FontFamilyNode(fontNames.toString(), ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitFont_weight_rule(ParserCss.Font_weight_ruleContext ctx) {
        String weight = ctx.VALUE_FONT_WEIGHT() != null ? ctx.VALUE_FONT_WEIGHT().getText() : "";
        return new FontWeightNode(weight, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitTextalign_rule(ParserCss.Textalign_ruleContext ctx) {
        String align = ctx.VALUE_TEXT_ALIGN() != null ? ctx.VALUE_TEXT_ALIGN().getText() : "";
        return new TextAlignNode(align, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitDisplay_rule(ParserCss.Display_ruleContext ctx) {
        String displayVal = ctx.display_value() != null ? ctx.display_value().getText() : "";
        return new DisplayNode(displayVal, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitOpacity_rule(ParserCss.Opacity_ruleContext ctx) {
        String opacityVal = ctx.VALUE_GENERAL() != null ? ctx.VALUE_GENERAL().getText() : "";
        return new OpacityNode(opacityVal, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitPosition_rule(ParserCss.Position_ruleContext ctx) {
        String positionVal = ctx.VALUE_POSITION() != null ? ctx.VALUE_POSITION().getText() : "";
        return new PositionNode(positionVal, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitBackground_rule(ParserCss.Background_ruleContext ctx) {
        String bgVal = ctx.COLOR_VALUE() != null ? ctx.COLOR_VALUE().getText() : "";
        return new BackgroundNode(bgVal, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitBorder_rule(ParserCss.Border_ruleContext ctx) {
        int line = ctx.getStart().getLine();

        if (ctx.NONE_KW() != null) {
            return new BorderNode("none", "", "", line);
        }

        String valueGen = "";
        String style = "";
        String color = "";

        // القوس التجمعي (VALUE_GENERAL | BORDER_STYLE | COLOR_VALUE)+ يولد أطفال ممتدين
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof TerminalNode) {
                TerminalNode node = (TerminalNode) child;
                int type = node.getSymbol().getType();

                if (type == ParserCss.VALUE_GENERAL) {
                    valueGen = node.getText();
                } else if (type == ParserCss.BORDER_STYLE) {
                    style = node.getText();
                } else if (type == ParserCss.COLOR_VALUE) {
                    color = node.getText();
                }
            }
        }

        return new BorderNode(valueGen, style, color, line);
    }

    @Override
    public ASTNode visitSize1_rule(ParserCss.Size1_ruleContext ctx) {
        String sizeName = ctx.SIZE_1() != null ? ctx.SIZE_1().getText() : "";
        String val = ctx.getChildCount() >= 3 ? ctx.getChild(2).getText() : "";

        return new Size1Node(sizeName, val, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitSize2_rule(ParserCss.Size2_ruleContext ctx) {
        List<String> values = new ArrayList<>();
        if (ctx.box_value() != null && ctx.box_value().children != null) {
            for (ParseTree t : ctx.box_value().children) {
                if (t != null) {
                    values.add(t.getText());
                }
            }
        }

        String sizeName = ctx.SIZE_2() != null ? ctx.SIZE_2().getText() : "";

        return new Size2Node(
                sizeName,
                values,
                ctx.getStart().getLine()
        );
    }
}