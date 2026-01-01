package CSS_AST;

 public class ImportNode extends StatementNode {
     String fileName;

     public ImportNode(String fileName, int line) {
        super("ImportNode", line);
        this.fileName = fileName;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + name + ": " + fileName + " (line " + line + ")");
    }
}