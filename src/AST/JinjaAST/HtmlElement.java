package AST.JinjaAST;

import java.util.*;

public class HtmlElement extends Node {
    private final String tagName;
    private final List<HtmlAttribute> attributes = new ArrayList<>();
    private final List<Node> children = new ArrayList<>();

    public HtmlElement(int line, String tagName) {
        super(line);
        this.tagName = tagName;
    }
    public String getTagName() {
        return tagName;
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
                " " + attributes.stream().map(Object::toString).reduce("", (a, b) -> a + " " + b).trim();
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tagName).append(attrs).append(">");

        for (Node child : children) {
            sb.append(child.toString());
        }


        HtmlEndTag endTag = new HtmlEndTag(getLine(), tagName);
        sb.append(endTag.toString());

        return sb.toString();
    }

}
