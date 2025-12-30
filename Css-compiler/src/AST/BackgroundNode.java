package AST;

public class BackgroundNode extends PropertyNode {
    String color;

    @Override
    void print(String indent) {
        System.out.println(indent + "BackgroundNode: " + color);
    }
}
