public class BackgroundNode extends PropertyNode {
    public String color;

    public BackgroundNode(String color, int line) {
        super("BackgroundNode", line);
        this.color = color;
    }

    @Override
   public void print(String indent) {
        System.out.println(indent + name + ": " + color + " (line " + line + ")");
    }
}
