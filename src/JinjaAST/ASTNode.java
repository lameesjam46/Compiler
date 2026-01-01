package JinjaAST;

// ===================== ASTNode =====================
public abstract class ASTNode {
    protected final int line;

    protected ASTNode(int line) {
        this.line = line;
    }

    public int getLine() {
        return line;
    }
}