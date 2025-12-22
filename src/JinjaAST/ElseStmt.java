package JinjaAST;

public class ElseStmt extends Stmt {
    public ElseStmt(int line) {
        super(line);
    }

    @Override
    public String toString() {
        return "else";
    }
}
