package JinjaAST;

public class HtmlDoctype extends Node {
    private final String value;

    public HtmlDoctype(int line, String value) {
        super(line);
        this.value = value;
    }
    public String getValue() { return value; }
    @Override
    public String toString() {
        return value;
    }
}
