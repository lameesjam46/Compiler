package AST.JinjaAST;
import java.util.List;

public class ElseStmt extends Stmt {
    private final List<Node> body;

    public ElseStmt(int line, List<Node> body) {
        super(line);
        this.body = body;
    }

    public List<Node> getBody() { return body; }

    @Override
    public String toString() {
        // تعديل: أضفنا أقواس {% else %} — بدون endif هون كمان،
        // لأنه {% endif %} تبع IfStmt الأم هو يلي بيسكّر الكل.
        StringBuilder sb = new StringBuilder();
        sb.append("{% else %}");
        for (Node n : body) {
            sb.append(n);
        }
        return sb.toString();
    }
}