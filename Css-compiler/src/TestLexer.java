
import CSS_Antlr.LexerCss;
import org.antlr.v4.runtime.*;


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
