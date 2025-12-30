import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
public class TestParser
    {


    public static void main(String[] args) throws Exception {

    CharStream input = CharStreams.fromFileName("Input/test.txt");

    LexerCss lexer = new LexerCss(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);

    ParserCss parser = new ParserCss(tokens);

    ParseTree tree = parser.style();

    System.out.println(tree.toStringTree(parser));
}

}

