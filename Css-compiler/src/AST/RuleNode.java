package AST;

import java.util.ArrayList;
import java.util.List;

public class RuleNode extends StatementNode {
   public SelectorGroupNode selectorGroup;
   public List<PropertyNode> properties = new ArrayList<>();

    public RuleNode(List<PropertyNode> properties,SelectorGroupNode selectorGroup) {
        this.properties = properties;
        this.selectorGroup=selectorGroup;
    }

    public RuleNode() {
    }

    @Override
    void print(String indent) {
        System.out.println(indent + "RuleNode");
        selectorGroup.print(indent + "  ");
        for (PropertyNode prop : properties) {
            prop.print(indent + "  ");
        }
    }
}
