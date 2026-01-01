package JinjaAST;

public class JinjaStatement extends JinjaNode {
    private final Stmt stmt;

    public JinjaStatement(int line, Stmt stmt) {
        super(line);
        this.stmt = stmt;
    }
    public Stmt getStmt() { return stmt; }

    @Override
    public String toString() {
        return "{% " + stmt + " %}";
    }
}
