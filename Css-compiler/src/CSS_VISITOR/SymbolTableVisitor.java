package CSS_VISITOR;

import CSS_Antlr.ParserCss;
import CSS_Antlr.ParserCssBaseVisitor;
import CSS_Symbol_Table.Scope;
import CSS_Symbol_Table.Symbol;
import CSS_Symbol_Table.SymbolTable;

public class SymbolTableVisitor extends ParserCssBaseVisitor<Void> {

    private SymbolTable symbolTable;
    private Scope currentScope;
    private Symbol currentSymbol;

    public SymbolTableVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.currentScope = symbolTable.globalScope;
    }

    /* ================= RULE ================= */

    @Override
    public Void visitRule(ParserCss.RuleContext ctx) {

        String selectorName = ctx.selectorGroup().selector(0).getText();

        currentSymbol = currentScope.getSymbol(selectorName);
        if (currentSymbol == null) {
            currentSymbol = new Symbol(selectorName);
            currentScope.addSymbol(currentSymbol);
        }

        for (ParserCss.PropertyContext prop : ctx.property()) {
            visit(prop); // 🔥 رح ينادي labeled method
        }

        currentSymbol = null;
        return null;
    }

    /* ================= MEDIA ================= */

    @Override
    public Void visitMediaRule(ParserCss.MediaRuleContext ctx) {
        currentScope = symbolTable.createMediaScope();

        for (ParserCss.RuleContext rule : ctx.rule_()) {
            visit(rule);
        }

        currentScope = symbolTable.globalScope;
        return null;
    }

    /* ================= PROPERTY LABELS ================= */

    @Override
    public Void visitColorProperty(ParserCss.ColorPropertyContext ctx) {
        currentSymbol.addProperty(
                "color",
                ctx.color_rule().COLOR_VALUE().getText()
        );
        return null;
    }

    @Override
    public Void visitBackgroundProperty(ParserCss.BackgroundPropertyContext ctx) {
        currentSymbol.addProperty(
                "background-color",
                ctx.background_rule().COLOR_VALUE().getText()
        );
        return null;
    }

    @Override
    public Void visitFontFamilyProperty(ParserCss.FontFamilyPropertyContext ctx) {
        currentSymbol.addProperty(
                "font-family",
                ctx.font_family().CSS_ELEMENT().getText()
        );
        return null;
    }

    @Override
    public Void visitFontWeightProperty(ParserCss.FontWeightPropertyContext ctx) {
        currentSymbol.addProperty(
                "font-weight",
                ctx.font_weight_rule().VALUE_FONT_WEIGHT().getText()
        );
        return null;
    }

    @Override
    public Void visitTextAlignProperty(ParserCss.TextAlignPropertyContext ctx) {
        currentSymbol.addProperty(
                "text-align",
                ctx.textalign_rule().VALUE_TEXT_ALIGN().getText()
        );
        return null;
    }

    @Override
    public Void visitDisplayProperty(ParserCss.DisplayPropertyContext ctx) {
        String value = ctx.display_rule().display_value().getText();
        currentSymbol.addProperty("display", value);
        return null;
    }

    @Override
    public Void visitOpacityProperty(ParserCss.OpacityPropertyContext ctx) {
        currentSymbol.addProperty(
                "opacity",
                ctx.opacity_rule().VALUE_GENERAL().getText()
        );
        return null;
    }

    @Override
    public Void visitPositionProperty(ParserCss.PositionPropertyContext ctx) {
        currentSymbol.addProperty(
                "position",
                ctx.position_rule().VALUE_POSITION().getText()
        );
        return null;
    }

    @Override
    public Void visitBorderProperty(ParserCss.BorderPropertyContext ctx) {
        currentSymbol.addProperty(
                "border",
                ctx.border_rule().getText().replace(";", "").trim()
        );
        return null;
    }

    @Override
    public Void visitSize1Property(ParserCss.Size1PropertyContext ctx) {
        String prop = ctx.size1_rule().SIZE_1().getText();
        String value =
                ctx.size1_rule().VALUE_GENERAL() != null
                        ? ctx.size1_rule().VALUE_GENERAL().getText()
                        : "auto";

        currentSymbol.addProperty(prop, value);
        return null;
    }

    @Override
    public Void visitSize2Property(ParserCss.Size2PropertyContext ctx) {
        String prop = ctx.size2_rule().SIZE_2().getText();
        String value = ctx.size2_rule().box_value().getText();
        currentSymbol.addProperty(prop, value);
        return null;
    }

    @Override
    public Void visitFontSizeProperty(ParserCss.FontSizePropertyContext ctx) {
        String value =
                ctx.font_size_rule().VALUE_GENERAL() != null
                        ? ctx.font_size_rule().VALUE_GENERAL().getText()
                        : ctx.font_size_rule().VALUE_FONT_SIZE().getText();

        currentSymbol.addProperty("font-size", value);
        return null;
    }
}
