package JinjaAST;

public class TextNode extends ASTNode{
    private String text;

    public TextNode(String text, int line) {
        super(line);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "TextNode(" + text + ")";
    }
}
