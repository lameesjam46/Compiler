package AST;

public class ParamNode extends ASTNode {
    private String name;

    public ParamNode(String name, int line) {
        super("Param", line);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
