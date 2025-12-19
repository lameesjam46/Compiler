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
	 * Visit a parse tree produced by the {@code ProgramRoot}
	 * labeled alternative in {@link PyFlaskParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramRoot(PyFlaskParser.ProgramRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtImport}
	 * labeled alternative in {@link PyFlaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtImport(PyFlaskParser.StmtImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtDecoratedFunction}
	 * labeled alternative in {@link PyFlaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtDecoratedFunction(PyFlaskParser.StmtDecoratedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtFunction}
	 * labeled alternative in {@link PyFlaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtFunction(PyFlaskParser.StmtFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtSimple}
	 * labeled alternative in {@link PyFlaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtSimple(PyFlaskParser.StmtSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleAssign}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssign(PyFlaskParser.SimpleAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleReturn}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleReturn(PyFlaskParser.SimpleReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleIf}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIf(PyFlaskParser.SimpleIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleFor}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFor(PyFlaskParser.SimpleForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStmtNode}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmtNode(PyFlaskParser.BreakStmtNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStmtNode}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmtNode(PyFlaskParser.ExprStmtNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link PyFlaskParser#importstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImportStmt(PyFlaskParser.FromImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalImportStmt}
	 * labeled alternative in {@link PyFlaskParser#importstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalImportStmt(PyFlaskParser.GlobalImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportListNode}
	 * labeled alternative in {@link PyFlaskParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportListNode(PyFlaskParser.ImportListNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorNode}
	 * labeled alternative in {@link PyFlaskParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorNode(PyFlaskParser.DecoratorNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDefNode}
	 * labeled alternative in {@link PyFlaskParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefNode(PyFlaskParser.FunctionDefNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyFlaskParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(PyFlaskParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockNode}
	 * labeled alternative in {@link PyFlaskParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockNode(PyFlaskParser.BlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmtNode}
	 * labeled alternative in {@link PyFlaskParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmtNode(PyFlaskParser.IfStmtNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmtNode}
	 * labeled alternative in {@link PyFlaskParser#forstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmtNode(PyFlaskParser.ForStmtNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmtNode}
	 * labeled alternative in {@link PyFlaskParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmtNode(PyFlaskParser.ReturnStmtNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStmtNode}
	 * labeled alternative in {@link PyFlaskParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmtNode(PyFlaskParser.AssignStmtNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(PyFlaskParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(PyFlaskParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListLiteralNode}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteralNode(PyFlaskParser.ListLiteralNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomStringNode}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomStringNode(PyFlaskParser.AtomStringNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(PyFlaskParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(PyFlaskParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomIdNode}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomIdNode(PyFlaskParser.AtomIdNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseLit}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLit(PyFlaskParser.FalseLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subscript}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(PyFlaskParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictLiteralNode}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictLiteralNode(PyFlaskParser.DictLiteralNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoneLit}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneLit(PyFlaskParser.NoneLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(PyFlaskParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(PyFlaskParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomNumberNode}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNumberNode(PyFlaskParser.AtomNumberNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueLit}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLit(PyFlaskParser.TrueLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(PyFlaskParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PyFlaskParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpr(PyFlaskParser.TernaryExprContext ctx);
}