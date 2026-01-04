package AST.CSS_AST;

 public class Size1Node extends PropertyNode {
    public String value;

    public Size1Node(String name, String value, int line) {
        super(name, line);
        this.value = value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + name + " = " + value + " (line " + line + ")");
    }
}
