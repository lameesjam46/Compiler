// Generated from C:/Users/dell/IdeaProjects/Compiler/src/Grammer/python/PyFlaskParser.g4 by ANTLR 4.13.2
package Grammer.python;
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
}