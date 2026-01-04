package AST.PaythonAST;

public class CallNode extends ASTNode {
    public CallNode(ASTNode function, int line) {
        super("Call: " + function.getNodeName(), line);
    }
}