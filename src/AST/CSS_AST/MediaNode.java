package AST.CSS_AST;

import java.util.ArrayList;
import java.util.List;

 public class MediaNode extends StatementNode {
    public List<RuleNode> rules = new ArrayList<>();

    public MediaNode(int line) {
        super("MediaNode", line);
    }

    @Override
public void print(String indent) {
        System.out.println(indent + name + " (line " + line + ")");
        for (RuleNode rule : rules) {
            rule.print(indent + "  ");
        }
    }
}