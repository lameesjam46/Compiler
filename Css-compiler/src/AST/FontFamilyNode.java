package AST;

public class FontFamilyNode extends PropertyNode {
    String family;

    @Override
    void print(String indent) {
        System.out.println(indent + "FontFamilyNode: " + family);
    }
}
