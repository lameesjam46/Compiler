package Integrator;

import AST.PaythonAST.*;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * سجل مركزي بيربط اسم كل دالة Flask (function name) بالمسار الحقيقي
 * تبعها (route path)، مبني مباشرة من شجرة Python.
 *
 * ليش مستقل عن RouteNode.getPath():
 * حاليًا RouteNode.getPath() بترجع بس "@" (النص الحرفي)، لأنه المسار
 * الحقيقي مخزّن أعمق جوا سلسلة DecCall -> ArgList -> String. هاد الكلاس
 * بيمشي على هاي السلسلة بنفسه، بدون ما يعدّل أي كود مشترك مع باقي الفريق.
 *
 * الاستخدام الأساسي:
 * 1. التحقق من صحة أي url_for('function_name') مستخدم بالقوالب
 *    (هل الدالة هاي فعلاً معرّفة كـ route؟)
 * 2. توليد الروابط (hyperlinks) الصحيحة أثناء عملية الدمج النهائي
 */
public class RouteRegistry {

    public static class RouteInfo {
        public final String functionName;
        public final String path;

        public RouteInfo(String functionName, String path) {
            this.functionName = functionName;
            this.path = path;
        }

        @Override
        public String toString() {
            return functionName + "  ->  " + path;
        }
    }

    // المفتاح: اسم الدالة (نفس الاسم يلي بيستخدمه url_for بالقوالب)
    private final Map<String, RouteInfo> registry = new LinkedHashMap<>();

    /**
     * بتمشي على أطفال ProgramNode المباشرين، وتدخل جوا كل DecoratedFunction
     * لتلاقي زوج RouteNode + FunctionNode المتجاورين، وتسجلهم بالسجل.
     */
    public void build(ProgramNode prog) {
        registry.clear();

        for (ASTNode node : prog.getChildren()) {
            if (node.getNodeName() == null || !node.getNodeName().startsWith("DecoratedFunction")) {
                continue;
            }

            RouteNode route = null;
            FunctionNode fn = null;

            for (ASTNode inner : node.getChildren()) {
                if (inner instanceof RouteNode) route = (RouteNode) inner;
                if (inner instanceof FunctionNode) fn = (FunctionNode) inner;
            }

            if (route != null && fn != null) {
                String realPath = extractRealPath(route);
                registry.put(fn.getName(), new RouteInfo(fn.getName(), realPath));
            }
        }
    }

    // يمشي جوا سلسلة الـ decorator: RouteNode -> DecCall -> ArgList -> أول String
    private String extractRealPath(RouteNode route) {
        ASTNode decCall = findChildStartsWith(route, "DecCall");
        if (decCall == null) return "/";

        ASTNode argList = findChildStartsWith(decCall, "ArgList");
        if (argList == null || argList.getChildren().isEmpty()) return "/";

        ASTNode firstArg = argList.getChildren().get(0);
        String name = firstArg.getNodeName();

        if (name != null && name.startsWith("String: ")) {
            return name.replace("String: ", "").replace("\"", "").trim();
        }
        return "/";
    }

    private ASTNode findChildStartsWith(ASTNode node, String prefix) {
        for (ASTNode child : node.getChildren()) {
            if (child.getNodeName() != null && child.getNodeName().startsWith(prefix)) {
                return child;
            }
        }
        return null;
    }

    /** بترجع المسار الحقيقي المرتبط باسم دالة معينة، أو null لو مش موجودة */
    public String getPath(String functionName) {
        RouteInfo info = registry.get(functionName);
        return info != null ? info.path : null;
    }

    /** بتتأكد إذا كان اسم الدالة هاد فعلاً معرّف كـ route بالمشروع */
    public boolean isKnownFunction(String functionName) {
        return registry.containsKey(functionName);
    }

    public Map<String, RouteInfo> getAll() {
        return registry;
    }

    public void print() {
        System.out.println("=== Route Registry (built by Integrator) ===");
        if (registry.isEmpty()) {
            System.out.println("  (لا يوجد أي route مسجل)");
            return;
        }
        for (RouteInfo info : registry.values()) {
            System.out.println("  " + info);
        }
    }
}