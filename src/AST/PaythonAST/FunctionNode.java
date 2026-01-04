package AST.PaythonAST;
import java.util.ArrayList;
import java.util.List;

public class FunctionNode extends ASTNode {
    private String name;
    private List<String> bodyLines = new ArrayList<>();

    public FunctionNode(String name, int line) {
        super(name, line);
        this.name = name;
    }



    public String getName() { return name; }

    @Override
    public String getNodeName() {
        return "Function: "+name ;
    }
}