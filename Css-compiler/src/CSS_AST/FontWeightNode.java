package CSS_AST;

 public class FontWeightNode extends PropertyNode {
    public String value;

    public FontWeightNode(String value, int line) {
        super("FontWeightNode", line);
        this.value = value;
    }

    @Override
  public   void print(String indent) {
        System.out.println(indent + name + ": " + value + " (line " + line + ")");
    }
}
