import java.util.ArrayList;
import java.util.List;

public class SelectorGroupNode extends ASTNode {
    public List<SelectorNode> selectors = new ArrayList<>();

    public SelectorGroupNode(int line) {
        super("SelectorGroupNode", line);
    }

    @Override
    public  void print(String indent) {
        System.out.println(indent + name + " (line " + line + ")");
        for (SelectorNode sel : selectors) sel.print(indent + "  ");
    }
}


