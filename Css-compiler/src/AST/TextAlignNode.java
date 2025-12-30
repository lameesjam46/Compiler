package AST;

public class TextAlignNode extends PropertyNode {
 public String align;

    @Override
    void print(String indent) {
        System.out.println(indent + "TextAlignNode: " + align);
    }
}

