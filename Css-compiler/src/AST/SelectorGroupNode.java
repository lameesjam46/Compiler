package AST;

import java.util.ArrayList;
import java.util.List;

public class SelectorGroupNode extends ASTNode {
   public List<SelectorNode> selectors = new ArrayList<>();

    @Override
    void print(String indent) {
        System.out.println(indent + "SelectorGroupNode");
        for (SelectorNode sel : selectors) {
            sel.print(indent + "  ");
        }
    }
}

