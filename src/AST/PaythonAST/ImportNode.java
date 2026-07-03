package AST.PaythonAST;

import java.util.ArrayList;
import java.util.List;

public class ImportNode extends ASTNode {
    private String module;
    private List<String> names = new ArrayList<>();

    public ImportNode(String module, List<String> names, int line) {
        super("Import: from " + module, line);
        this.module = module;
        this.names = names;
    }

    public String getModule() { return module; }
    public List<String> getNames() { return names; }
}