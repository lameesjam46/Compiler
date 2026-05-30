package AST.JinjaAST;
import java.util.List;

public class IfStmt extends Stmt {
    private final Expression condition;
    private final List<Node> thenBranch;
    private final List<ElifStmt> elifBlocks;
    private final ElseStmt elseBlock;

    public IfStmt(int line, Expression condition, List<Node> thenBranch, List<ElifStmt> elifBlocks, ElseStmt elseBlock) {
        super(line);
        this.condition = condition;
        this.thenBranch = thenBranch;
        this.elifBlocks = elifBlocks;
        this.elseBlock = elseBlock;
    }

    public Expression getCondition() { return condition; }
    public List<Node> getThenBranch() { return thenBranch; }
    public List<ElifStmt> getElifBlocks() { return elifBlocks; } // تمت الإضافة
    public ElseStmt getElseBlock() { return elseBlock; }       // تمت الإضافة

    @Override
    public String toString() {
        return "if " + condition;
    }
}