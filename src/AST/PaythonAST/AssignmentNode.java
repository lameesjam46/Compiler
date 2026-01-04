package AST.PaythonAST;

public class AssignmentNode extends ASTNode {
    private String left;
    private String right;

    public AssignmentNode(String left, String right, int line) {
        super("Assignment", line);
        this.left = left;
        this.right = right;
    }

    public String getLeft() { return left; }
    public String getRight() { return right; }
}