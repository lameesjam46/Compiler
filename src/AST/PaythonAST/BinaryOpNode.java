package AST.PaythonAST;

public class BinaryOpNode extends ASTNode {
    public BinaryOpNode(ASTNode left, String operator, ASTNode right, int line) {
        super("BinaryOp: " + operator, line);
        this.addChild(left);
        this.addChild(right);
    }
}