package JinjaAST;

public class FilterCall extends PostfixPart {
    private final String filter;

    public FilterCall(int line, String filter) {
        super(line);
        this.filter = filter;
    }

    @Override
    public String toString() {
        return "|" + filter;
    }
}
