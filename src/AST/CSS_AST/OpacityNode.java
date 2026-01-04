package AST.CSS_AST;

 public class OpacityNode extends PropertyNode {
    public String value;

    public OpacityNode(String value, int line) {
        super("OpacityNode", line);
        this.value = value;
    }

    @Override
   public void print(String indent) {
        System.out.println(indent + name + ": " + value + " (line " + line + ")");
    }
}