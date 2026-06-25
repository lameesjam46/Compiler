// Generated from D:/compiler_2/Compiler/src/Grammer/PaythonGrammer/PyFlaskParser.g4 by ANTLR 4.13.2
package Grammer.PaythonGrammer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PyFlaskParser}.
 */
public interface PyFlaskParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ProgramRoot}
	 * labeled alternative in {@link PyFlaskParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramRoot(PyFlaskParser.ProgramRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProgramRoot}
	 * labeled alternative in {@link PyFlaskParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramRoot(PyFlaskParser.ProgramRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtImport}
	 * labeled alternative in {@link PyFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtImport(PyFlaskParser.StmtImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtImport}
	 * labeled alternative in {@link PyFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtImport(PyFlaskParser.StmtImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtDecoratedFunction}
	 * labeled alternative in {@link PyFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtDecoratedFunction(PyFlaskParser.StmtDecoratedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtDecoratedFunction}
	 * labeled alternative in {@link PyFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtDecoratedFunction(PyFlaskParser.StmtDecoratedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtFunction}
	 * labeled alternative in {@link PyFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtFunction(PyFlaskParser.StmtFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtFunction}
	 * labeled alternative in {@link PyFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtFunction(PyFlaskParser.StmtFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtSimple}
	 * labeled alternative in {@link PyFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtSimple(PyFlaskParser.StmtSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtSimple}
	 * labeled alternative in {@link PyFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtSimple(PyFlaskParser.StmtSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleAssign}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAssign(PyFlaskParser.SimpleAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleAssign}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAssign(PyFlaskParser.SimpleAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleReturn}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleReturn(PyFlaskParser.SimpleReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleReturn}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleReturn(PyFlaskParser.SimpleReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleIf}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIf(PyFlaskParser.SimpleIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleIf}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIf(PyFlaskParser.SimpleIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleFor}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFor(PyFlaskParser.SimpleForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleFor}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFor(PyFlaskParser.SimpleForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStmtNode}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmtNode(PyFlaskParser.BreakStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStmtNode}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmtNode(PyFlaskParser.BreakStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(PyFlaskParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(PyFlaskParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStmtNode}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmtNode(PyFlaskParser.ExprStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStmtNode}
	 * labeled alternative in {@link PyFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmtNode(PyFlaskParser.ExprStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link PyFlaskParser#importstatement}.
	 * @param ctx the parse tree
	 */
	void enterFromImportStmt(PyFlaskParser.FromImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link PyFlaskParser#importstatement}.
	 * @param ctx the parse tree
	 */
	void exitFromImportStmt(PyFlaskParser.FromImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalImportStmt}
	 * labeled alternative in {@link PyFlaskParser#importstatement}.
	 * @param ctx the parse tree
	 */
	void enterGlobalImportStmt(PyFlaskParser.GlobalImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalImportStmt}
	 * labeled alternative in {@link PyFlaskParser#importstatement}.
	 * @param ctx the parse tree
	 */
	void exitGlobalImportStmt(PyFlaskParser.GlobalImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportListNode}
	 * labeled alternative in {@link PyFlaskParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportListNode(PyFlaskParser.ImportListNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportListNode}
	 * labeled alternative in {@link PyFlaskParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportListNode(PyFlaskParser.ImportListNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecAttribute}
	 * labeled alternative in {@link PyFlaskParser#decoratorExpr}.
	 * @param ctx the parse tree
	 */
	void enterDecAttribute(PyFlaskParser.DecAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecAttribute}
	 * labeled alternative in {@link PyFlaskParser#decoratorExpr}.
	 * @param ctx the parse tree
	 */
	void exitDecAttribute(PyFlaskParser.DecAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecName}
	 * labeled alternative in {@link PyFlaskParser#decoratorExpr}.
	 * @param ctx the parse tree
	 */
	void enterDecName(PyFlaskParser.DecNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecName}
	 * labeled alternative in {@link PyFlaskParser#decoratorExpr}.
	 * @param ctx the parse tree
	 */
	void exitDecName(PyFlaskParser.DecNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecCall}
	 * labeled alternative in {@link PyFlaskParser#decoratorExpr}.
	 * @param ctx the parse tree
	 */
	void enterDecCall(PyFlaskParser.DecCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecCall}
	 * labeled alternative in {@link PyFlaskParser#decoratorExpr}.
	 * @param ctx the parse tree
	 */
	void exitDecCall(PyFlaskParser.DecCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorNode}
	 * labeled alternative in {@link PyFlaskParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorNode(PyFlaskParser.DecoratorNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorNode}
	 * labeled alternative in {@link PyFlaskParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorNode(PyFlaskParser.DecoratorNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDefNode}
	 * labeled alternative in {@link PyFlaskParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefNode(PyFlaskParser.FunctionDefNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDefNode}
	 * labeled alternative in {@link PyFlaskParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefNode(PyFlaskParser.FunctionDefNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(PyFlaskParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(PyFlaskParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockNode}
	 * labeled alternative in {@link PyFlaskParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockNode(PyFlaskParser.BlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockNode}
	 * labeled alternative in {@link PyFlaskParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockNode(PyFlaskParser.BlockNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmtNode}
	 * labeled alternative in {@link PyFlaskParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmtNode(PyFlaskParser.IfStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmtNode}
	 * labeled alternative in {@link PyFlaskParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmtNode(PyFlaskParser.IfStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmtNode}
	 * labeled alternative in {@link PyFlaskParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void enterForStmtNode(PyFlaskParser.ForStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmtNode}
	 * labeled alternative in {@link PyFlaskParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void exitForStmtNode(PyFlaskParser.ForStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmtNode}
	 * labeled alternative in {@link PyFlaskParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmtNode(PyFlaskParser.ReturnStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmtNode}
	 * labeled alternative in {@link PyFlaskParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmtNode(PyFlaskParser.ReturnStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmtNode}
	 * labeled alternative in {@link PyFlaskParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmtNode(PyFlaskParser.AssignStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmtNode}
	 * labeled alternative in {@link PyFlaskParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmtNode(PyFlaskParser.AssignStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(PyFlaskParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(PyFlaskParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(PyFlaskParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(PyFlaskParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListLiteralNode}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListLiteralNode(PyFlaskParser.ListLiteralNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListLiteralNode}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListLiteralNode(PyFlaskParser.ListLiteralNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomStringNode}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomStringNode(PyFlaskParser.AtomStringNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomStringNode}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomStringNode(PyFlaskParser.AtomStringNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(PyFlaskParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(PyFlaskParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(PyFlaskParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(PyFlaskParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomIdNode}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomIdNode(PyFlaskParser.AtomIdNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomIdNode}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomIdNode(PyFlaskParser.AtomIdNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseLit}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseLit(PyFlaskParser.FalseLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseLit}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseLit(PyFlaskParser.FalseLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subscript}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(PyFlaskParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subscript}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(PyFlaskParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictLiteralNode}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteralNode(PyFlaskParser.DictLiteralNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictLiteralNode}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteralNode(PyFlaskParser.DictLiteralNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoneLit}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNoneLit(PyFlaskParser.NoneLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoneLit}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNoneLit(PyFlaskParser.NoneLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(PyFlaskParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(PyFlaskParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(PyFlaskParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(PyFlaskParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIsExpr(PyFlaskParser.IsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIsExpr(PyFlaskParser.IsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomNumberNode}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomNumberNode(PyFlaskParser.AtomNumberNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomNumberNode}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomNumberNode(PyFlaskParser.AtomNumberNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueLit}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueLit(PyFlaskParser.TrueLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueLit}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueLit(PyFlaskParser.TrueLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivision(PyFlaskParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivision(PyFlaskParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInExpr(PyFlaskParser.InExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInExpr(PyFlaskParser.InExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PyFlaskParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PyFlaskParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpr(PyFlaskParser.TernaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpr}
	 * labeled alternative in {@link PyFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpr(PyFlaskParser.TernaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(PyFlaskParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(PyFlaskParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyFlaskParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(PyFlaskParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyFlaskParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(PyFlaskParser.ArgListContext ctx);
}