package CSS_AST;

public abstract class ASTNode {
    public int line;
    public String name;

    ASTNode(String name, int line) {
        this.name = name;
        this.line = line;
    }



    abstract void print(String indent);
}
