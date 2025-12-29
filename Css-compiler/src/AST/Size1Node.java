package AST;

public class Size1Node extends PropertyNode {


    public  String value;
    public  String name;

    public Size1Node() {
        this.name = name;
        this.value = value;
    }

    @Override
    void print(String indent) {
        System.out.println(indent + "Size1Node: " + name + " = " + value);
    }
}
