package JinjaAST;

public class HtmlText extends Node {
    private final String text;

    public HtmlText(int line, String text) {
        super(line);
        this.text = text;
    }
    public String getText() { return text; }
    @Override
    public String toString() {
        return text;
    }
}
