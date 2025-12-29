package AST;


public class ModifierNode extends ASTNode {
    public ModifierType type;
    public String value;

    public ModifierNode() {
        this.type = type;
        this.value= value;
    }

    @Override
    void print(String indent) {
        System.out.println(indent + "ModifierNode: " + type + " " + value);
    }
}

