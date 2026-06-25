package AST.JinjaAST;

public class Identifier extends Expression {
    private final String name;

    public Identifier(int line, String name) {
        super(line);
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return name;
    }
}
