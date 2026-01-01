package CSS_AST;

 public class SelectorNode extends ASTNode {
    public SimpleSelectorNode simpleSelector;

    public SelectorNode(SimpleSelectorNode simpleSelector, int line) {
        super("SelectorNode", line);
        this.simpleSelector = simpleSelector;
    }

    @Override
    public  void print(String indent) {
        System.out.println(indent + name + " (line " + line + ")");
        simpleSelector.print(indent + "  ");
    }
}
