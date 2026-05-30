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
    public Expression getIterable() { return iterable; } // تمت الإضافة

    @Override
    public String toString() {
        return "for " + var + " in " + iterable;
    }
}