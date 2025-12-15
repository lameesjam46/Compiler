package JinjaAST;

public class JinjaExprNode extends ASTNode{
    private String value;

    public JinjaExprNode(String value, int line) {
        super(line);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "JinjaExpr(" + value + ")";
    }
}
