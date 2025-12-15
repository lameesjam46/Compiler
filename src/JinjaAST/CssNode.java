package JinjaAST;

public class CssNode extends ASTNode{
    private String cssText;

    public CssNode(String cssText, int line) {
        super(line);
        this.cssText = cssText;
    }

    public String getCssText() {
        return cssText;
    }

    @Override
    public String toString() {
        return "CssNode";
    }
}
