package JinjaAST;

public class EndIfStmt extends Stmt {

    public EndIfStmt(int line) {
        super(line);
    }

    @Override
    public String toString() {
        return "endif";
    }
}
