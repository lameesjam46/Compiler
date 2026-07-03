package AST.PaythonAST;

public class AssignmentNode extends ASTNode {

    public AssignmentNode(ASTNode left, ASTNode right, int line) {
        super("Assignment", line);
        this.addChild(left);    // child 0 = الطرف الأيسر (متغير أو Subscript أو Attribute)
        this.addChild(right);   // child 1 = القيمة
    }

    public ASTNode getLeft()  { return getChildren().get(0); }
    public ASTNode getRight() { return getChildren().get(1); }
}