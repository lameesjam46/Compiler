package JinjaAST;

public class UnaryExpr extends Expression {
    private final String op;
    private final Expression expr;

    public UnaryExpr(int line, String op, Expression expr) {
        super(line);
        this.op = op;
        this.expr = expr;
    }
    public Expression getExpr() { return expr; }
    public String getOp() { return op; }
    @Override
    public String toString() {
        return op + expr;
    }
}
