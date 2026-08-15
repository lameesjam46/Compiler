package Grammer.CSSAntlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

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

