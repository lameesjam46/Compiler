package AST;

public class AttributeNode extends ASTNode {
    public AttributeNode(ASTNode target, String attr, int line) {
        super("Attribute: ." + attr, line);
        this.addChild(target);
    }
}