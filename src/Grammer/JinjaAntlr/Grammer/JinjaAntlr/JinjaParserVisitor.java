// Generated from C:/Users/Lenovo/Desktop/compiler 2/Compiler/src/Grammer/JinjaAntlr/JinjaParser.g4 by ANTLR 4.13.2
package Grammer.JinjaAntlr.Grammer.JinjaAntlr;
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
	 * Visit a parse tree produced by the {@code documentRoot}
	 * labeled alternative in {@link JinjaParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumentRoot(JinjaParser.DocumentRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nodeHtml}
	 * labeled alternative in {@link JinjaParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeHtml(JinjaParser.NodeHtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nodeJinjaExpr}
	 * labeled alternative in {@link JinjaParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeJinjaExpr(JinjaParser.NodeJinjaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nodeJinjaBlock}
	 * labeled alternative in {@link JinjaParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeJinjaBlock(JinjaParser.NodeJinjaBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nodeHtmlText}
	 * labeled alternative in {@link JinjaParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeHtmlText(JinjaParser.NodeHtmlTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nodeHtmlComment}
	 * labeled alternative in {@link JinjaParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeHtmlComment(JinjaParser.NodeHtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nodeHtmlDoctype}
	 * labeled alternative in {@link JinjaParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeHtmlDoctype(JinjaParser.NodeHtmlDoctypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlNormalElement}
	 * labeled alternative in {@link JinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlNormalElement(JinjaParser.HtmlNormalElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlSelfClosingElement}
	 * labeled alternative in {@link JinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSelfClosingElement(JinjaParser.HtmlSelfClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlEndTag}
	 * labeled alternative in {@link JinjaParser#endTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlEndTag(JinjaParser.HtmlEndTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttr}
	 * labeled alternative in {@link JinjaParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttr(JinjaParser.HtmlAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlContentNode}
	 * labeled alternative in {@link JinjaParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentNode(JinjaParser.HtmlContentNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaExpression}
	 * labeled alternative in {@link JinjaParser#jinjaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpression(JinjaParser.JinjaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlock(JinjaParser.JinjaBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockIf}
	 * labeled alternative in {@link JinjaParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockIf(JinjaParser.BlockIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elifBlockStmt}
	 * labeled alternative in {@link JinjaParser#elifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifBlockStmt(JinjaParser.ElifBlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseBlockStmt}
	 * labeled alternative in {@link JinjaParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlockStmt(JinjaParser.ElseBlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockFor}
	 * labeled alternative in {@link JinjaParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockFor(JinjaParser.BlockForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockSet}
	 * labeled alternative in {@link JinjaParser#setStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSet(JinjaParser.BlockSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockSimple}
	 * labeled alternative in {@link JinjaParser#jinjaSimpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSimple(JinjaParser.BlockSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprRoot}
	 * labeled alternative in {@link JinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRoot(JinjaParser.ExprRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link JinjaParser#logicalOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(JinjaParser.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link JinjaParser#logicalAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(JinjaParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link JinjaParser#logicalNotExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(JinjaParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAtom}
	 * labeled alternative in {@link JinjaParser#logicalNotExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAtom(JinjaParser.ExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCompare}
	 * labeled alternative in {@link JinjaParser#comparisonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCompare(JinjaParser.ExprCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAdd}
	 * labeled alternative in {@link JinjaParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdd(JinjaParser.ExprAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMul}
	 * labeled alternative in {@link JinjaParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMul(JinjaParser.ExprMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprUnaryMinus}
	 * labeled alternative in {@link JinjaParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnaryMinus(JinjaParser.ExprUnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprUnary}
	 * labeled alternative in {@link JinjaParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnary(JinjaParser.ExprUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPostfix}
	 * labeled alternative in {@link JinjaParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPostfix(JinjaParser.ExprPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixProperty}
	 * labeled alternative in {@link JinjaParser#postfixPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixProperty(JinjaParser.PostfixPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixFilter}
	 * labeled alternative in {@link JinjaParser#postfixPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixFilter(JinjaParser.PostfixFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixIndex}
	 * labeled alternative in {@link JinjaParser#postfixPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixIndex(JinjaParser.PostfixIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sliceRange}
	 * labeled alternative in {@link JinjaParser#sliceExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceRange(JinjaParser.SliceRangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sliceIndex}
	 * labeled alternative in {@link JinjaParser#sliceExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceIndex(JinjaParser.SliceIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalId}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralId(JinjaParser.LiteralIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalDouble}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralDouble(JinjaParser.LiteralDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalInt}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralInt(JinjaParser.LiteralIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalString}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralString(JinjaParser.LiteralStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalTrue}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralTrue(JinjaParser.LiteralTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalFalse}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralFalse(JinjaParser.LiteralFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalNone}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralNone(JinjaParser.LiteralNoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalParen}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralParen(JinjaParser.LiteralParenContext ctx);
}