package JinjaAST;

public class PropertyAccess extends PostfixPart {
    private final String property;

    public PropertyAccess(int line, String property) {
        super(line);
        this.property = property;
    }

    @Override
    public String toString() {
        return "." + property;
    }
}
