// Generated from C:/Users/DELL/IdeaProjects/untitled3/src/ParserCss.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(ParserCss.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(ParserCss.PropertyContext ctx);
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
	 * Enter a parse tree produced by {@link ParserCss#mediaRule}.
	 * @param ctx the parse tree
	 */
	void enterMediaRule(ParserCss.MediaRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserCss#mediaRule}.
	 * @param ctx the parse tree
	 */
	void exitMediaRule(ParserCss.MediaRuleContext ctx);
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
}