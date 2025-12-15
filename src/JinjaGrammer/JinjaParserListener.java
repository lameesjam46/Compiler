// Generated from C:/Users/dell/IdeaProjects/Compiler/src/JinjaGrammer/JinjaParser.g4 by ANTLR 4.13.2
package JinjaGrammer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JinjaParser}.
 */
public interface JinjaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JinjaParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(JinjaParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(JinjaParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextNode}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterTextNode(JinjaParser.TextNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextNode}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitTextNode(JinjaParser.TextNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExprNode}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExprNode(JinjaParser.JinjaExprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExprNode}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExprNode(JinjaParser.JinjaExprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaIfNode}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIfNode(JinjaParser.JinjaIfNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaIfNode}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIfNode(JinjaParser.JinjaIfNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaForNode}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForNode(JinjaParser.JinjaForNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaForNode}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForNode(JinjaParser.JinjaForNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(JinjaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(JinjaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JinjaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JinjaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JinjaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JinjaParser.ForStatementContext ctx);
}