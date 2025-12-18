// Generated from C:/Users/dell/IdeaProjects/Compiler/src/JinjaGrammer/JinjaParser.g4 by ANTLR 4.13.2
package JinjaGrammer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JinjaParser}.
 */
public interface JinjaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code documentRoot}
	 * labeled alternative in {@link JinjaParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocumentRoot(JinjaParser.DocumentRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code documentRoot}
	 * labeled alternative in {@link JinjaParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocumentRoot(JinjaParser.DocumentRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nodeHtml}
	 * labeled alternative in {@link JinjaParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNodeHtml(JinjaParser.NodeHtmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nodeHtml}
	 * labeled alternative in {@link JinjaParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNodeHtml(JinjaParser.NodeHtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nodeJinjaExpr}
	 * labeled alternative in {@link JinjaParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNodeJinjaExpr(JinjaParser.NodeJinjaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nodeJinjaExpr}
	 * labeled alternative in {@link JinjaParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNodeJinjaExpr(JinjaParser.NodeJinjaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nodeJinjaStmt}
	 * labeled alternative in {@link JinjaParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNodeJinjaStmt(JinjaParser.NodeJinjaStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nodeJinjaStmt}
	 * labeled alternative in {@link JinjaParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNodeJinjaStmt(JinjaParser.NodeJinjaStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nodeHtmlText}
	 * labeled alternative in {@link JinjaParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNodeHtmlText(JinjaParser.NodeHtmlTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nodeHtmlText}
	 * labeled alternative in {@link JinjaParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNodeHtmlText(JinjaParser.NodeHtmlTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nodeHtmlComment}
	 * labeled alternative in {@link JinjaParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNodeHtmlComment(JinjaParser.NodeHtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nodeHtmlComment}
	 * labeled alternative in {@link JinjaParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNodeHtmlComment(JinjaParser.NodeHtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nodeHtmlDoctype}
	 * labeled alternative in {@link JinjaParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNodeHtmlDoctype(JinjaParser.NodeHtmlDoctypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nodeHtmlDoctype}
	 * labeled alternative in {@link JinjaParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNodeHtmlDoctype(JinjaParser.NodeHtmlDoctypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlNormalElement}
	 * labeled alternative in {@link JinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlNormalElement(JinjaParser.HtmlNormalElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlNormalElement}
	 * labeled alternative in {@link JinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlNormalElement(JinjaParser.HtmlNormalElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlSelfClosingElement}
	 * labeled alternative in {@link JinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlSelfClosingElement(JinjaParser.HtmlSelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlSelfClosingElement}
	 * labeled alternative in {@link JinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlSelfClosingElement(JinjaParser.HtmlSelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlEndTag}
	 * labeled alternative in {@link JinjaParser#endTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlEndTag(JinjaParser.HtmlEndTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlEndTag}
	 * labeled alternative in {@link JinjaParser#endTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlEndTag(JinjaParser.HtmlEndTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttr}
	 * labeled alternative in {@link JinjaParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttr(JinjaParser.HtmlAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttr}
	 * labeled alternative in {@link JinjaParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttr(JinjaParser.HtmlAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlContentBlock}
	 * labeled alternative in {@link JinjaParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentBlock(JinjaParser.HtmlContentBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlContentBlock}
	 * labeled alternative in {@link JinjaParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentBlock(JinjaParser.HtmlContentBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaExpression}
	 * labeled alternative in {@link JinjaParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpression(JinjaParser.JinjaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaExpression}
	 * labeled alternative in {@link JinjaParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpression(JinjaParser.JinjaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaStatement}
	 * labeled alternative in {@link JinjaParser#jinjaStmt}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStatement(JinjaParser.JinjaStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaStatement}
	 * labeled alternative in {@link JinjaParser#jinjaStmt}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStatement(JinjaParser.JinjaStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link JinjaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtIf(JinjaParser.StmtIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link JinjaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtIf(JinjaParser.StmtIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtElif}
	 * labeled alternative in {@link JinjaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtElif(JinjaParser.StmtElifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtElif}
	 * labeled alternative in {@link JinjaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtElif(JinjaParser.StmtElifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtElse}
	 * labeled alternative in {@link JinjaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtElse(JinjaParser.StmtElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtElse}
	 * labeled alternative in {@link JinjaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtElse(JinjaParser.StmtElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtFor}
	 * labeled alternative in {@link JinjaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtFor(JinjaParser.StmtForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtFor}
	 * labeled alternative in {@link JinjaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtFor(JinjaParser.StmtForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtSet}
	 * labeled alternative in {@link JinjaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtSet(JinjaParser.StmtSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtSet}
	 * labeled alternative in {@link JinjaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtSet(JinjaParser.StmtSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtEndIf}
	 * labeled alternative in {@link JinjaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtEndIf(JinjaParser.StmtEndIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtEndIf}
	 * labeled alternative in {@link JinjaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtEndIf(JinjaParser.StmtEndIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtEndFor}
	 * labeled alternative in {@link JinjaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtEndFor(JinjaParser.StmtEndForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtEndFor}
	 * labeled alternative in {@link JinjaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtEndFor(JinjaParser.StmtEndForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtContinue}
	 * labeled alternative in {@link JinjaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtContinue(JinjaParser.StmtContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtContinue}
	 * labeled alternative in {@link JinjaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtContinue(JinjaParser.StmtContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtBreak}
	 * labeled alternative in {@link JinjaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtBreak(JinjaParser.StmtBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtBreak}
	 * labeled alternative in {@link JinjaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtBreak(JinjaParser.StmtBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link JinjaParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JinjaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link JinjaParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JinjaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elifStatement}
	 * labeled alternative in {@link JinjaParser#elifStmt}.
	 * @param ctx the parse tree
	 */
	void enterElifStatement(JinjaParser.ElifStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elifStatement}
	 * labeled alternative in {@link JinjaParser#elifStmt}.
	 * @param ctx the parse tree
	 */
	void exitElifStatement(JinjaParser.ElifStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elseStatement}
	 * labeled alternative in {@link JinjaParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(JinjaParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elseStatement}
	 * labeled alternative in {@link JinjaParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(JinjaParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link JinjaParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JinjaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link JinjaParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JinjaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setStatement}
	 * labeled alternative in {@link JinjaParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void enterSetStatement(JinjaParser.SetStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setStatement}
	 * labeled alternative in {@link JinjaParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void exitSetStatement(JinjaParser.SetStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprRoot}
	 * labeled alternative in {@link JinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprRoot(JinjaParser.ExprRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprRoot}
	 * labeled alternative in {@link JinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprRoot(JinjaParser.ExprRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link JinjaParser#logicalOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(JinjaParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link JinjaParser#logicalOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(JinjaParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link JinjaParser#logicalAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(JinjaParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link JinjaParser#logicalAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(JinjaParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link JinjaParser#logicalNotExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(JinjaParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link JinjaParser#logicalNotExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(JinjaParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAtom}
	 * labeled alternative in {@link JinjaParser#logicalNotExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprAtom(JinjaParser.ExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAtom}
	 * labeled alternative in {@link JinjaParser#logicalNotExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprAtom(JinjaParser.ExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCompare}
	 * labeled alternative in {@link JinjaParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprCompare(JinjaParser.ExprCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCompare}
	 * labeled alternative in {@link JinjaParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprCompare(JinjaParser.ExprCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAdd}
	 * labeled alternative in {@link JinjaParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(JinjaParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAdd}
	 * labeled alternative in {@link JinjaParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(JinjaParser.ExprAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMul}
	 * labeled alternative in {@link JinjaParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprMul(JinjaParser.ExprMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMul}
	 * labeled alternative in {@link JinjaParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprMul(JinjaParser.ExprMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprUnaryMinus}
	 * labeled alternative in {@link JinjaParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnaryMinus(JinjaParser.ExprUnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprUnaryMinus}
	 * labeled alternative in {@link JinjaParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnaryMinus(JinjaParser.ExprUnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprUnary}
	 * labeled alternative in {@link JinjaParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(JinjaParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprUnary}
	 * labeled alternative in {@link JinjaParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(JinjaParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPostfix}
	 * labeled alternative in {@link JinjaParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprPostfix(JinjaParser.ExprPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPostfix}
	 * labeled alternative in {@link JinjaParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprPostfix(JinjaParser.ExprPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixProperty}
	 * labeled alternative in {@link JinjaParser#postfixPart}.
	 * @param ctx the parse tree
	 */
	void enterPostfixProperty(JinjaParser.PostfixPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixProperty}
	 * labeled alternative in {@link JinjaParser#postfixPart}.
	 * @param ctx the parse tree
	 */
	void exitPostfixProperty(JinjaParser.PostfixPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixFilter}
	 * labeled alternative in {@link JinjaParser#postfixPart}.
	 * @param ctx the parse tree
	 */
	void enterPostfixFilter(JinjaParser.PostfixFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixFilter}
	 * labeled alternative in {@link JinjaParser#postfixPart}.
	 * @param ctx the parse tree
	 */
	void exitPostfixFilter(JinjaParser.PostfixFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixIndex}
	 * labeled alternative in {@link JinjaParser#postfixPart}.
	 * @param ctx the parse tree
	 */
	void enterPostfixIndex(JinjaParser.PostfixIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixIndex}
	 * labeled alternative in {@link JinjaParser#postfixPart}.
	 * @param ctx the parse tree
	 */
	void exitPostfixIndex(JinjaParser.PostfixIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sliceRange}
	 * labeled alternative in {@link JinjaParser#sliceExpr}.
	 * @param ctx the parse tree
	 */
	void enterSliceRange(JinjaParser.SliceRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sliceRange}
	 * labeled alternative in {@link JinjaParser#sliceExpr}.
	 * @param ctx the parse tree
	 */
	void exitSliceRange(JinjaParser.SliceRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sliceIndex}
	 * labeled alternative in {@link JinjaParser#sliceExpr}.
	 * @param ctx the parse tree
	 */
	void enterSliceIndex(JinjaParser.SliceIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sliceIndex}
	 * labeled alternative in {@link JinjaParser#sliceExpr}.
	 * @param ctx the parse tree
	 */
	void exitSliceIndex(JinjaParser.SliceIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalId}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLiteralId(JinjaParser.LiteralIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalId}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLiteralId(JinjaParser.LiteralIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalInt}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLiteralInt(JinjaParser.LiteralIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalInt}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLiteralInt(JinjaParser.LiteralIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalString}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLiteralString(JinjaParser.LiteralStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalString}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLiteralString(JinjaParser.LiteralStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalTrue}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLiteralTrue(JinjaParser.LiteralTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalTrue}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLiteralTrue(JinjaParser.LiteralTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalFalse}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLiteralFalse(JinjaParser.LiteralFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalFalse}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLiteralFalse(JinjaParser.LiteralFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalNone}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLiteralNone(JinjaParser.LiteralNoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalNone}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLiteralNone(JinjaParser.LiteralNoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalParen}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLiteralParen(JinjaParser.LiteralParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalParen}
	 * labeled alternative in {@link JinjaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLiteralParen(JinjaParser.LiteralParenContext ctx);
}