package Grammer.CSSAntlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;


public class TestLexer {



    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("Input/test.txt");
        LexerCss lexer = new LexerCss(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        for (Token t : tokens.getTokens()) {
            System.out.println(t);
        }
    }
}
