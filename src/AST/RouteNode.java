package AST;

public class RouteNode extends ASTNode {
    private String path;
    // اجعلها public لتتوافق مع كود المين الخاص بك ((RouteNode)n).handlerName
    public String handlerName = "None";

    public RouteNode(String path, int line) {
        super("Route", line);
        this.path = path;
    }

    public String getPath() { return path; }
    public String getHandlerName() { return handlerName; }
}