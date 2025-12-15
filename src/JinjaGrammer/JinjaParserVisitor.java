// Generated from C:/Users/dell/IdeaProjects/Compiler/src/JinjaGrammer/JinjaParser.g4 by ANTLR 4.13.2
package JinjaGrammer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JinjaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JinjaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JinjaParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(JinjaParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextNode}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextNode(JinjaParser.TextNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaExprNode}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExprNode(JinjaParser.JinjaExprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaIfNode}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIfNode(JinjaParser.JinjaIfNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaForNode}
	 * labeled alternative in {@link JinjaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForNode(JinjaParser.JinjaForNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(JinjaParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JinjaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JinjaParser.ForStatementContext ctx);
}