package AST;

public class ElementNameNode extends ASTNode {
   public String name;

    @Override
    void print(String indent) {
        System.out.println(indent + "ElementNameNode: " + name);
    }
}
