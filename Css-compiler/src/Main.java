import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Main {
    public static void main(String[] args) throws Exception {
// هاد ملف التيست
        String css ="Input/test.txt";

        CharStream sc = CharStreams.fromFileName(css);
        LexerCss lexer = new LexerCss(sc);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ParserCss parser = new ParserCss(tokens);

        ParserCss.StyleContext tree = parser.style();

        BuilderVisitor visitor = new BuilderVisitor();
        StyleNode ast = (StyleNode) visitor.visit(tree);

        System.out.println("\n========= AST =========");
        ast.print("");
    }
}
