package AST.JinjaAST;
import java.util.List;

public class ForStmt extends Stmt {
    private final String var;
    private final Expression iterable;
    private final List<Node> body;

    public ForStmt(int line, String var, Expression iterable, List<Node> body) {
        super(line);
        this.var = var;
        this.iterable = iterable;
        this.body = body;
    }

    public String getVar() { return var; }
    public List<Node> getBody() { return body; }
    public Expression getIterable() { return iterable; }

    @Override
    public String toString() {
        // ============================================================
        // تعديل: كانت هاي الدالة بترجع بس "for var in iterable"،
        // متجاهلة body بالكامل، وبدون {% %}/{% endfor %}. صرنا نبني
        // النص الكامل: {% for %} + محتوى الحلقة + {% endfor %}.
        // ============================================================
        StringBuilder sb = new StringBuilder();

        sb.append("{% for ").append(var).append(" in ").append(iterable).append(" %}");
        for (Node n : body) {
            sb.append(n);
        }
        sb.append("{% endfor %}");

        return sb.toString();
    }
}