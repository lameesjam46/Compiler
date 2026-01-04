package AST.JinjaAST;

public class IfStmt extends Stmt {
    private final Expression condition;

    public IfStmt(int line, Expression condition) {
        super(line);
        this.condition = condition;
    }
    public Expression getCondition() { return condition; }

    @Override
    public String toString() {
        return "if " + condition;
    }
}
