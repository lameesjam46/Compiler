package JinjaAST;

import java.util.List;

public class JinjaIfNode extends ASTNode{
    private JinjaExprNode condition;
    private List<ASTNode> body;

    public JinjaIfNode(JinjaExprNode condition, List<ASTNode> body, int line) {
        super(line);
        this.condition = condition;
        this.body = body;
    }

    public JinjaExprNode getCondition() {
        return condition;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "JinjaIf";
    }
}
