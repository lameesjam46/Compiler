package JinjaAST;

public abstract class PostfixPart extends ASTNode {
    protected PostfixPart(int line) {
        super(line);
    }

    @Override
    public abstract String toString();
}
