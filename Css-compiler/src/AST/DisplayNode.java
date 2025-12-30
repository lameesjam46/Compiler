package AST;

public class DisplayNode extends PropertyNode {
    String value;

    @Override
    void print(String indent) {
        System.out.println(indent + "DisplayNode: " + value);
    }
}
