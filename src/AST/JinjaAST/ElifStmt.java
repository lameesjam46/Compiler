package AST.JinjaAST;

public class ElifStmt extends Stmt {
    private final Expression condition;

    public ElifStmt(int line, Expression condition) {
        super(line);
        this.condition = condition;
    }
    public Expression getCondition() { return condition; }

    @Override
    public String toString() {
        return "elif " + condition;
    }
}
