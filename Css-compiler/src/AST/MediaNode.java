package AST;

import java.util.ArrayList;
import java.util.List;

public class MediaNode extends StatementNode {
    List<RuleNode> rules = new ArrayList<>();

    @Override
    void print(String indent) {
        System.out.println(indent + "MediaNode");
        for (RuleNode rule : rules) {
            rule.print(indent + "  ");
        }
    }
}
