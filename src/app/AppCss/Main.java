package app.AppCss;

import AST.CSS_AST.StyleNode;
import Grammer.CSSAntlr.LexerCss;
import Grammer.CSSAntlr.ParserCss;
import SymbolTable.CSS_Symbol_Table.SymbolTable;
import Visitor.CSS_VISITOR.BuilderVisitor;
import Visitor.CSS_VISITOR.SymbolTableVisitor;
import org.antlr.v4.runtime.*;


public class Main {
    public static void main(String[] args) throws Exception {
//  هاد ملف التيست تبعي
        String css ="Input/static/css/style.css";


        CharStream sc = CharStreams.fromFileName(css);
        LexerCss lexer = new LexerCss(sc);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ParserCss parser = new ParserCss(tokens);

        ParserCss.StyleContext tree = parser.style();

        BuilderVisitor visitor = new BuilderVisitor();
        StyleNode ast = (StyleNode) visitor.visit(tree);

        System.out.println("\n========= AST =========");
        ast.print("");


        SymbolTable symbolTable = new SymbolTable();
        SymbolTableVisitor symVisitor = new SymbolTableVisitor(symbolTable);
        symVisitor.visit(tree);

        symbolTable.print();

    }
}
