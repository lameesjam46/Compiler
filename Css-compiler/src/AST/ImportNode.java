package AST;


public class ImportNode extends StatementNode {
    public ImportNode(String fileName) {
        this.fileName = fileName;
    }

  public String fileName;

    public ImportNode() {}


    @Override
        void print(String indent) {
            System.out.println(indent + "ImportNode: " + fileName);
        }

}
