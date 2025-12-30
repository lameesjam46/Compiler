package AST;

public class OpacityNode extends PropertyNode {
    String value;

    @Override
    void print(String indent) {
        System.out.println(indent + "OpacityNode: " + value);
    }
}
