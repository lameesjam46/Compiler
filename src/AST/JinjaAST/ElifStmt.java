package AST.JinjaAST;
import java.util.List;

public class ElifStmt extends Stmt {
    private final Expression condition;
    private final List<Node> body;

    public ElifStmt(int line, Expression condition, List<Node> body) {
        super(line);
        this.condition = condition;
        this.body = body;
    }

    public Expression getCondition() { return condition; }
    public List<Node> getBody() { return body; }

    @Override
    public String toString() {
        // تعديل: أضفنا أقواس {% elif %} — القاعدة النحوية بتشارك
        // وسم {% endif %} الواحد مع IfStmt الأم، فما محتاجينه هون.
        StringBuilder sb = new StringBuilder();
        sb.append("{% elif ").append(condition).append(" %}");
        for (Node n : body) {
            sb.append(n);
        }
        return sb.toString();
    }
}