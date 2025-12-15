package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionNode extends ASTNode {
    private String name;
    private List<String> bodyLines = new ArrayList<>();

    public FunctionNode(String name, Integer lineno) {
        super("Function", lineno);
        this.name = name;
    }
    public String getName() { return name; }
    public void addBodyLine(String line) { bodyLines.add(line); }
    public List<String> getBodyLines() { return bodyLines; }
}
