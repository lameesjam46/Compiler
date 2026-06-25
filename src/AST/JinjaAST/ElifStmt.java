package AST.JinjaAST;
import java.util.List;

public class ElifStmt extends Stmt {
    private final Expression condition;
    private final List<Node> body; // إضافة الـ body

    public ElifStmt(int line, Expression condition, List<Node> body) {
        super(line);
        this.condition = condition;
        this.body = body;
    }

    public Expression getCondition() { return condition; }
    public List<Node> getBody() { return body; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("elif ").append(condition).append("\n");
        for (Node n : body) sb.append(n.toString());
        return sb.toString();
    }
}