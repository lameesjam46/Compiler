package AST.JinjaAST;

public class FilterCall extends PostfixPart {
    private final String filter;

    public FilterCall(int line, String filter) {
        super(line);
        this.filter = filter;
    }

    // إضافة: getter ضروري لتطبيق الفلتر فعليًا وقت التنفيذ الحقيقي
    public String getFilter() {
        return filter;
    }

    @Override
    public String toString() {
        return "|" + filter;
    }
}