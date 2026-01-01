package AST;

public class SubscriptNode extends ASTNode {

    public SubscriptNode(String text, int line) {
        super("Subscript: " + text, line);
    }
}












//package AST;
//
//public class SubscriptNode extends ASTNode {
//    public SubscriptNode(ASTNode target, ASTNode index, int line) {
//        super("Subscript: []", line);
//        this.addChild(target);
//        this.addChild(index);
//    }
//}