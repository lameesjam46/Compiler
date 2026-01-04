package AST.PaythonAST;


public class ContinueNode extends ASTNode {

    public ContinueNode(Integer lineno) {
        super("Continue", lineno);
    }

    @Override
    public String toString() {
        return "ContinueNode(line=" + lineno + ")";
    }
}
