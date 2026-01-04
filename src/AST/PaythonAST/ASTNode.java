package AST.PaythonAST;

import java.util.ArrayList;
import java.util.List;

public abstract class ASTNode {
    protected String nodeName;
    protected Integer lineno;
    protected List<ASTNode> children = new ArrayList<>();

    public ASTNode(String nodeName, Integer lineno) {
        this.nodeName = nodeName;
        this.lineno = lineno;
    }
    public String getNodeName() { return nodeName; }
    public Integer getLineno() { return lineno; }
    public List<ASTNode> getChildren() { return children; }
    public void addChild(ASTNode c) { if (c != null) children.add(c); }
}

