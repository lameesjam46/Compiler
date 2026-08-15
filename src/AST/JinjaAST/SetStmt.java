package AST.JinjaAST;

public class SetStmt extends Stmt {
    private final String var;
    private final Expression value;

    public SetStmt(int line, String var, Expression value) {
        super(line);
        this.var = var;
        this.value = value;
    }

    public String getVar() { return var; }
    public Expression getValue() { return value; }

    @Override
    public String toString() {
        // تعديل: أضفنا أقواس {% set %} — كانت الدالة القديمة
        // بترجع "var = value" بدون الأقواس، فكانت رح تنطبع بالناتج
        // كنص HTML عادي بدل ما تكون عبارة Jinja صحيحة.
        return "{% set " + var + " = " + value + " %}";
    }
}