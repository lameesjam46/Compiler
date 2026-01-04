package AST.PaythonAST;

public class ImportNode extends ASTNode {
    private String module;
    private String name;

    public ImportNode(String module, String name, int line) {
        super("Import", line);
        this.module = module;
        this.name = name;
    }

    public String getModule() { return module; }
    public String getName() { return name; }
}