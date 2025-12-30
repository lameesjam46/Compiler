public class DisplayNode extends PropertyNode {
    public String value;

    public DisplayNode(String value, int line) {
        super("DisplayNode", line);
        this.value = value;
    }

    @Override
  public  void print(String indent) {
        System.out.println(indent + name + ": " + value + " (line " + line + ")");
    }
}
