package AST.CSS_AST;

import java.util.List;

 public class Size2Node extends PropertyNode {
    public List<String> values;

    public Size2Node(String name, List<String> values, int line) {
        super(name, line);
        this.values = values;
    }

    @Override
    public  void print(String indent) {
        System.out.println(indent + name + " = " + values + " (line " + line + ")");
    }
}
