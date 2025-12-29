package AST;

public class BorderNode extends PropertyNode {
    String width;
    String style;
    String color; // optional

    @Override
    void print(String indent) {
        System.out.println(indent + "BorderNode: width=" + width + " style=" + style + " color=" + color);
    }
}
