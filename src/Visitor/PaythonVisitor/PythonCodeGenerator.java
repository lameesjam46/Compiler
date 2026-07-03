package Visitor.PaythonVisitor;

import AST.PaythonAST.*;
import java.util.List;

public class PythonCodeGenerator {

    private StringBuilder generatedCode;
    private int indentLevel;

    public PythonCodeGenerator() {
        this.generatedCode = new StringBuilder();
        this.indentLevel = 0;
    }

    public String generate(ASTNode root) {
        generatedCode.setLength(0);
        indentLevel = 0;

        generatedCode.append("# ==========================================\n");
        generatedCode.append("# Generated Backend Architecture by Flask Compiler\n");
        generatedCode.append("# ==========================================\n\n");

        visit(root);
        return generatedCode.toString();
    }


    private void visit(ASTNode node) {
        if (node == null) return;

        if (node instanceof ProgramNode) { visitChildren(node); return; }
        if (node instanceof ImportNode) { visitImportNode((ImportNode) node); return; }
        if (node instanceof AssignmentNode) { visitAssignmentNode((AssignmentNode) node); return; }
        if (node instanceof RouteNode) { visitRouteNode((RouteNode) node); return; }
        if (node instanceof FunctionNode) { visitFunctionNode((FunctionNode) node); return; }
        if (node instanceof BlockNode) { visitBlockNode(node); return; }
        if (node instanceof IfNode) { visitIfNode(node); return; }
        if (node instanceof ForNode) { visitForNode((ForNode) node); return; }
        if (node instanceof ReturnNode) { visitReturnNode((ReturnNode) node); return; }
        if (node instanceof BreakNode) { indent(); generatedCode.append("break\n"); return; }
        if (node instanceof ContinueNode) { indent(); generatedCode.append("continue\n"); return; }

        String nodeName = node.getNodeName();

        if (nodeName.startsWith("DecoratedFunction")) {
            visitChildren(node);
            return;
        }

        // أي عقدة توصلنا هون هي تعبير مستخدم كجملة مستقلة
        // مثال: products.append(new_product) كسطر لحاله بدون تعيين
        indent();
        resolveExpression(node);
        generatedCode.append("\n");
    }


    private void visitImportNode(ImportNode node) {
        indent();
        String module = node.getModule();
        List<String> names = node.getNames();

        if (module != null && !module.isEmpty()) {
            generatedCode.append("from ").append(module).append(" import ");
        } else {
            generatedCode.append("import ");
        }

        for (int i = 0; i < names.size(); i++) {
            generatedCode.append(names.get(i));
            if (i < names.size() - 1) generatedCode.append(", ");
        }
        generatedCode.append("\n\n");
    }


    private void visitAssignmentNode(AssignmentNode node) {
        indent();
        resolveExpression(node.getLeft());
        generatedCode.append(" = ");
        resolveExpression(node.getRight());
        generatedCode.append("\n");
    }


    private void visitRouteNode(RouteNode node) {
        indent();
        generatedCode.append("@app.route(");

        ASTNode decCall = findChildStartWith(node, "DecCall");
        if (decCall != null) {
            ASTNode argList = findChildStartWith(decCall, "ArgList");
            if (argList != null) {
                List<ASTNode> args = argList.getChildren();
                for (int i = 0; i < args.size(); i++) {
                    resolveExpression(args.get(i));
                    if (i < args.size() - 1) {
                        generatedCode.append(", ");
                    }
                }
            }
        } else {
            generatedCode.append("\"/\"");
        }
        generatedCode.append(")\n");
    }


    private void visitFunctionNode(FunctionNode node) {
        indent();
        generatedCode.append("def ").append(node.getName()).append("(");

        boolean first = true;
        ASTNode blockNode = null;

        for (ASTNode child : node.getChildren()) {
            if (child instanceof ParamNode) {
                if (!first) generatedCode.append(", ");
                generatedCode.append(((ParamNode) child).getName());
                first = false;
            } else if (child instanceof BlockNode) {
                blockNode = child;
            }
        }
        generatedCode.append("):\n");

        if (blockNode != null) {
            visit(blockNode);
        } else {
            indentLevel++;
            indent();
            generatedCode.append("pass\n");
            indentLevel--;
        }
        generatedCode.append("\n");
    }


    private void visitBlockNode(ASTNode node) {
        if (node.getChildren().isEmpty()) {
            indentLevel++;
            indent();
            generatedCode.append("pass\n");
            indentLevel--;
            return;
        }

        indentLevel++;
        for (ASTNode child : node.getChildren()) {
            visit(child);
        }
        indentLevel--;
    }


    private void visitIfNode(ASTNode node) {
        indent();
        generatedCode.append("if ");

        List<ASTNode> children = node.getChildren();
        int blockStartIndex = 0;

        if (!children.isEmpty() && !(children.get(0) instanceof BlockNode)) {
            resolveExpression(children.get(0));
            blockStartIndex = 1;
        } else {
            generatedCode.append("True");
        }

        generatedCode.append(":\n");

        for (int i = blockStartIndex; i < children.size(); i++) {
            ASTNode child = children.get(i);
            if (child instanceof BlockNode) {
                visit(child);
            } else if (child.getNodeName().startsWith("Else")) {
                indent();
                generatedCode.append("else:\n");
                visitChildren(child); // سينتقل للـ BlockNode الخاص بالـ Else تلقائياً
            }
        }
    }


    private void visitForNode(ForNode node) {
        indent();
        generatedCode.append("for ").append(node.getVariable()).append(" in ");
        resolveExpression(node.getIterable());
        generatedCode.append(":\n");

        ASTNode block = null;
        for (ASTNode child : node.getChildren()) {
            if (child instanceof BlockNode) {
                block = child;
                break;
            }
        }

        if (block != null) {
            visit(block);
        } else {
            indentLevel++;
            indent();
            generatedCode.append("pass\n");
            indentLevel--;
        }
    }


    private void visitReturnNode(ReturnNode node) {
        indent();
        generatedCode.append("return");
        ASTNode value = node.getValue();
        if (value != null) {
            generatedCode.append(" ");
            resolveExpression(value);
        }
        generatedCode.append("\n");
    }


    private void resolveExpression(ASTNode node) {
        if (node == null) return;

        if (node instanceof CallNode) {
            CallNode call = (CallNode) node;
            resolveExpression(call.getFunction());
            generatedCode.append("(");
            List<ASTNode> args = call.getArguments();
            for (int i = 0; i < args.size(); i++) {
                resolveExpression(args.get(i));
                if (i < args.size() - 1) generatedCode.append(", ");
            }
            generatedCode.append(")");
            return;
        }

        if (node instanceof KeywordArgNode) {
            KeywordArgNode kw = (KeywordArgNode) node;
            generatedCode.append(kw.getName()).append("=");
            resolveExpression(kw.getValue());
            return;
        }

        if (node instanceof TernaryNode) {
            TernaryNode t = (TernaryNode) node;
            resolveExpression(t.getTrueValue());
            generatedCode.append(" if ");
            resolveExpression(t.getCondition());
            generatedCode.append(" else ");
            resolveExpression(t.getFalseValue());
            return;
        }

        // ---- عقد عامة (لسا مبنية بالـ Visitor كـ ASTNode anonymous) ----
        String name = node.getNodeName();

        if (name.startsWith("Var: ")) {
            generatedCode.append(name.replace("Var: ", "").trim());
            return;
        }
        if (name.startsWith("String: ")) {
            generatedCode.append(name.replace("String: ", "").trim());
            return;
        }
        if (name.startsWith("Number: ")) {
            generatedCode.append(name.replace("Number: ", "").trim());
            return;
        }
        if (name.startsWith("Boolean: ")) {
            generatedCode.append(name.replace("Boolean: ", "").trim());
            return;
        }
        if (name.startsWith("Literal: ")) {
            generatedCode.append(name.replace("Literal: ", "").trim());
            return;
        }

        if (name.startsWith("BinaryOp:")) {
            String op = name.replace("BinaryOp: ", "").trim();
            if (node.getChildren().size() == 2) {
                resolveExpression(node.getChildren().get(0));
                generatedCode.append(" ").append(op).append(" ");
                resolveExpression(node.getChildren().get(1));
            }
            return;
        }

        if (name.startsWith("Subscript")) {
            if (node.getChildren().size() == 2) {
                resolveExpression(node.getChildren().get(0));
                generatedCode.append("[");
                resolveExpression(node.getChildren().get(1));
                generatedCode.append("]");
            }
            return;
        }

        if (name.startsWith("Attribute:")) {
            String attr = name.replace("Attribute: ", "").trim();
            if (!node.getChildren().isEmpty()) {
                resolveExpression(node.getChildren().get(0));
                generatedCode.append(".").append(attr);
            }
            return;
        }

        if (name.startsWith("List Structure")) {
            generateDynamicList(node);
            return;
        }

        if (name.startsWith("Dictionary Structure")) {
            generateDynamicDict(node);
            return;
        }

        // سلسلة الـ decorator (app.route نفسها قبل النداء)
        if (name.startsWith("DecName:")) {
            generatedCode.append(name.replace("DecName: ", "").trim());
            return;
        }
        if (name.startsWith("DecAttribute:")) {
            String attr = name.replace("DecAttribute: ", "").trim();
            if (!node.getChildren().isEmpty()) {
                resolveExpression(node.getChildren().get(0));
                generatedCode.append(".").append(attr);
            }
            return;
        }

        // تشخيصي: لو وصلنا هون معناته في نوع عقدة جديد ما تمت تغطيته بعد
        generatedCode.append("/* UNHANDLED NODE: ").append(name).append(" */");
    }

    private void generateDynamicList(ASTNode listNode) {
        if (listNode.getChildren().isEmpty()) {
            generatedCode.append("[]");
            return;
        }
        generatedCode.append("[\n");
        indentLevel++;
        List<ASTNode> items = listNode.getChildren();
        for (int i = 0; i < items.size(); i++) {
            indent();
            resolveExpression(items.get(i));
            if (i < items.size() - 1) {
                generatedCode.append(",\n");
            } else {
                generatedCode.append("\n");
            }
        }
        indentLevel--;
        indent();
        generatedCode.append("]");
    }

    private void generateDynamicDict(ASTNode dictNode) {
        if (dictNode.getChildren().isEmpty()) {
            generatedCode.append("{}");
            return;
        }
        generatedCode.append("{\n");
        indentLevel++;
        List<ASTNode> fields = dictNode.getChildren();
        for (int i = 0; i < fields.size(); i++) {
            ASTNode fieldNode = fields.get(i);
            String fieldName = fieldNode.getNodeName().replace("Field: ", "").split(" ")[0].trim();
            indent();
            generatedCode.append("\"").append(fieldName).append("\": ");
            if (!fieldNode.getChildren().isEmpty()) {
                resolveExpression(fieldNode.getChildren().get(0));
            } else {
                generatedCode.append("None");
            }
            if (i < fields.size() - 1) {
                generatedCode.append(",\n");
            } else {
                generatedCode.append("\n");
            }
        }
        indentLevel--;
        indent();
        generatedCode.append("}");
    }

    private void visitChildren(ASTNode node) {
        if (node.getChildren() != null) {
            for (ASTNode child : node.getChildren()) {
                visit(child);
            }
        }
    }

    private ASTNode findChildStartWith(ASTNode node, String prefix) {
        for (ASTNode child : node.getChildren()) {
            if (child.getNodeName().startsWith(prefix)) return child;
        }
        return null;
    }

    private void indent() {
        for (int i = 0; i < indentLevel; i++) {
            generatedCode.append("    ");
        }
    }
}