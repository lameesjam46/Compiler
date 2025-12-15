package AST;

public class RouteNode extends ASTNode {
    public String path;
    public String handlerName;

    public RouteNode(String path, String handlerName, Integer lineno) {
        super("Route", lineno);
        this.path = path;
        this.handlerName = handlerName;
    }

    public String getPath() { return path; }
    public String getHandlerName() { return handlerName; }
}

