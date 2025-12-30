public class ModifierNode extends ASTNode {
    public ModifierType type;
    public String value;

    public ModifierNode(ModifierType type, String value, int line) {
        super("ModifierNode", line);
        this.type = type;
        this.value = value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + name + ": " + type + " " + value + " (line " + line + ")");
    }
}

