package AST.JinjaAST;

public class BinaryExpr extends Expression {
    private final Expression left, right;
    private final String op;

    public BinaryExpr(int line, Expression left, String op, Expression right) {
        super(line);
        this.left = left;
        this.op = op;
        this.right = right;
    }
    public Expression getLeft() { return left; }
    public Expression getRight() { return right; }
    public String getOp() { return op; }


    @Override
    public String toString() {
        return left + " " + op + " " + right;
    }
}
