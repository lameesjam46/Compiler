package AST.PaythonAST;

public class TernaryNode extends ASTNode {

    public TernaryNode(ASTNode trueValue, ASTNode condition, ASTNode falseValue, int line) {
        super("Ternary", line);
        this.addChild(trueValue);   // child 0
        this.addChild(condition);   // child 1
        this.addChild(falseValue);  // child 2
    }

    public ASTNode getTrueValue()  { return getChildren().get(0); }
    public ASTNode getCondition()  { return getChildren().get(1); }
    public ASTNode getFalseValue() { return getChildren().get(2); }
}