package AST.PaythonAST;

public class ForNode extends ASTNode {

    private String variable;
    private String iterable;

    public ForNode(String variable, Integer lineno) {
        super("For", lineno);
        this.variable = variable;
        this.iterable = iterable;
    }

    public String getVariable() {
        return variable;
    }

    public String getIterable() {
        return iterable;
    }
}
