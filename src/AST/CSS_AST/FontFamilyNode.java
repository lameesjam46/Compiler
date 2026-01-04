package AST.CSS_AST;

 public class FontFamilyNode extends PropertyNode {
    public String family;

    public FontFamilyNode(String family, int line) {
        super("FontFamilyNode", line);
        this.family = family;
    }

    @Override
 public  void print(String indent) {
        System.out.println(indent + name + ": " + family + " (line " + line + ")");
    }
}
