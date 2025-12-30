package AST;

 public class FontWeightNode extends PropertyNode {
    public FontWeightNode(String value) {
        this.value = value;
    }

    String value;

    @Override
    void print(String indent) {
        System.out.println(indent + "FontWeightNode: " + value);
    }
}
