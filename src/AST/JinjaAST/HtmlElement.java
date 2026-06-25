package AST.JinjaAST;

import java.util.*;
import java.util.stream.Collectors;

public class HtmlElement extends Node {
    private final String tagName;
    private final boolean isSelfClosing; // إضافة هذه الخاصية
    private final List<HtmlAttribute> attributes = new ArrayList<>();
    private final List<Node> children = new ArrayList<>();

    // الباني (Constructor) المعدل ليأخذ حالة الإغلاق
    public HtmlElement(int line, String tagName, boolean isSelfClosing) {
        super(line);
        this.tagName = tagName;
        this.isSelfClosing = isSelfClosing;
    }

    public String getTagName() {
        return tagName;
    }

    public boolean isSelfClosing() {
        return isSelfClosing;
    }

    public List<HtmlAttribute> getAttributes() {
        return attributes;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void addAttribute(HtmlAttribute attr) {
        attributes.add(attr);
    }

    public void addChild(Node child) {
        children.add(child);
    }

    @Override
    public String toString() {
        String attrs = attributes.isEmpty() ? "" :
                " " + attributes.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(" "));

        StringBuilder sb = new StringBuilder();

        // بناء الجزء الافتتاحي
        sb.append("<").append(tagName).append(attrs);

        if (isSelfClosing) {
            // إذا كان التاج ذاتي الإغلاق، نكتفي بـ /> ولا نطبع الأبناء
            sb.append(" />");
        } else {
            // إذا كان عادياً، نغلق الوسم ونطبع الأبناء ثم وسم الإغلاق
            sb.append(">");
            for (Node child : children) {
                sb.append(child.toString());
            }
            HtmlEndTag endTag = new HtmlEndTag(getLine(), tagName);
            sb.append(endTag.toString());
        }

        return sb.toString();
    }
}