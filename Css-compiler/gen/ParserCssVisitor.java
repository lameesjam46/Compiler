// Generated from C:/Users/DELL/IdeaProjects/untitled3/src/ParserCss.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link ParserCss#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(ParserCss.PropertyContext ctx);
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
	 * Visit a parse tree produced by {@link ParserCss#display_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplay_rule(ParserCss.Display_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#border_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorder_rule(ParserCss.Border_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#border_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorder_value(ParserCss.Border_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserCss#mediaRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaRule(ParserCss.MediaRuleContext ctx);
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
}