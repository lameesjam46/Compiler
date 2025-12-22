package JinjaAST;

public class HtmlComment extends Node {
    private final String comment;

    public HtmlComment(int line, String comment) {
        super(line);
        this.comment = comment;
    }
    public String getComment() { return comment; }
    @Override
    public String toString() {
        return "<!--" + comment + "-->";
    }
}
