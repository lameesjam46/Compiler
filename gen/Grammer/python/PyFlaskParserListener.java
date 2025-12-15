// Generated from C:/Users/dell/IdeaProjects/Compiler/src/Grammer/python/PyFlaskParser.g4 by ANTLR 4.13.2
package Grammer.python;
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
}