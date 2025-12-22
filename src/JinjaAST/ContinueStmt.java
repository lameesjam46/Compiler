package JinjaAST;

public class ContinueStmt extends Stmt {
    public ContinueStmt(int line) {
        super(line);
    }

    @Override
    public String toString() {
        return "continue";
    }
}
