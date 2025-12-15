// Generated from C:/Users/dell/IdeaProjects/Compiler/src/Grammer/PyFlaskParser.g4 by ANTLR 4.13.2
package Grammer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PyFlaskParser}.
 */
public interface PyFlaskParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PyFlaskParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PyFlaskParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PyFlaskParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PyFlaskParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(PyFlaskParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(PyFlaskParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(PyFlaskParser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(PyFlaskParser.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#routeStmt}.
	 * @param ctx the parse tree
	 */
	void enterRouteStmt(PyFlaskParser.RouteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#routeStmt}.
	 * @param ctx the parse tree
	 */
	void exitRouteStmt(PyFlaskParser.RouteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(PyFlaskParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(PyFlaskParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PyFlaskParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PyFlaskParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(PyFlaskParser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(PyFlaskParser.SimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PyFlaskParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PyFlaskParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#exprStart}.
	 * @param ctx the parse tree
	 */
	void enterExprStart(PyFlaskParser.ExprStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#exprStart}.
	 * @param ctx the parse tree
	 */
	void exitExprStart(PyFlaskParser.ExprStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(PyFlaskParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(PyFlaskParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListExpr(PyFlaskParser.ListExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListExpr(PyFlaskParser.ListExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDictExpr(PyFlaskParser.DictExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDictExpr(PyFlaskParser.DictExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(PyFlaskParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(PyFlaskParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(PyFlaskParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(PyFlaskParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(PyFlaskParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(PyFlaskParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(PyFlaskParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(PyFlaskParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeywordArg}
	 * labeled alternative in {@link PyFlaskParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterKeywordArg(PyFlaskParser.KeywordArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeywordArg}
	 * labeled alternative in {@link PyFlaskParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitKeywordArg(PyFlaskParser.KeywordArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PositionalArg}
	 * labeled alternative in {@link PyFlaskParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterPositionalArg(PyFlaskParser.PositionalArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PositionalArg}
	 * labeled alternative in {@link PyFlaskParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitPositionalArg(PyFlaskParser.PositionalArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(PyFlaskParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(PyFlaskParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(PyFlaskParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(PyFlaskParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(PyFlaskParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(PyFlaskParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteral(PyFlaskParser.DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteral(PyFlaskParser.DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#pairList}.
	 * @param ctx the parse tree
	 */
	void enterPairList(PyFlaskParser.PairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#pairList}.
	 * @param ctx the parse tree
	 */
	void exitPairList(PyFlaskParser.PairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(PyFlaskParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(PyFlaskParser.PairContext ctx);
}