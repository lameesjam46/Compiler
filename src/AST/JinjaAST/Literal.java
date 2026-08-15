package AST.JinjaAST;

public class Literal extends Expression {
    private final Object value;

    public Literal(int line, Object value) {
        super(line);
        this.value = value;
    }

    // إضافة: getter للقيمة الخام (Integer/Double/Boolean/String بدون
    // تنصيص) — ضروري لأنه toString() بترجع نص منسّق للعرض فقط،
    // مش القيمة الحقيقية اللي محتاجينها وقت التنفيذ الفعلي.
    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        if (value instanceof String s) {
            if (s.startsWith("\"") && s.endsWith("\"") && s.length() >= 2) {
                return s;
            }
            return "\"" + s + "\"";
        }
        return String.valueOf(value);
    }
}