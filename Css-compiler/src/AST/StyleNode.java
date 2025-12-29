package AST;

import java.util.ArrayList;
import java.util.List;

public class StyleNode extends ASTNode {
 public List<StatementNode> statements = new ArrayList<>();

    @Override
    public void print(String indent) {
        System.out.println(indent + "StyleNode");
        for (StatementNode stmt : statements) {
            stmt.print(indent + "  ");
        }
    }
}
