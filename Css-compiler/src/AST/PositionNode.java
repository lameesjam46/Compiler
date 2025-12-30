package AST;

public class PositionNode extends PropertyNode {
    String value;

    @Override
    void print(String indent) {
        System.out.println(indent + "PositionNode: " + value);
    }
}
