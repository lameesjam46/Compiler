package AST.PaythonAST;

public class ParamNode extends ASTNode {
    private String name;

    public ParamNode(String name, int line) {
        super("Param: " + name, line);   // صار الاسم داخل nodeName فعليًا
        this.name = name;
    }

    public String getName() {
        return name;
    }
}