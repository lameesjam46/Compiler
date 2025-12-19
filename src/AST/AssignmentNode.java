package AST;


public class AssignmentNode extends ASTNode {

    private String target;
    private String value;

    public AssignmentNode(String target, String value, Integer lineno) {
        super("Assignment", lineno);
        this.target = target;
        this.value = value;
    }

    public String getTarget() {
        return target;
    }

    public String getValue() {
        return value;
    }
}
