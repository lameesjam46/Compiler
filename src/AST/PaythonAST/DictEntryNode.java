package AST.PaythonAST;

public class DictEntryNode extends ASTNode {
    private String key;

    public DictEntryNode(String key, ASTNode value, int line) {
        super("Field: " + key, line);
        this.key = key;
        this.addChild(value);   // child 0 = القيمة
    }

    public String getKey() { return key; }
    public ASTNode getValue() { return getChildren().get(0); }
}