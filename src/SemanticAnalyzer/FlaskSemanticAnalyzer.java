package SemanticAnalyzer;

import AST.PaythonAST.*;
import SymbolTable.SymbolFlask.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class FlaskSemanticAnalyzer {

    private Scope globalScope;
    // 1. تعريف متغيّر علم لمراقبة وجود أخطاء دلالية أثناء الفحص
    private boolean hasSemanticErrors = false;

    // ============================================================
    // تعديل: أضفنا لائحة نصية لتخزين نفس رسائل الأخطاء يلي كانت
    // تُطبع فقط بالتيرمينال (System.err.println)، بدون ما نغيّر
    // أي سلوك موجود — الطباعة تضل تماماً متل ما هي. هلق فقط صار
    // فينا نسترجع الأخطاء برمجيًا (getErrors())، لبناء
    // semantic_report.txt الحقيقي بمجلد compiler_output/.
    // ============================================================
    private final List<String> errors = new ArrayList<>();

    public void check(ASTNode root, Scope globalScope) {
        this.globalScope = globalScope;
        this.hasSemanticErrors = false; // إعادة تهيئة العلم قبل البدء
        this.errors.clear();
        visit(root);
    }

    // 2. ميثود عامة ترجع حالة الفحص ليقرأها ملف Main.java
    public boolean hasErrors() {
        return this.hasSemanticErrors;
    }

    /** لائحة نصية بكل الأخطاء الدلالية المرصودة — تستخدم لبناء semantic_report.txt */
    public List<String> getErrors() {
        return errors;
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

                                    String message = "Missing Flask Variable: URL variable <" + flaskVar
                                            + "> in route \"" + routeText + "\" is missing from function '"
                                            + funcName + "' parameters (line " + funcNode.getLineno() + ")";
                                    this.errors.add(message);

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
}