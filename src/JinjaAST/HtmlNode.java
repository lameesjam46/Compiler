package JinjaAST;

import java.util.List;

public class HtmlNode extends ASTNode{
    private String tagName;
    private List<ASTNode> children;

    public HtmlNode(String tagName, List<ASTNode> children, int line) {
        super(line);
        this.tagName = tagName;
        this.children = children;
    }

    public String getTagName() {
        return tagName;
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "HtmlNode(<" + tagName + ">)";
    }

}
