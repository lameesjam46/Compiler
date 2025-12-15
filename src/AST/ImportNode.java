package AST;

public class ImportNode extends ASTNode {
    private String module;
    private String name; // optional (from X import Y)

    public ImportNode(String module, String name, Integer lineno) {
        super("Import", lineno);
        this.module = module;
        this.name = name;
    }

    public String getModule() { return module; }
    public String getName() { return name; }
}

