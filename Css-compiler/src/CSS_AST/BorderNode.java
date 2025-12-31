package CSS_AST;

 public class BorderNode extends PropertyNode {
    public String width;
    public String style;
    public String color;

    public BorderNode(String width, String style, String color, int line) {
        super("BorderNode", line);
        this.width = width;
        this.style = style;
        this.color = color;
    }

    @Override
   public void print(String indent) {
        System.out.println(indent + name + ": width=" + width + " style=" + style + " color=" + color + " (line " + line + ")");
    }
}