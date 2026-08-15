package AST.JinjaAST;
import java.util.List;

public class IfStmt extends Stmt {
    private final Expression condition;
    private final List<Node> thenBranch;
    private final List<ElifStmt> elifBlocks;
    private final ElseStmt elseBlock;

    public IfStmt(int line, Expression condition, List<Node> thenBranch, List<ElifStmt> elifBlocks, ElseStmt elseBlock) {
        super(line);
        this.condition = condition;
        this.thenBranch = thenBranch;
        this.elifBlocks = elifBlocks;
        this.elseBlock = elseBlock;
    }

    public Expression getCondition() { return condition; }
    public List<Node> getThenBranch() { return thenBranch; }
    public List<ElifStmt> getElifBlocks() { return elifBlocks; }
    public ElseStmt getElseBlock() { return elseBlock; }

    @Override
    public String toString() {
        // ============================================================
        // تعديل: كانت هاي الدالة بترجع بس "if " + condition، متجاهلة
        // thenBranch وelifBlocks وelseBlock بالكامل، وبدون أقواس
        // {% %}. صرنا نبني النص الكامل: {% if %} + المحتوى + كل
        // elif + else؟ + {% endif %} — بالضبط بنية القاعدة النحوية.
        // ============================================================
        StringBuilder sb = new StringBuilder();

        sb.append("{% if ").append(condition).append(" %}");
        for (Node n : thenBranch) {
            sb.append(n);
        }

        for (ElifStmt elif : elifBlocks) {
            sb.append(elif);
        }

        if (elseBlock != null) {
            sb.append(elseBlock);
        }

        sb.append("{% endif %}");

        return sb.toString();
    }
}