import AST.*;

 class ASTTest {
    public static void main(String[] args) {

        StyleNode style = new StyleNode();
        style.line = 1;

        ImportNode importNode = new ImportNode();
        importNode.line = 1;
        style.statements.add(importNode);

        RuleNode rule = new RuleNode();
        rule.line = 3;

        SelectorGroupNode group = new SelectorGroupNode();
        group.line = 3;

        SelectorNode s1 = new SelectorNode();
        SimpleSelectorNode ss1 = new SimpleSelectorNode();
        ElementNameNode e1 = new ElementNameNode();
        e1.name = "div";
        e1.line = 3;

        ss1.elementName = e1;
        ss1.line = 3;
        s1.simpleSelector = ss1;
        s1.line = 3;

        SelectorNode s2 = new SelectorNode();
        SimpleSelectorNode ss2 = new SimpleSelectorNode();
        ss2.line = 3;

        ModifierNode mod = new ModifierNode();
        mod.type = ModifierType.CLASS;
        mod.value = "box";
        mod.line = 3;

        ss2.modifiers.add(mod);
        s2.simpleSelector = ss2;
        s2.line = 3;

        group.selectors.add(s1);
        group.selectors.add(s2);
        rule.selectorGroup = group;

        ColorNode color = new ColorNode();
        color.color = "red";
        color.line = 4;

        Size1Node width = new Size1Node();
        width.name = "width";
        width.value = "100px";
        width.line = 5;

        rule.properties.add(color);
        rule.properties.add(width);

        style.statements.add(rule);

        System.out.println("===== AST TEST =====");
        style.print("");
    }
}
