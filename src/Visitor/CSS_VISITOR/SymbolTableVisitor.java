package Visitor.CSS_VISITOR;

import Grammer.CSSAntlr.ParserCss;
import Grammer.CSSAntlr.ParserCssBaseVisitor;
import SymbolTable.CSS_Symbol_Table.Scope;
import SymbolTable.CSS_Symbol_Table.Symbol;
import SymbolTable.CSS_Symbol_Table.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableVisitor extends ParserCssBaseVisitor<Void> {

    private SymbolTable symbolTable;
    private Scope currentScope;
    private Symbol currentSymbol;

    public SymbolTableVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.currentScope = symbolTable.globalScope;
    }

    /* ================= RULE & SELECTORS ================= */

    @Override
    public Void visitRule(ParserCss.RuleContext ctx) {
        if (ctx == null || ctx.selectorGroup() == null || ctx.selectorGroup().selector().isEmpty()) {
            return null;
        }

        // معالجة كل المحددات في حال كان التحديد متعدد مثل (.a, .b)
        for (ParserCss.SelectorContext selectorCtx : ctx.selectorGroup().selector()) {
            String selectorName = buildSelectorName(selectorCtx);

            currentSymbol = currentScope.getSymbol(selectorName);
            if (currentSymbol == null) {
                currentSymbol = new Symbol(selectorName);
                currentScope.addSymbol(currentSymbol);
            }

            if (ctx.property() != null) {
                for (ParserCss.PropertyContext prop : ctx.property()) {
                    visit(prop);
                }
            }
        }

        currentSymbol = null;
        return null;
    }

    /**
     * بناء اسم الـ Selector مع فصل العناصر الابنة بمسافات
     * لمنع تداخل الأسماء مثل (.nav-linksa بدلاً من .nav-links a)
     */
    private String buildSelectorName(ParserCss.SelectorContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.simpleSelector().size(); i++) {
            ParserCss.SimpleSelectorContext simple = ctx.simpleSelector(i);
            String text = simple.getText();

            if (i > 0) {
                // إضافة مسافة إذا كان العنصر الجديد يبدأ باسم عنصر عادي وليس modifier ملتصق
                char firstChar = text.charAt(0);
                if (firstChar != '.' && firstChar != '#' && firstChar != ':') {
                    sb.append(" ");
                }
            }
            sb.append(text);
        }
        return sb.toString();
    }

    /* ================= MEDIA ================= */

    @Override
    public Void visitMediaRule(ParserCss.MediaRuleContext ctx) {
        if (ctx == null) return null;

        currentScope = symbolTable.createMediaScope();

        if (ctx.rule_() != null) {
            for (ParserCss.RuleContext rule : ctx.rule_()) {
                visit(rule);
            }
        }

        currentScope = symbolTable.globalScope;
        return null;
    }

    /* ================= PROPERTIES ================= */

    @Override
    public Void visitSize1Property(ParserCss.Size1PropertyContext ctx) {
        if (currentSymbol != null && ctx != null && ctx.size1_rule() != null) {
            ParserCss.Size1_ruleContext s1Ctx = ctx.size1_rule();
            String prop = s1Ctx.SIZE_1() != null ? s1Ctx.SIZE_1().getText() : "width";
            String value = "auto";

            if (s1Ctx.VALUE_GENERAL() != null) {
                value = s1Ctx.VALUE_GENERAL().getText();
            } else if (s1Ctx.FLOAT() != null) {
                value = s1Ctx.FLOAT().getText();
            } else if (s1Ctx.AUTO_KW() != null) {
                value = s1Ctx.AUTO_KW().getText();
            } else if (s1Ctx.NONE_KW() != null) {
                value = s1Ctx.NONE_KW().getText();
            }

            currentSymbol.addProperty(prop, value);
        }
        return null;
    }

    @Override
    public Void visitSize2Property(ParserCss.Size2PropertyContext ctx) {
        if (currentSymbol != null && ctx != null && ctx.size2_rule() != null) {
            ParserCss.Size2_ruleContext s2Ctx = ctx.size2_rule();
            String prop = s2Ctx.SIZE_2() != null ? s2Ctx.SIZE_2().getText() : "padding";

            // تجميع عناصر الـ box_value مع فصلها بمسافة واحدة
            List<String> values = new ArrayList<>();
            if (s2Ctx.box_value() != null && s2Ctx.box_value().box_atom() != null) {
                for (ParserCss.Box_atomContext atom : s2Ctx.box_value().box_atom()) {
                    values.add(atom.getText());
                }
            }

            currentSymbol.addProperty(prop, String.join(" ", values));
        }
        return null;
    }

    @Override
    public Void visitBorderProperty(ParserCss.BorderPropertyContext ctx) {
        if (currentSymbol != null && ctx != null && ctx.border_rule() != null) {
            ParserCss.Border_ruleContext bCtx = ctx.border_rule();

            if (bCtx.NONE_KW() != null && bCtx.children.size() == 3) { // border: none;
                currentSymbol.addProperty("border", "none");
            } else {
                // استخلاص قيم الـ Border فقط دون "border:" أو ";"
                List<String> parts = new ArrayList<>();
                bCtx.children.forEach(child -> {
                    String t = child.getText();
                    if (!t.equalsIgnoreCase("border") && !t.equals(":") && !t.equals(";")) {
                        parts.add(t);
                    }
                });
                currentSymbol.addProperty("border", String.join(" ", parts));
            }
        }
        return null;
    }

    @Override
    public Void visitColorProperty(ParserCss.ColorPropertyContext ctx) {
        if (currentSymbol != null && ctx != null && ctx.color_rule() != null) {
            ParserCss.Color_ruleContext colorCtx = ctx.color_rule();
            String val = colorCtx.COLOR_VALUE() != null
                    ? colorCtx.COLOR_VALUE().getText()
                    : colorCtx.getText().replace("color:", "").replace(";", "").trim();

            currentSymbol.addProperty("color", val);
        }
        return null;
    }

    @Override
    public Void visitBackgroundProperty(ParserCss.BackgroundPropertyContext ctx) {
        if (currentSymbol != null && ctx != null && ctx.background_rule() != null) {
            ParserCss.Background_ruleContext bgCtx = ctx.background_rule();
            String val = bgCtx.COLOR_VALUE() != null
                    ? bgCtx.COLOR_VALUE().getText()
                    : bgCtx.getText().replace("background-color:", "").replace(";", "").trim();

            currentSymbol.addProperty("background-color", val);
        }
        return null;
    }

    @Override
    public Void visitFontFamilyProperty(ParserCss.FontFamilyPropertyContext ctx) {
        if (currentSymbol != null && ctx != null && ctx.font_family() != null) {
            List<String> fontNames = new ArrayList<>();
            ParserCss.Font_familyContext fontCtx = ctx.font_family();

            if (fontCtx.fontFamilyItem() != null) {
                for (ParserCss.FontFamilyItemContext item : fontCtx.fontFamilyItem()) {
                    if (item != null) {
                        fontNames.add(item.getText());
                    }
                }
            }

            currentSymbol.addProperty("font-family", String.join(", ", fontNames));
        }
        return null;
    }

    @Override
    public Void visitFontWeightProperty(ParserCss.FontWeightPropertyContext ctx) {
        if (currentSymbol != null && ctx != null && ctx.font_weight_rule() != null) {
            ParserCss.Font_weight_ruleContext fwCtx = ctx.font_weight_rule();
            String val = fwCtx.VALUE_FONT_WEIGHT() != null
                    ? fwCtx.VALUE_FONT_WEIGHT().getText()
                    : fwCtx.getText().replace("font-weight:", "").replace(";", "").trim();

            currentSymbol.addProperty("font-weight", val);
        }
        return null;
    }

    @Override
    public Void visitTextAlignProperty(ParserCss.TextAlignPropertyContext ctx) {
        if (currentSymbol != null && ctx != null && ctx.textalign_rule() != null) {
            ParserCss.Textalign_ruleContext taCtx = ctx.textalign_rule();
            String val = taCtx.VALUE_TEXT_ALIGN() != null
                    ? taCtx.VALUE_TEXT_ALIGN().getText()
                    : taCtx.getText().replace("text-align:", "").replace(";", "").trim();

            currentSymbol.addProperty("text-align", val);
        }
        return null;
    }

    @Override
    public Void visitDisplayProperty(ParserCss.DisplayPropertyContext ctx) {
        if (currentSymbol != null && ctx != null && ctx.display_rule() != null) {
            ParserCss.Display_ruleContext dispCtx = ctx.display_rule();
            String val = dispCtx.display_value() != null
                    ? dispCtx.display_value().getText()
                    : dispCtx.getText().replace("display:", "").replace(";", "").trim();

            currentSymbol.addProperty("display", val);
        }
        return null;
    }

    @Override
    public Void visitOpacityProperty(ParserCss.OpacityPropertyContext ctx) {
        if (currentSymbol != null && ctx != null && ctx.opacity_rule() != null) {
            ParserCss.Opacity_ruleContext opCtx = ctx.opacity_rule();
            String val = "";
            if (opCtx.VALUE_GENERAL() != null) val = opCtx.VALUE_GENERAL().getText();
            else if (opCtx.FLOAT() != null) val = opCtx.FLOAT().getText();
            else val = opCtx.getText().replace("opacity:", "").replace(";", "").trim();

            currentSymbol.addProperty("opacity", val);
        }
        return null;
    }

    @Override
    public Void visitPositionProperty(ParserCss.PositionPropertyContext ctx) {
        if (currentSymbol != null && ctx != null && ctx.position_rule() != null) {
            ParserCss.Position_ruleContext posCtx = ctx.position_rule();
            String val = posCtx.VALUE_POSITION() != null
                    ? posCtx.VALUE_POSITION().getText()
                    : posCtx.getText().replace("position:", "").replace(";", "").trim();

            currentSymbol.addProperty("position", val);
        }
        return null;
    }

    @Override
    public Void visitFontSizeProperty(ParserCss.FontSizePropertyContext ctx) {
        if (currentSymbol != null && ctx != null && ctx.font_size_rule() != null) {
            ParserCss.Font_size_ruleContext fsCtx = ctx.font_size_rule();
            String value = "";

            if (fsCtx.VALUE_GENERAL() != null) {
                value = fsCtx.VALUE_GENERAL().getText();
            } else if (fsCtx.VALUE_FONT_SIZE() != null) {
                value = fsCtx.VALUE_FONT_SIZE().getText();
            } else if (fsCtx.FLOAT() != null) {
                value = fsCtx.FLOAT().getText();
            } else {
                value = fsCtx.getText().replace("font-size:", "").replace(";", "").trim();
            }

            currentSymbol.addProperty("font-size", value);
        }
        return null;
    }
}