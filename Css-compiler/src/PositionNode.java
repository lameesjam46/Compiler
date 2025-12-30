public class PositionNode extends PropertyNode {
    public String value;

    public PositionNode(String value, int line) {
        super("PositionNode", line);
        this.value = value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + name + ": " + value + " (line " + line + ")");
    }
}