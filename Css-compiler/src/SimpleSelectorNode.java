import java.util.ArrayList;
import java.util.List;

public class SimpleSelectorNode extends ASTNode {
    public ElementNameNode elementName;
    public List<ModifierNode> modifiers = new ArrayList<>();

    public SimpleSelectorNode(int line) {
        super("SimpleSelectorNode", line);
    }

    @Override
    public  void print(String indent) {
        System.out.println(indent + name + " (line " + line + ")");
        if (elementName != null) elementName.print(indent + "  ");
        for (ModifierNode mod : modifiers) mod.print(indent + "  ");
    }
}
