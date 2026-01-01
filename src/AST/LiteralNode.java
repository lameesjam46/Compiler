package AST;

public class LiteralNode extends ASTNode {
    public LiteralNode(String type, String value, int line) {
        super(type + ": " + value, line);
    }
}