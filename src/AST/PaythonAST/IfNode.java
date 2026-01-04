package AST.PaythonAST;

public class IfNode extends ASTNode {

    private String condition;

    public IfNode(String condition, Integer lineno) {
        super("If", lineno);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }
}
