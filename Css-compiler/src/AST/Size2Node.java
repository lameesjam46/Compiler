package AST;

import java.util.ArrayList;
import java.util.List;

public class Size2Node extends PropertyNode {
    public Size2Node(List<String> values) {
        this.values = values;
    }

 public List<String> values = new ArrayList<>();

    @Override
    void print(String indent) {
        System.out.println(indent + "Size2Node: " + name + " = " + values);
    }
}
