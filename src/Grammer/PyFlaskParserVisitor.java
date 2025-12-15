// Generated from C:/Users/dell/IdeaProjects/Compiler/src/Grammer/PyFlaskParser.g4 by ANTLR 4.13.2
package Grammer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PyFlaskParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PyFlaskParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PyFlaskParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PyFlaskParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyFlaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PyFlaskParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyFlaskParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(PyFlaskParser.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyFlaskParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportList(PyFlaskParser.ImportListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyFlaskParser#routeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteStmt(PyFlaskParser.RouteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyFlaskParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(PyFlaskParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyFlaskParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PyFlaskParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmt(PyFlaskParser.SimpleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyFlaskParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PyFlaskParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyFlaskParser#exprStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStart(PyFlaskParser.ExprStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(PyFlaskParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpr(PyFlaskParser.ListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictExpr(PyFlaskParser.DictExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(PyFlaskParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(PyFlaskParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(PyFlaskParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyFlaskParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(PyFlaskParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeywordArg}
	 * labeled alternative in {@link PyFlaskParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordArg(PyFlaskParser.KeywordArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PositionalArg}
	 * labeled alternative in {@link PyFlaskParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalArg(PyFlaskParser.PositionalArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyFlaskParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(PyFlaskParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyFlaskParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(PyFlaskParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyFlaskParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(PyFlaskParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyFlaskParser#dictLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictLiteral(PyFlaskParser.DictLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyFlaskParser#pairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairList(PyFlaskParser.PairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyFlaskParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(PyFlaskParser.PairContext ctx);
}