package AST;

public class ImportNode extends ASTNode {
    private String module;
    private String name; // للأجزاء الفرعية مثل import X as name

    public ImportNode(String module, String name, int line) {
        super("Import", line);
        this.module = module;
        this.name = name;
    }

    public String getModule() { return module; }
    public String getName() { return name; }
}