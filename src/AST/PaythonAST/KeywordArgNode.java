package AST.PaythonAST;

public class KeywordArgNode extends ASTNode {
    private String name;

    public KeywordArgNode(String name, ASTNode value, int line) {
        super("KeywordArg: " + name, line);
        this.name = name;
        this.addChild(value);   // child 0 = القيمة
    }

    public String getName() { return name; }
    public ASTNode getValue() { return getChildren().get(0); }
}