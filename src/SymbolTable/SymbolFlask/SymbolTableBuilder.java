package SymbolTable.SymbolFlask;

import AST.PaythonAST.*;

public class SymbolTableBuilder {

    private Scope currentScope;
    private boolean insideIf = false;

    public Scope build(ASTNode root) {
        currentScope = new Scope("Global", null);
        visit(root);
        return currentScope;
    }


    private void visit(ASTNode node) {
        if (node == null) return;

        if (node instanceof FunctionNode) {
            visitFunction((FunctionNode) node);
        }
        else if (node instanceof ParamNode) {
            currentScope.define(new Symbol(
                    ((ParamNode) node).getName(),
                    SymbolKind.PARAMETER.toString(),
                    node.getLineno()
            ));
        }
        else if (node instanceof AssignmentNode) {
            visitAssignment((AssignmentNode) node);
        }
        else if (node instanceof IfNode) {
            visitIf((IfNode) node);
        }
        else if (node instanceof ForNode) {
            visitFor((ForNode) node);
        }
        else {
            if (node.getChildren() != null) {
                for (ASTNode c : node.getChildren()) {
                    visit(c);
                }
            }
        }
    }


    private void visitAssignment(AssignmentNode node) {
        String name = extractVarName(node.getLeft());

        if (name != null) {
            String kind = insideIf
                    ? SymbolKind.IF_VARIABLE.toString()
                    : SymbolKind.VARIABLE.toString();


            Symbol sym = new Symbol(name, kind, node.getLineno());
            sym.setType(inferType(node.getRight()));   // 🆕 استنتاج النوع من القيمة المسندة
            currentScope.define(sym);
        }

        if (node.getRight() != null) {
            visit(node.getRight());
        }
    }


    private String extractVarName(ASTNode left) {
        if (left == null || left.getNodeName() == null) return null;
        String name = left.getNodeName();
        if (name.startsWith("Var: ")) {
            return name.replace("Var: ", "").trim();
        }
        return null;
    }

    /**
     * 🆕 يستنتج نوع البيانات المنطقي لعقدة AST معينة.
     * بيرجع: "number", "string", "boolean", أو "unknown"
     */
    public static String inferType(ASTNode node) {
        if (node == null) return "unknown";

        String name = node.getNodeName();
        if (name == null) return "unknown";

        // الحالة 1: قيمة رقمية مباشرة → "Number: 100"
        if (name.startsWith("Number: ")) {
            return "number";
        }

        // الحالة 2: قيمة نصية مباشرة → "String: \"Phone\""
        if (name.startsWith("String: ")) {
            return "string";
        }

        // الحالة 3: قيمة بوليان → "Boolean: True" / "Boolean: False"
        if (name.startsWith("Boolean: ")) {
            return "boolean";
        }

        // الحالة 4: متغير (Identifier) → "Var: price" — لازم نرجع نسأل الـ Scope عنه
        if (name.startsWith("Var: ")) {
            return "unknown"; // الحل الكامل (مع Scope) موجود بنسخة FlaskSemanticAnalyzer
        }

        // الحالة 5: استدعاء دالة معروفة → float(...), int(...), str(...)
        if (node instanceof CallNode) {
            ASTNode func = ((CallNode) node).getFunction();
            if (func != null && func.getNodeName() != null) {
                String funcName = func.getNodeName().replace("Var: ", "").trim();
                if (funcName.equals("float") || funcName.equals("int") || funcName.equals("len")) {
                    return "number";
                }
                if (funcName.equals("str")) {
                    return "string";
                }
            }
            return "unknown";
        }

        // الحالة 6: عملية ثنائية (a + b) → لو الطرفين نفس النوع، النتيجة نفس النوع
        if (node instanceof BinaryOpNode) {
            if (node.getChildren().size() >= 2) {
                String leftType = inferType(node.getChildren().get(0));
                String rightType = inferType(node.getChildren().get(1));
                if (leftType.equals(rightType) && !leftType.equals("unknown")) {
                    return leftType;
                }
            }
            return "unknown";
        }

        // أي حالة تانية غير معروفة
        return "unknown";
    }

    private void visitIf(IfNode node) {
        boolean saved = insideIf;
        insideIf = true;

        if (node.getChildren() != null) {
            for (ASTNode c : node.getChildren()) {
                visit(c);
            }
        }

        insideIf = saved;
    }

    private void visitFunction(FunctionNode node) {
        String funcName = node.getName(); // استخدام getName() الجاهزة بدل تفكيك النص

        Symbol funcSym = new Symbol(funcName, SymbolKind.FUNCTION.toString(), node.getLineno());
        currentScope.define(funcSym);

        Scope saved = currentScope;
        currentScope = new Scope("Scope_" + funcName, saved);
        funcSym.setInnerScope(currentScope);

        if (node.getChildren() != null) {
            for (ASTNode c : node.getChildren()) {
                visit(c);
            }
        }

        currentScope = saved;
    }


    private void visitFor(ForNode node) {
        String varName = node.getVariable() != null ? node.getVariable() : "unknown";

        currentScope.define(new Symbol(
                varName,
                SymbolKind.LOOP_VARIABLE.toString(),
                node.getLineno()
        ));

        if (node.getChildren() != null) {
            for (ASTNode c : node.getChildren()) {
                visit(c);
            }
        }
    }
}