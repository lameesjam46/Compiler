package CSS_AST;

import java.util.ArrayList;
import java.util.List;


 public class StyleNode extends ASTNode {
    public List<StatementNode> statements = new ArrayList<>();

    public StyleNode(int line) {
        super("StyleNode", line);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + name + " (line " + line + ")");
        for (StatementNode stmt : statements) {
            stmt.print(indent + "  ");
        }
    }
}
