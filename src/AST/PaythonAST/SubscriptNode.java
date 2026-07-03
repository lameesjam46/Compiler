package AST.PaythonAST;

public class SubscriptNode extends ASTNode {

    public SubscriptNode(ASTNode target, ASTNode index, int line) {
        super("Subscript", line);
        this.addChild(target);   // child 0 = products
        this.addChild(index);    // child 1 = i أو "id"
    }

    public ASTNode getTarget() { return getChildren().get(0); }
    public ASTNode getIndex()  { return getChildren().get(1); }
}