package AST.JinjaAST;

public class ContinueStmt extends Stmt {
    public ContinueStmt(int line) {
        super(line);
    }

    @Override
    public String toString() {
        // تعديل: نفس تعديل BreakStmt — إضافة أقواس {% %}.
        return "{% continue %}";
    }
}