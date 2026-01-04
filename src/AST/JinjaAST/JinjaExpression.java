package AST.JinjaAST;

public class JinjaExpression extends JinjaNode {
    private final Expression expr;

    public JinjaExpression(int line, Expression expr) {
        super(line);
        this.expr = expr;
    }
    public Expression getExpr() { return expr; }


    @Override
    public String toString() {
        return "{{ " + expr + " }}";
    }
}
