// Generated from D:/compiler_2/Compiler/src/Grammer/CSSAntlr/ParserCss.g4 by ANTLR 4.13.2
package Grammer.CSSAntlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserCss}.
 */
public interface ParserCssListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserCss#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(ParserCss.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(ParserCss.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ParserCss.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ParserCss.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(ParserCss.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(ParserCss.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(ParserCss.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(ParserCss.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void enterSelectorGroup(ParserCss.SelectorGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void exitSelectorGroup(ParserCss.SelectorGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(ParserCss.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(ParserCss.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelector(ParserCss.SimpleSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelector(ParserCss.SimpleSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(ParserCss.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(ParserCss.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#elementName}.
	 * @param ctx the parse tree
	 */
	void enterElementName(ParserCss.ElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#elementName}.
	 * @param ctx the parse tree
	 */
	void exitElementName(ParserCss.ElementNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code size1Property}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterSize1Property(ParserCss.Size1PropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code size1Property}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitSize1Property(ParserCss.Size1PropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code size2Property}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterSize2Property(ParserCss.Size2PropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code size2Property}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitSize2Property(ParserCss.Size2PropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textAlignProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterTextAlignProperty(ParserCss.TextAlignPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textAlignProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitTextAlignProperty(ParserCss.TextAlignPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code colorProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterColorProperty(ParserCss.ColorPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code colorProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitColorProperty(ParserCss.ColorPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fontSizeProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterFontSizeProperty(ParserCss.FontSizePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fontSizeProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitFontSizeProperty(ParserCss.FontSizePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fontFamilyProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterFontFamilyProperty(ParserCss.FontFamilyPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fontFamilyProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitFontFamilyProperty(ParserCss.FontFamilyPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code displayProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterDisplayProperty(ParserCss.DisplayPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code displayProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitDisplayProperty(ParserCss.DisplayPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opacityProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterOpacityProperty(ParserCss.OpacityPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opacityProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitOpacityProperty(ParserCss.OpacityPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code borderProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterBorderProperty(ParserCss.BorderPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code borderProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitBorderProperty(ParserCss.BorderPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code borderSideProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterBorderSideProperty(ParserCss.BorderSidePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code borderSideProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitBorderSideProperty(ParserCss.BorderSidePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code borderCollapseProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterBorderCollapseProperty(ParserCss.BorderCollapsePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code borderCollapseProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitBorderCollapseProperty(ParserCss.BorderCollapsePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code positionProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterPositionProperty(ParserCss.PositionPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positionProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitPositionProperty(ParserCss.PositionPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fontWeightProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterFontWeightProperty(ParserCss.FontWeightPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fontWeightProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitFontWeightProperty(ParserCss.FontWeightPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backgroundProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterBackgroundProperty(ParserCss.BackgroundPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backgroundProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitBackgroundProperty(ParserCss.BackgroundPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backgroundShorthandProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterBackgroundShorthandProperty(ParserCss.BackgroundShorthandPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backgroundShorthandProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitBackgroundShorthandProperty(ParserCss.BackgroundShorthandPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boxSizingProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterBoxSizingProperty(ParserCss.BoxSizingPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boxSizingProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitBoxSizingProperty(ParserCss.BoxSizingPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineHeightProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterLineHeightProperty(ParserCss.LineHeightPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineHeightProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitLineHeightProperty(ParserCss.LineHeightPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code maxWidthProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterMaxWidthProperty(ParserCss.MaxWidthPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code maxWidthProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitMaxWidthProperty(ParserCss.MaxWidthPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minWidthProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterMinWidthProperty(ParserCss.MinWidthPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minWidthProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitMinWidthProperty(ParserCss.MinWidthPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code borderRadiusProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterBorderRadiusProperty(ParserCss.BorderRadiusPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code borderRadiusProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitBorderRadiusProperty(ParserCss.BorderRadiusPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boxShadowProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterBoxShadowProperty(ParserCss.BoxShadowPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boxShadowProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitBoxShadowProperty(ParserCss.BoxShadowPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cursorProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterCursorProperty(ParserCss.CursorPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cursorProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitCursorProperty(ParserCss.CursorPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code overflowProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterOverflowProperty(ParserCss.OverflowPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code overflowProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitOverflowProperty(ParserCss.OverflowPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gapProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterGapProperty(ParserCss.GapPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gapProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitGapProperty(ParserCss.GapPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textDecorationProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterTextDecorationProperty(ParserCss.TextDecorationPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textDecorationProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitTextDecorationProperty(ParserCss.TextDecorationPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code justifyContentProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterJustifyContentProperty(ParserCss.JustifyContentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code justifyContentProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitJustifyContentProperty(ParserCss.JustifyContentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alignItemsProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterAlignItemsProperty(ParserCss.AlignItemsPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alignItemsProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitAlignItemsProperty(ParserCss.AlignItemsPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code flexWrapProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterFlexWrapProperty(ParserCss.FlexWrapPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code flexWrapProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitFlexWrapProperty(ParserCss.FlexWrapPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code flexDirectionProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterFlexDirectionProperty(ParserCss.FlexDirectionPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code flexDirectionProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitFlexDirectionProperty(ParserCss.FlexDirectionPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code marginSideProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterMarginSideProperty(ParserCss.MarginSidePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code marginSideProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitMarginSideProperty(ParserCss.MarginSidePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paddingSideProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterPaddingSideProperty(ParserCss.PaddingSidePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paddingSideProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitPaddingSideProperty(ParserCss.PaddingSidePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#box_atom}.
	 * @param ctx the parse tree
	 */
	void enterBox_atom(ParserCss.Box_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#box_atom}.
	 * @param ctx the parse tree
	 */
	void exitBox_atom(ParserCss.Box_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#box_value}.
	 * @param ctx the parse tree
	 */
	void enterBox_value(ParserCss.Box_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#box_value}.
	 * @param ctx the parse tree
	 */
	void exitBox_value(ParserCss.Box_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#size1_rule}.
	 * @param ctx the parse tree
	 */
	void enterSize1_rule(ParserCss.Size1_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#size1_rule}.
	 * @param ctx the parse tree
	 */
	void exitSize1_rule(ParserCss.Size1_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#size2_rule}.
	 * @param ctx the parse tree
	 */
	void enterSize2_rule(ParserCss.Size2_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#size2_rule}.
	 * @param ctx the parse tree
	 */
	void exitSize2_rule(ParserCss.Size2_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#textalign_rule}.
	 * @param ctx the parse tree
	 */
	void enterTextalign_rule(ParserCss.Textalign_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#textalign_rule}.
	 * @param ctx the parse tree
	 */
	void exitTextalign_rule(ParserCss.Textalign_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#color_rule}.
	 * @param ctx the parse tree
	 */
	void enterColor_rule(ParserCss.Color_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#color_rule}.
	 * @param ctx the parse tree
	 */
	void exitColor_rule(ParserCss.Color_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#font_size_rule}.
	 * @param ctx the parse tree
	 */
	void enterFont_size_rule(ParserCss.Font_size_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#font_size_rule}.
	 * @param ctx the parse tree
	 */
	void exitFont_size_rule(ParserCss.Font_size_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#font_family}.
	 * @param ctx the parse tree
	 */
	void enterFont_family(ParserCss.Font_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#font_family}.
	 * @param ctx the parse tree
	 */
	void exitFont_family(ParserCss.Font_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#fontFamilyItem}.
	 * @param ctx the parse tree
	 */
	void enterFontFamilyItem(ParserCss.FontFamilyItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#fontFamilyItem}.
	 * @param ctx the parse tree
	 */
	void exitFontFamilyItem(ParserCss.FontFamilyItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#display_rule}.
	 * @param ctx the parse tree
	 */
	void enterDisplay_rule(ParserCss.Display_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#display_rule}.
	 * @param ctx the parse tree
	 */
	void exitDisplay_rule(ParserCss.Display_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#display_value}.
	 * @param ctx the parse tree
	 */
	void enterDisplay_value(ParserCss.Display_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#display_value}.
	 * @param ctx the parse tree
	 */
	void exitDisplay_value(ParserCss.Display_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#border_rule}.
	 * @param ctx the parse tree
	 */
	void enterBorder_rule(ParserCss.Border_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#border_rule}.
	 * @param ctx the parse tree
	 */
	void exitBorder_rule(ParserCss.Border_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#border_collapse_rule}.
	 * @param ctx the parse tree
	 */
	void enterBorder_collapse_rule(ParserCss.Border_collapse_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#border_collapse_rule}.
	 * @param ctx the parse tree
	 */
	void exitBorder_collapse_rule(ParserCss.Border_collapse_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#border_side_rule}.
	 * @param ctx the parse tree
	 */
	void enterBorder_side_rule(ParserCss.Border_side_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#border_side_rule}.
	 * @param ctx the parse tree
	 */
	void exitBorder_side_rule(ParserCss.Border_side_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#opacity_rule}.
	 * @param ctx the parse tree
	 */
	void enterOpacity_rule(ParserCss.Opacity_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#opacity_rule}.
	 * @param ctx the parse tree
	 */
	void exitOpacity_rule(ParserCss.Opacity_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#position_rule}.
	 * @param ctx the parse tree
	 */
	void enterPosition_rule(ParserCss.Position_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#position_rule}.
	 * @param ctx the parse tree
	 */
	void exitPosition_rule(ParserCss.Position_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#font_weight_rule}.
	 * @param ctx the parse tree
	 */
	void enterFont_weight_rule(ParserCss.Font_weight_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#font_weight_rule}.
	 * @param ctx the parse tree
	 */
	void exitFont_weight_rule(ParserCss.Font_weight_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#background_rule}.
	 * @param ctx the parse tree
	 */
	void enterBackground_rule(ParserCss.Background_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#background_rule}.
	 * @param ctx the parse tree
	 */
	void exitBackground_rule(ParserCss.Background_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#background_shorthand_rule}.
	 * @param ctx the parse tree
	 */
	void enterBackground_shorthand_rule(ParserCss.Background_shorthand_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#background_shorthand_rule}.
	 * @param ctx the parse tree
	 */
	void exitBackground_shorthand_rule(ParserCss.Background_shorthand_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#box_sizing_rule}.
	 * @param ctx the parse tree
	 */
	void enterBox_sizing_rule(ParserCss.Box_sizing_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#box_sizing_rule}.
	 * @param ctx the parse tree
	 */
	void exitBox_sizing_rule(ParserCss.Box_sizing_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#line_height_rule}.
	 * @param ctx the parse tree
	 */
	void enterLine_height_rule(ParserCss.Line_height_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#line_height_rule}.
	 * @param ctx the parse tree
	 */
	void exitLine_height_rule(ParserCss.Line_height_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#max_width_rule}.
	 * @param ctx the parse tree
	 */
	void enterMax_width_rule(ParserCss.Max_width_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#max_width_rule}.
	 * @param ctx the parse tree
	 */
	void exitMax_width_rule(ParserCss.Max_width_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#min_width_rule}.
	 * @param ctx the parse tree
	 */
	void enterMin_width_rule(ParserCss.Min_width_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#min_width_rule}.
	 * @param ctx the parse tree
	 */
	void exitMin_width_rule(ParserCss.Min_width_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#border_radius_rule}.
	 * @param ctx the parse tree
	 */
	void enterBorder_radius_rule(ParserCss.Border_radius_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#border_radius_rule}.
	 * @param ctx the parse tree
	 */
	void exitBorder_radius_rule(ParserCss.Border_radius_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#box_shadow_rule}.
	 * @param ctx the parse tree
	 */
	void enterBox_shadow_rule(ParserCss.Box_shadow_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#box_shadow_rule}.
	 * @param ctx the parse tree
	 */
	void exitBox_shadow_rule(ParserCss.Box_shadow_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#cursor_rule}.
	 * @param ctx the parse tree
	 */
	void enterCursor_rule(ParserCss.Cursor_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#cursor_rule}.
	 * @param ctx the parse tree
	 */
	void exitCursor_rule(ParserCss.Cursor_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#overflow_rule}.
	 * @param ctx the parse tree
	 */
	void enterOverflow_rule(ParserCss.Overflow_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#overflow_rule}.
	 * @param ctx the parse tree
	 */
	void exitOverflow_rule(ParserCss.Overflow_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#gap_rule}.
	 * @param ctx the parse tree
	 */
	void enterGap_rule(ParserCss.Gap_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#gap_rule}.
	 * @param ctx the parse tree
	 */
	void exitGap_rule(ParserCss.Gap_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#text_decoration_rule}.
	 * @param ctx the parse tree
	 */
	void enterText_decoration_rule(ParserCss.Text_decoration_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#text_decoration_rule}.
	 * @param ctx the parse tree
	 */
	void exitText_decoration_rule(ParserCss.Text_decoration_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#justify_content_rule}.
	 * @param ctx the parse tree
	 */
	void enterJustify_content_rule(ParserCss.Justify_content_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#justify_content_rule}.
	 * @param ctx the parse tree
	 */
	void exitJustify_content_rule(ParserCss.Justify_content_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#align_items_rule}.
	 * @param ctx the parse tree
	 */
	void enterAlign_items_rule(ParserCss.Align_items_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#align_items_rule}.
	 * @param ctx the parse tree
	 */
	void exitAlign_items_rule(ParserCss.Align_items_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#flex_wrap_rule}.
	 * @param ctx the parse tree
	 */
	void enterFlex_wrap_rule(ParserCss.Flex_wrap_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#flex_wrap_rule}.
	 * @param ctx the parse tree
	 */
	void exitFlex_wrap_rule(ParserCss.Flex_wrap_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#flex_direction_rule}.
	 * @param ctx the parse tree
	 */
	void enterFlex_direction_rule(ParserCss.Flex_direction_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#flex_direction_rule}.
	 * @param ctx the parse tree
	 */
	void exitFlex_direction_rule(ParserCss.Flex_direction_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#margin_side_rule}.
	 * @param ctx the parse tree
	 */
	void enterMargin_side_rule(ParserCss.Margin_side_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#margin_side_rule}.
	 * @param ctx the parse tree
	 */
	void exitMargin_side_rule(ParserCss.Margin_side_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#padding_side_rule}.
	 * @param ctx the parse tree
	 */
	void enterPadding_side_rule(ParserCss.Padding_side_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#padding_side_rule}.
	 * @param ctx the parse tree
	 */
	void exitPadding_side_rule(ParserCss.Padding_side_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserCss#mediaRule}.
	 * @param ctx the parse tree
	 */
	void enterMediaRule(ParserCss.MediaRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#mediaRule}.
	 * @param ctx the parse tree
	 */
	void exitMediaRule(ParserCss.MediaRuleContext ctx);
}