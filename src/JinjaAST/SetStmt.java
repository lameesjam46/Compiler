package JinjaAST;

public class SetStmt extends Stmt {
    private final String var;
    private final Expression value;
    public String getVar() { return var; }
    public Expression getValue() { return value; }


    public SetStmt(int line, int column, String var, Expression value) {
        super(line);
        this.var = var;
        this.value = value;
    }

    @Override
    public String toString() {
        return var + " = " + value;
    }
}
