package JinjaAST;

import java.util.List;

public class JinjaForNode extends ASTNode{

    private String variable;
    private JinjaExprNode iterable;
    private List<ASTNode> body;

    public JinjaForNode(String variable, JinjaExprNode iterable,
                        List<ASTNode> body, int line) {
        super(line);
        this.variable = variable;
        this.iterable = iterable;
        this.body = body;
    }

    public String getVariable() {
        return variable;
    }

    public JinjaExprNode getIterable() {
        return iterable;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "JinjaFor(" + variable + ")";
    }
}
