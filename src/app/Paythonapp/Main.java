package app.Paythonapp;

import AST.PaythonAST.*;
import Grammer.PaythonGrammer.PyFlaskLexer;
import Grammer.PaythonGrammer.PyFlaskParser;
import SymbolTable.SymbolFlask.Scope;
import SymbolTable.SymbolFlask.SymbolTableBuilder;
import Visitor.PaythonVisitor.ASTBuilder;
import SemanticAnalyzer.FlaskSemanticAnalyzer;
import Visitor.PaythonVisitor.PythonCodeGenerator; // 1. استدعاء المولد الخاص بكِ هنا
import org.antlr.v4.runtime.*;

import java.io.FileWriter; // لاستخدامه في حفظ الملف المولد
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        String path = "Input/flask_app.py";
        CharStream cs = CharStreams.fromFileName(path);

        PyFlaskLexer lexer = new PyFlaskLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PyFlaskParser parser = new PyFlaskParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(ConsoleErrorListener.INSTANCE);

        PyFlaskParser.ProgramContext tree = parser.program();

        ASTBuilder builder = new ASTBuilder();
        ProgramNode prog = (ProgramNode) builder.visit(tree);

        linkRoutesToFunctions(prog);

        System.out.println("=== Abstract Syntax Tree Structure ===");
        prettyPrint(prog, "", true);

        SymbolTableBuilder symBuilder = new SymbolTableBuilder();
        Scope globalScope = symBuilder.build(prog);

        System.out.println("\n=== Symbol Table ===");
        globalScope.print("");

        // ============================================================
        // 🛠️ الفحص الدلالي الجديد (Flask Semantic Analysis)
        // ============================================================
        System.out.println("\n=== Starting Semantic Analysis ===");

        FlaskSemanticAnalyzer semanticAnalyzer = new FlaskSemanticAnalyzer();
        semanticAnalyzer.check(prog, globalScope); // تشغيل الفحص

        System.out.println("=== Semantic Analysis Finished ===");
        // ============================================================

        // ============================================================
        // 🛡️ التحقق من سلامة الفحص الدلالي قبل الانتقال للتوليد
        // ============================================================
        // ملاحظة هندسية: تأكدي من أن كلاس FlaskSemanticAnalyzer يحتوي على ميثود
        // مثل hasErrors() لتعود بـ true إذا طُبعت أخطاء بالطرفية.
        if (semanticAnalyzer.hasErrors()) {
            System.err.println("\n[Build Failed]: Semantic errors detected during analysis.");
            System.err.println("Execution stopped. Python code generation aborted to prevent corrupted output.");
            System.exit(1); // إيقاف المترجم فوراً وبشكل آمن!
        }
        // ============================================================

        // ============================================================
        // 🚀 مرحلة توليد كود الـ Backend (Code Generation Phase) - شغل العضو الثاني
        // ============================================================
        System.out.println("\n=== Starting Python/Flask Code Generation ===");

        // 2. إنشاء غرض من كلاس الـ Generator الخاص بكِ
        PythonCodeGenerator generator = new PythonCodeGenerator();

        // 3. تمرير الشجرة prog لتوليد الكود النهائي
        String finalBackendCode = generator.generate(prog);

        // 4. طباعة الكود المولد على شاشة الـ Console للتأكد منه أثناء المناقشة
        System.out.println("\n--- [Generated Python Code] ---");
        System.out.println(finalBackendCode);
        System.out.println("--------------------------------\n");

        // 5. حفظ الكود المولد في ملف حقيقي داخل مجلد المشروع لتشغيله لاحقاً
        try (FileWriter writer = new FileWriter("out/generated_app.py")) {
            writer.write(finalBackendCode);
            System.out.println("=================================================");
            System.out.println("✔ Success: Backend code written to 'out/generated_app.py'");
            System.out.println("=================================================");
        } catch (IOException e) {
            System.err.println("❌ Error writing generated code to file: " + e.getMessage());
        }
        // ============================================================
    }

    // ============================================================
    // تعديل: كانت هاي الدالة بتفحص أطفال prog مباشرة (وهني عقد
    // "DecoratedFunction" wrapper، مش FunctionNode)، فالشرط ما كان
    // بيصير TRUE أبدًا وHandlerName كانت تضل "None" دايمًا.
    // هلق بنفحص جوا كل DecoratedFunction (طفل ثاني مستوى) عشان
    // نلاقي الـ RouteNode والـ FunctionNode المتجاورين فعليًا.
    // ============================================================
    private static void linkRoutesToFunctions(ProgramNode prog) {
        for (ASTNode node : prog.getChildren()) {
            FunctionNode fn = null;
            RouteNode route = null;

            for (ASTNode inner : node.getChildren()) {
                if (inner instanceof FunctionNode) {
                    fn = (FunctionNode) inner;
                } else if (inner instanceof RouteNode) {
                    route = (RouteNode) inner;
                }
            }

            if (fn != null && route != null) {
                route.handlerName = fn.getName();
            }
        }
    }

    static void prettyPrint(ASTNode n, String prefix, boolean isLast) {
        System.out.print(prefix + (isLast ? "└── " : "├── "));
        System.out.print(n.getNodeName() + " (line=" + n.getLineno() + ")");

        if (n instanceof ImportNode) {
            ImportNode in = (ImportNode) n;
            System.out.print(" -> module: " + in.getModule());
        } else if (n instanceof RouteNode) {
            RouteNode rn = (RouteNode) n;
            System.out.print(" -> path: " + rn.getPath() + " [handler: " + rn.getHandlerName() + "]");
        } else if (n instanceof FunctionNode) {
            FunctionNode fn = (FunctionNode) n;
            System.out.print(" -> name: " + fn.getName());
        }
        // تعديل: حذفنا حالة AssignmentNode كليًا. الطرف الأيسر والأيمن
        // (left/right) صارا ASTNode حقيقيين وعم يتطبعوا شجريًا كأطفال
        // للعقدة أصلاً (زي ما شفتي بالمخرجات: Var: x ثم القيمة تحتها)،
        // فطباعتهم هون بالـ "+" كانت بتنادي toString() الافتراضي
        // وتطلع ClassName@hashcode بدل نص مفهوم.

        System.out.println();

        String newPrefix = prefix + (isLast ? "    " : "│   ");

        List<ASTNode> children = n.getChildren();
        for (int i = 0; i < children.size(); i++) {
            prettyPrint(children.get(i), newPrefix, i == children.size() - 1);
        }
    }
}