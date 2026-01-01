package JinjaAST;

public abstract class Expression extends ASTNode {
    protected Expression(int line) {
        super(line);
    }

    @Override
    public abstract String toString();
}
