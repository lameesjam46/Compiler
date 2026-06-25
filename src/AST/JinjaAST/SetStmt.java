package AST.JinjaAST;

public class SetStmt extends Stmt {
    private final String var;
    private final Expression value;
 // إضافة حقل خاص بالعمود هنا فقط

    public SetStmt(int line, String var, Expression value) {
        super(line); // نمرر السطر للأب كالمعتاد
        this.var = var;
        this.value = value;
    }



    public String getVar() { return var; }
    public Expression getValue() { return value; }

    @Override
    public String toString() {
        return var + " = " + value;
    }
}