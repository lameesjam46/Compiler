package AST.CSS_AST;

 public class FontSizeNode extends PropertyNode {
    public String size;

    public FontSizeNode(String size, int line) {
        super("FontSizeNode", line);
        this.size = size;
    }

    @Override
  public   void print(String indent) {
        System.out.println(indent + name + ": " + size + " (line " + line + ")");
    }
}
