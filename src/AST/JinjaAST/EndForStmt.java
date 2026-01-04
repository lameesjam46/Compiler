package AST.JinjaAST;

public class EndForStmt extends Stmt {

    public EndForStmt(int line) {
        super(line);
    }

    @Override
    public String toString() {
        return "endfor";
    }
}
