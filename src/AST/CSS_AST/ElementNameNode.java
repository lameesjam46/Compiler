package AST.CSS_AST;

 public class ElementNameNode extends ASTNode {
    public String nameValue;

    public ElementNameNode(String nameValue, int line) {
        super("ElementNameNode", line);
        this.nameValue = nameValue;
    }

    @Override
   public void print(String indent) {
        System.out.println(indent + name + ": " + nameValue + " (line " + line + ")");
    }
}
