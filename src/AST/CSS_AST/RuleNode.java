package AST.CSS_AST;

import java.util.List;

 public class RuleNode extends StatementNode {
    public SelectorGroupNode selectorGroup;
    public List<PropertyNode> properties;

    public RuleNode(SelectorGroupNode selectorGroup, List<PropertyNode> properties, int line) {
        super("RuleNode", line);
        this.selectorGroup = selectorGroup;
        this.properties = properties;
    }

    @Override
    public   void print(String indent) {
        System.out.println(indent + name + " (line " + line + ")");
        selectorGroup.print(indent + "  ");
        for (PropertyNode prop : properties) {
            prop.print(indent + "  ");
        }
    }
}
