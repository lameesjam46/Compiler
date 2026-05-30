package AST.JinjaAST;
import java.util.List;

public class ElseStmt extends Stmt {
    private final List<Node> body; // إضافة الـ body

    public ElseStmt(int line, List<Node> body) {
        super(line);
        this.body = body;
    }

    public List<Node> getBody() { return body; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("else\n");
        for (Node n : body) sb.append(n.toString());
        return sb.toString();
    }
}