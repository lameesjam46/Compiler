package AST.CSS_AST;

 public abstract class StatementNode extends ASTNode {
     StatementNode(String name, int line) {
        super(name, line);
    }

    public abstract void print(String indent);
}
