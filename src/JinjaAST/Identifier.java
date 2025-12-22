package JinjaAST;

public class Identifier extends Expression {
    private final String name;

    public Identifier(int line, String name) {
        super(line);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
