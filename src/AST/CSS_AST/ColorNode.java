package AST.CSS_AST;

 public class ColorNode extends PropertyNode {
    public String color;

    public ColorNode(String color, int line) {
        super("ColorNode", line);
        this.color = color;
    }

    @Override
  public void print(String indent) {
        System.out.println(indent + name + ": " + color + " (line " + line + ")");
    }
}

