package AST.JinjaAST;

public class PropertyAccess extends PostfixPart {
    private final String property;

    public PropertyAccess(int line, String property) {
        super(line);
        this.property = property;
    }

    // إضافة: getter ضروري للمرحلة الثانية (JinjaEvaluator) عشان
    // يقدر يوصل لاسم الخاصية نفسه، مش بس النص المنسّق (".name").
    public String getProperty() {
        return property;
    }

    @Override
    public String toString() {
        return "." + property;
    }
}