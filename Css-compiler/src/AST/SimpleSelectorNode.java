package AST;

import java.util.ArrayList;
import java.util.List;

public class SimpleSelectorNode extends ASTNode {
  public  ElementNameNode elementName;
  public  List<ModifierNode> modifiers = new ArrayList<>();

    @Override
    void print(String indent) {
        System.out.println(indent + "SimpleSelectorNode");
        if (elementName != null) elementName.print(indent + "  ");
        for (ModifierNode mod : modifiers) mod.print(indent + "  ");
    }
}
