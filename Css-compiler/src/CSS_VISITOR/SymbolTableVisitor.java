package CSS_VISITOR;

import CSS_Antlr.ParserCss;
import CSS_Antlr.ParserCssBaseVisitor;
import CSS_Symbol_Table.Symbol;
import CSS_Symbol_Table.SymbolTable;
import CSS_Symbol_Table.Scope;

public class SymbolTableVisitor extends ParserCssBaseVisitor<Void> {
    private SymbolTable symbolTable;
    private Scope currentScope;

    public SymbolTableVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.currentScope = symbolTable.globalScope;
    }

    @Override
    public Void visitRule(ParserCss.RuleContext ctx) {

        String selectorName = ctx.selectorGroup().selector(0).getText();
        Symbol symbol = currentScope.getSymbol(selectorName);
        if (symbol == null) {
            symbol = new Symbol(selectorName);
            currentScope.addSymbol(symbol);
        }

        for (ParserCss.PropertyContext prop : ctx.property()) {
            visitProperty(prop, symbol);        }

        return null;
    }

    @Override
    public Void visitMediaRule(ParserCss.MediaRuleContext ctx) {
        currentScope = symbolTable.createMediaScope();

        for (ParserCss.RuleContext rule : ctx.rule_()) {
            visit(rule);
        }

        currentScope = symbolTable.globalScope;
        return null;
    }

      private void visitProperty(ParserCss.PropertyContext ctx, Symbol symbol) {
          if (ctx.color_rule() != null && ctx.color_rule().COLOR_VALUE() != null) {
              symbol.addProperty("color", ctx.color_rule().COLOR_VALUE().getText());
          }
          else if (ctx.background_rule() != null && ctx.background_rule().COLOR_VALUE() != null) {
              symbol.addProperty("background-color", ctx.background_rule().COLOR_VALUE().getText());
          }
          else if (ctx.font_family() != null && ctx.font_family().CSS_ELEMENT() != null) {
              symbol.addProperty("font-family", ctx.font_family().CSS_ELEMENT().getText());
          }
          else if (ctx.font_weight_rule() != null && ctx.font_weight_rule().VALUE_FONT_WEIGHT() != null) {
              symbol.addProperty("font-weight", ctx.font_weight_rule().VALUE_FONT_WEIGHT().getText());
          }
          else if (ctx.textalign_rule() != null && ctx.textalign_rule().VALUE_TEXT_ALIGN() != null) {
              symbol.addProperty("text-align", ctx.textalign_rule().VALUE_TEXT_ALIGN().getText());
          }
          else if (ctx.display_rule() != null) {
              String value = ctx.display_rule().display_value() != null ?
                      ctx.display_rule().display_value().getText() : "none";
              symbol.addProperty("display", value);
          }
          else if (ctx.opacity_rule() != null && ctx.opacity_rule().VALUE_GENERAL() != null) {
              symbol.addProperty("opacity", ctx.opacity_rule().VALUE_GENERAL().getText());
          }
          else if (ctx.position_rule() != null && ctx.position_rule().VALUE_POSITION() != null) {
              symbol.addProperty("position", ctx.position_rule().VALUE_POSITION().getText());
          }
          else if (ctx.border_rule() != null) {
              symbol.addProperty("border", ctx.border_rule().getText().replace(";", "").trim());
          }
          else if (ctx.size1_rule() != null) {
              String prop = ctx.size1_rule().SIZE_1().getText();
              String value = (ctx.size1_rule().VALUE_GENERAL() != null) ?
                      ctx.size1_rule().VALUE_GENERAL().getText() :
                      (ctx.size1_rule().AUTO_KW() != null ? "auto" : "none");
              symbol.addProperty(prop, value);
          }
          else if (ctx.size2_rule() != null) {
              String prop = ctx.size2_rule().SIZE_2().getText();
              String value = ctx.size2_rule().box_value().getText();
              symbol.addProperty(prop, value);
          }
          else if (ctx.font_size_rule() != null) {
              String value = (ctx.font_size_rule().VALUE_GENERAL() != null) ?
                      ctx.font_size_rule().VALUE_GENERAL().getText() :
                      ctx.font_size_rule().VALUE_FONT_SIZE().getText();
              symbol.addProperty("font-size", value);
          }
      }


}