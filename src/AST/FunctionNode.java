package AST;
import java.util.ArrayList;
import java.util.List;

public class FunctionNode extends ASTNode {
    private String name;
    private List<String> bodyLines = new ArrayList<>();

    public FunctionNode(String name, int line) {
        super("Function", line);
        this.name = name;
    }

    public String getName() { return name; }
    public List<String> getBodyLines() { return bodyLines; }

    public void addBodyLine(String line) {
        this.bodyLines.add(line);
    }
}