package AST;

abstract class ASTNode {
    public int line;

   abstract void print(String indent);
}
