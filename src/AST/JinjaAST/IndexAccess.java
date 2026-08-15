package AST.JinjaAST;

public class IndexAccess extends PostfixPart {
    private final Expression start;
    private final Expression end;

    public IndexAccess(int line, Expression index) {
        super(line);
        this.start = index;
        this.end = null;
    }

    public IndexAccess(int line, Expression start, Expression end) {
        super(line);
        this.start = start;
        this.end = end;
    }

    // إضافة: getters ضروريين لتقييم الفهرسة (indexing/slicing) فعليًا
    public Expression getStart() { return start; }
    public Expression getEnd() { return end; }
    public boolean isSlice() { return end != null; }

    @Override
    public String toString() {
        if (end != null) {
            return "[" + (start != null ? start : "") + ":" + end + "]";
        }
        return "[" + start + "]";
    }
}