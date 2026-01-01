package CSS_AST;

 public abstract class PropertyNode extends ASTNode {
    public PropertyNode(String name, int line) {
        super(name, line);
    }

    public abstract void print(String indent);
}
