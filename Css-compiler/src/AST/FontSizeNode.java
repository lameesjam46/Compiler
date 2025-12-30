package AST;

public class FontSizeNode extends PropertyNode {
    String size;

    @Override
    void print(String indent) {
        System.out.println(indent + "FontSizeNode: " + size);
    }
}
