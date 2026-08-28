package SemanticAnalyzer;

import AST.PaythonAST.*;
import SymbolTable.SymbolFlask.*;
import java.util.regex.*;

public class FlaskSemanticAnalyzer {

    private Scope globalScope;
    // 1. تعريف متغيّر علم لمراقبة وجود أخطاء دلالية أثناء الفحص
    private boolean hasSemanticErrors = false;

    public void check(ASTNode root, Scope globalScope) {
        this.globalScope = globalScope;
        this.hasSemanticErrors = false; // إعادة تهيئة العلم قبل البدء
        visit(root);
    }

    // 2. ميثود عامة ترجع حالة الفحص ليقرأها ملف Main.java
    public boolean hasErrors() {
        return this.hasSemanticErrors;
    }

    private void visit(ASTNode node) {
        if (node == null) return;

        if (node.getNodeName() != null && node.getNodeName().equals("DecoratedFunction")) {
            if (node.getChildren() != null && node.getChildren().size() >= 2) {
                ASTNode routeNode = node.getChildren().get(0);
                ASTNode funcNode = node.getChildren().get(1);

                if (funcNode instanceof FunctionNode) {
                    FunctionNode fn = (FunctionNode) funcNode;

                    String routeText = findUrlInRoute(routeNode);
                    String funcName = fn.getName().replace("Function:", "").trim();

                    if (routeText != null && !routeText.isEmpty()) {
                        Pattern pattern = Pattern.compile("<([^>]+)>");
                        Matcher matcher = pattern.matcher(routeText);

                        while (matcher.find()) {
                            String rawVar = matcher.group(1).trim();
                            String flaskVar = rawVar;

                            if (rawVar.contains(":")) {
                                flaskVar = rawVar.substring(rawVar.indexOf(":") + 1).trim();
                            }

                            Symbol funcSym = globalScope.resolve(funcName);

                            if (funcSym != null && funcSym.getInnerScope() != null) {
                                Symbol paramSym = funcSym.getInnerScope().resolve(flaskVar);

                                if (paramSym == null || !paramSym.getKind().equals(SymbolKind.PARAMETER.toString())) {
                                    // 3. رفع العلم وتثبيت حدوث خطأ دلالي فور رصده
                                    this.hasSemanticErrors = true;

                                    System.err.println("\n [Flask Semantic Error]: Missing Flask Variable!");
                                    System.err.println("   -> In Route URL: \"" + routeText + "\"");
                                    System.err.println("   -> The URL variable <" + flaskVar + "> is missing from function '" + funcName + "' parameters.");
                                    System.err.println("   -> Error at line: " + funcNode.getLineno());
                                    System.err.println("--------------------------------------------------");
                                }
                            }
                        }
                    }
                }
            }
        }
// ============================================================
// 🆕 فحص Type Mismatch: عمليات ثنائية بين أنواع غير متوافقة
// ============================================================
        if (node instanceof BinaryOpNode) {
            java.util.List<ASTNode> children = node.getChildren();
            if (children.size() >= 2) {
                ASTNode left = children.get(0);
                ASTNode right = children.get(1);
                String operator = node.getNodeName().replace("BinaryOp: ", "").trim();

                String leftType = resolveType(left, globalScope);
                String rightType = resolveType(right, globalScope);

                if (!leftType.equals("unknown") && !rightType.equals("unknown")
                        && !leftType.equals(rightType)) {

                    this.hasSemanticErrors = true;

                    String message = "Type Mismatch: cannot apply operator '" + operator
                            + "' between " + leftType + " and " + rightType
                            + " (line " + node.getLineno() + ")";
                    this.errors.add(message);

                    System.err.println("\n [Flask Semantic Error]: Type Mismatch!");
                    System.err.println("   -> Operator: '" + operator + "'");
                    System.err.println("   -> Left type: " + leftType + ", Right type: " + rightType);
                    System.err.println("   -> Error at line: " + node.getLineno());
                    System.err.println("--------------------------------------------------");
                }
            }
        }



        if (node.getChildren() != null) {
            for (ASTNode child : node.getChildren()) {
                visit(child);
            }
        }
    }

    private String findUrlInRoute(ASTNode node) {
        if (node == null) return null;

        String name = node.getNodeName();
        if (name != null) {
            if (name.startsWith("String:")) {
                return name.replace("String:", "").replace("\"", "").replace("'", "").trim();
            }
            if (name.contains("/") && (name.contains("\"") || name.contains("'"))) {
                return name.replace("\"", "").replace("'", "").trim();
            }
        }

        if (node.getChildren() != null) {
            for (ASTNode child : node.getChildren()) {
                String url = findUrlInRoute(child);
                if (url != null) return url;
            }
        }
        return null;
    }

    /**
     * 🆕 يستنتج نوع طرف عملية (Literal مباشر أو متغير عبر Scope)
     * بيرجع: "number", "string", "boolean", أو "unknown"
     */
    private String resolveType(ASTNode node, Scope scope) {
        if (node == null) return "unknown";

        // أولاً: نجرب نستخرج النوع من شكل العقدة نفسها (Literal / Call)
        String basicType = SymbolTable.SymbolFlask.SymbolTableBuilder.inferType(node);
        if (!basicType.equals("unknown")) {
            return basicType;
        }

        // ثانيًا: لو كانت متغير (Var: ...)، نرجع نسأل الـ Scope الصحيح عن نوعه المخزّن
        String name = node.getNodeName();
        if (name != null && name.startsWith("Var: ")) {
            String varName = name.replace("Var: ", "").trim();
            Symbol sym = scope.resolve(varName);
            if (sym != null && sym.getType() != null) {
                return sym.getType();
            }
        }

        return "unknown";
    }
}