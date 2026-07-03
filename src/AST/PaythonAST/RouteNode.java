package AST.PaythonAST;

import java.util.List;

public class RouteNode extends ASTNode {
    private String path;
    public String handlerName = "None";

    public RouteNode(String path, List<ASTNode> extraArgs, int line) {
        super("Route: " + path, line);
        this.path = path;
        if (extraArgs != null) {
            for (ASTNode arg : extraArgs) {
                this.addChild(arg);
            }
        }
    }

    public RouteNode(String path, int line) {
        this(path, null, line);
    }

    public String getPath() { return path; }
    public String getHandlerName() { return handlerName; }
    public List<ASTNode> getExtraArgs() { return getChildren(); }
}