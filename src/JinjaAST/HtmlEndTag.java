package JinjaAST;

public class HtmlEndTag extends Node {
    private final String tagName;

    public HtmlEndTag(int line, String tagName) {
        super(line);
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    @Override
    public String toString() {
        return "</" + tagName + ">";
    }
}
