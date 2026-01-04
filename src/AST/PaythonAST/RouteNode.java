package AST.PaythonAST;

public class RouteNode extends ASTNode {
    private String path;
    public String handlerName = "None";

    public RouteNode(String path, int line) {
        super("Route", line);
        this.path = path;
    }

    public String getPath() { return path; }
    public String getHandlerName() { return handlerName; }
}