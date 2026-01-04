package AST.CSS_AST;

 public class TextAlignNode extends PropertyNode {
    public String align;

    public TextAlignNode(String align, int line) {
        super("TextAlignNode", line);
        this.align = align;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + name + ": " + align + " (line " + line + ")");
    }
}

