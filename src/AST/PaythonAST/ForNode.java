package AST.PaythonAST;

public class ForNode extends ASTNode {

    private String variable;

    public ForNode(String variable, ASTNode iterable, Integer lineno) {
        super("For: " + variable, lineno);
        this.variable = variable;
        this.addChild(iterable);   // الـ iterable صار child حقيقي، مش String ضايع
    }

    public String getVariable() {
        return variable;
    }

    public ASTNode getIterable() {
        return getChildren().isEmpty() ? null : getChildren().get(0);
    }
}