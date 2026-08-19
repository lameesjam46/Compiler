// Generated from D:/compiler_2/Compiler/src/Grammer/CSSAntlr/ParserCss.g4 by ANTLR 4.13.2
package Grammer.CSSAntlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserCss}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserCssVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserCss#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(ParserCss.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ParserCss.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(ParserCss.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(ParserCss.RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#selectorGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorGroup(ParserCss.SelectorGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(ParserCss.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelector(ParserCss.SimpleSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(ParserCss.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#elementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementName(ParserCss.ElementNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code size1Property}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize1Property(ParserCss.Size1PropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code size2Property}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize2Property(ParserCss.Size2PropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textAlignProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextAlignProperty(ParserCss.TextAlignPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code colorProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorProperty(ParserCss.ColorPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fontSizeProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontSizeProperty(ParserCss.FontSizePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fontFamilyProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFamilyProperty(ParserCss.FontFamilyPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code displayProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayProperty(ParserCss.DisplayPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opacityProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpacityProperty(ParserCss.OpacityPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code borderProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderProperty(ParserCss.BorderPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code borderSideProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderSideProperty(ParserCss.BorderSidePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code borderCollapseProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderCollapseProperty(ParserCss.BorderCollapsePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code positionProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionProperty(ParserCss.PositionPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fontWeightProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontWeightProperty(ParserCss.FontWeightPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code backgroundProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackgroundProperty(ParserCss.BackgroundPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code backgroundShorthandProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackgroundShorthandProperty(ParserCss.BackgroundShorthandPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boxSizingProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxSizingProperty(ParserCss.BoxSizingPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineHeightProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineHeightProperty(ParserCss.LineHeightPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code maxWidthProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxWidthProperty(ParserCss.MaxWidthPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minWidthProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinWidthProperty(ParserCss.MinWidthPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code borderRadiusProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderRadiusProperty(ParserCss.BorderRadiusPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boxShadowProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxShadowProperty(ParserCss.BoxShadowPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cursorProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorProperty(ParserCss.CursorPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code overflowProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverflowProperty(ParserCss.OverflowPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gapProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGapProperty(ParserCss.GapPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textDecorationProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextDecorationProperty(ParserCss.TextDecorationPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code justifyContentProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustifyContentProperty(ParserCss.JustifyContentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alignItemsProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignItemsProperty(ParserCss.AlignItemsPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code flexWrapProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlexWrapProperty(ParserCss.FlexWrapPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code flexDirectionProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlexDirectionProperty(ParserCss.FlexDirectionPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code marginSideProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarginSideProperty(ParserCss.MarginSidePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paddingSideProperty}
	 * labeled alternative in {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddingSideProperty(ParserCss.PaddingSidePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#box_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBox_atom(ParserCss.Box_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#box_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBox_value(ParserCss.Box_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#size1_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize1_rule(ParserCss.Size1_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#size2_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize2_rule(ParserCss.Size2_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#textalign_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextalign_rule(ParserCss.Textalign_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#color_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor_rule(ParserCss.Color_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#font_size_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFont_size_rule(ParserCss.Font_size_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#font_family}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFont_family(ParserCss.Font_familyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#fontFamilyItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFamilyItem(ParserCss.FontFamilyItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#display_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplay_rule(ParserCss.Display_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#display_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplay_value(ParserCss.Display_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#border_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorder_rule(ParserCss.Border_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#border_collapse_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorder_collapse_rule(ParserCss.Border_collapse_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#border_side_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorder_side_rule(ParserCss.Border_side_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#opacity_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpacity_rule(ParserCss.Opacity_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#position_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition_rule(ParserCss.Position_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#font_weight_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFont_weight_rule(ParserCss.Font_weight_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#background_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackground_rule(ParserCss.Background_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#background_shorthand_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackground_shorthand_rule(ParserCss.Background_shorthand_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#box_sizing_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBox_sizing_rule(ParserCss.Box_sizing_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#line_height_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_height_rule(ParserCss.Line_height_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#max_width_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax_width_rule(ParserCss.Max_width_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#min_width_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMin_width_rule(ParserCss.Min_width_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#border_radius_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorder_radius_rule(ParserCss.Border_radius_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#box_shadow_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBox_shadow_rule(ParserCss.Box_shadow_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#cursor_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_rule(ParserCss.Cursor_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#overflow_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverflow_rule(ParserCss.Overflow_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#gap_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGap_rule(ParserCss.Gap_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#text_decoration_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_decoration_rule(ParserCss.Text_decoration_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#justify_content_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustify_content_rule(ParserCss.Justify_content_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#align_items_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlign_items_rule(ParserCss.Align_items_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#flex_wrap_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlex_wrap_rule(ParserCss.Flex_wrap_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#flex_direction_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlex_direction_rule(ParserCss.Flex_direction_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#margin_side_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMargin_side_rule(ParserCss.Margin_side_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#padding_side_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding_side_rule(ParserCss.Padding_side_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#mediaRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaRule(ParserCss.MediaRuleContext ctx);
}