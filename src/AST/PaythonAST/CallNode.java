package AST.PaythonAST;

import java.util.List;

public class CallNode extends ASTNode {

    public CallNode(ASTNode function, List<ASTNode> arguments, int line) {
        super("Call", line);
        this.addChild(function);           // child رقم 0 = الدالة المستدعاة
        if (arguments != null) {
            for (ASTNode arg : arguments) {
                this.addChild(arg);        // بقية الأطفال = الآرغيومنتس
            }
        }
    }

    public ASTNode getFunction() {
        return getChildren().get(0);
    }

    public List<ASTNode> getArguments() {
        return getChildren().subList(1, getChildren().size());
    }
}