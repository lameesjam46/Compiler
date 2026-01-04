package AST.JinjaAST;

public abstract class Stmt extends Node {
    protected Stmt(int line) {
        super(line);
    }

    @Override
    public abstract String toString();
}
