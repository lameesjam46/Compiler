
import AST.*;
import AST.RuleNode;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {


        String input = """
            import;

            div, .box {
                color: red;
                width: 100px;
            }
        """;


        CharStream charStream = CharStreams.fromString(input);
        LexerCss lexer = new LexerCss(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ParserCss parser = new ParserCss(tokens);
        ParseTree tree = parser.style();


        System.out.println("=== PARSE TREE ===");
        System.out.println(tree.toStringTree(parser));


        StyleNode styleNode = new StyleNode();

        ImportNode importNode = new ImportNode();
        styleNode.statements.add(importNode);

        RuleNode ruleNode = new RuleNode();

        SelectorGroupNode selectorGroup = new SelectorGroupNode();

        SelectorNode selector1 = new SelectorNode();
        SimpleSelectorNode simple1 = new SimpleSelectorNode();
        ElementNameNode element1 = new ElementNameNode();
        element1.name = "div";
        simple1.elementName = element1;
        selector1.simpleSelector = simple1;

        SelectorNode selector2 = new SelectorNode();
        SimpleSelectorNode simple2 = new SimpleSelectorNode();
        ModifierNode mod = new ModifierNode();
        mod.type = ModifierType.CLASS;
        mod.value = "box";
        simple2.modifiers.add(mod);
        selector2.simpleSelector = simple2;

        selectorGroup.selectors.add(selector1);
        selectorGroup.selectors.add(selector2);

        ruleNode.selectorGroup = selectorGroup;

        ColorNode colorNode = new ColorNode();
        colorNode.color = "red";

        Size1Node widthNode = new Size1Node();
        widthNode.name = "width";
        widthNode.value = "100px";

        ruleNode.properties.add(colorNode);
        ruleNode.properties.add(widthNode);

        styleNode.statements.add(ruleNode);

        System.out.println("\n=== AST ===");
        styleNode.print("");
    }
}

