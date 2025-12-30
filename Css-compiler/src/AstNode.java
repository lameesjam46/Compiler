abstract class ASTNode {
    public int line;
    public String name;

    public ASTNode(String name, int line) {
        this.name = name;
        this.line = line;
    }



  public abstract void print(String indent);
}
