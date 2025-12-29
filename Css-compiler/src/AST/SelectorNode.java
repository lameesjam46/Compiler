package AST;

public class SelectorNode extends ASTNode {
  public SimpleSelectorNode simpleSelector;

    @Override
    void print(String indent) {
        System.out.println(indent + "SelectorNode");
        simpleSelector.print(indent + "  ");
    }
}

