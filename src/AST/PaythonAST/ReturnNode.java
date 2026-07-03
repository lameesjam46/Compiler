package AST.PaythonAST;

public class ReturnNode extends ASTNode {
    public ReturnNode(ASTNode value, Integer lineno) {
        super("Return", lineno);
        this.addChild(value);
    }
    public ASTNode getValue() { return getChildren().isEmpty() ? null : getChildren().get(0); }
}