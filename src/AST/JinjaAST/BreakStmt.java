package AST.JinjaAST;

public class BreakStmt extends Stmt {
    public BreakStmt(int line) {
        super(line);
    }

    @Override
    public String toString() {
        return "break";
    }
}
