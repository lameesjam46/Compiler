package AST.JinjaAST;

public class HtmlAttribute extends ASTNode {
    private final String name;
    private final String value;

    public HtmlAttribute(int line, String name, String value) {
        super(line);
        this.name = name;
        this.value = value;
    }
    public String getName() { return name; }
    public String getValue() { return value; }


    @Override
    public String toString() {
        return name + "=" + value;
    }
}
