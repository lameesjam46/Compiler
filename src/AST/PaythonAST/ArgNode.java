package AST.PaythonAST;

public class ArgNode extends ASTNode {
    public ArgNode(String name, int line) {
        super(name == null ? "Argument" : "Argument: " + name, line);
    }
}