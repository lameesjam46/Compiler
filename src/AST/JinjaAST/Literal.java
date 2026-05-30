package AST.JinjaAST;

public class Literal extends Expression {
    private final Object value;

    public Literal(int line, Object value) {
        super(line);
        this.value = value;
    }

    @Override
    public String toString() {
        if (value instanceof String) {
            return "\"" + value + "\""; // إضافة علامات التنصيص
        }
        return String.valueOf(value);
    }
}
