package AST.JinjaAST;

public class BreakStmt extends Stmt {
    public BreakStmt(int line) {
        super(line);
    }

    @Override
    public String toString() {
        // تعديل: أضفنا أقواس {% %} — كانت بترجع "break" بس، وهاد مش
        // Jinja صحيح (كان رح ينطبع كنص HTML عادي بالناتج).
        return "{% break %}";
    }
}