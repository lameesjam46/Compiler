package AST.PaythonAST;

public class ReturnNode extends ASTNode {

    private String value;

    public ReturnNode(String value, Integer lineno) {
        super("Return", lineno);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
