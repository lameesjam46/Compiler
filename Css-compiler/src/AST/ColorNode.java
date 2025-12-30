package AST;

 public class ColorNode extends PropertyNode {
   public String color;

    public ColorNode(String color) {
        this.color = color;
    }

     public ColorNode() {
     }

     @Override
    void print(String indent) {
        System.out.println(indent + "ColorNode: " + color);
    }
}
