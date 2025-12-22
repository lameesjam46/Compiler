package JinjaAST;

public class ForStmt extends Stmt {
    private final String var;
    private final Expression iterable;

    public ForStmt(int line, String var, Expression iterable) {
        super(line);
        this.var = var;
        this.iterable = iterable;
    }
    public String getVar() { return var; }
    public Expression getIterable() { return iterable; }



    @Override
    public String toString() {
        return "for " + var + " in " + iterable;
    }
}
