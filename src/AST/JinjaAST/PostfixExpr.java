package AST.JinjaAST;

import java.util.*;

public class PostfixExpr extends Expression {
    private final Expression base;
    private final List<PostfixPart> parts = new ArrayList<>();

    public PostfixExpr(int line, Expression base) {
        super(line);
        this.base = base;
    }

    public void addPart(PostfixPart part) {
        parts.add(part);
    }

    @Override
    public String toString() {
        String result = base.toString();
        for (PostfixPart p : parts) result += p;
        return result;
    }

    public Expression getBase() { return base; }
    public List<PostfixPart> getParts() { return parts; }

}
