package Integrator;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

/**
 * ===============================================================
 * OutputManager — إدارة هيكل الخرج النهائي (عضو 5 - Integrator)
 * ===============================================================
 *
 * مبني بالضبط حسب التوضيح الرسمي من الدكتور (إعلان مرحلة التوليد):
 *
 *   output/                 ← نتاج التوليد الحقيقي + الملفات المرافقة
 *     ├── index.html            (مُولَّد فعليًا من JinjaEvaluator)
 *     ├── add_product.html      (مُولَّد فعليًا)
 *     ├── edit_product.html     (مُولَّد فعليًا)
 *     ├── product_detail_1.html (مُولَّد ديناميكيًا حسب المنتجات الموجودة)
 *     ├── app.py                (يُنسخ كما هو، بدون أي معالجة)
 *     ├── style.css             (يُنسخ كما هو، بدون أي معالجة)
 *     └── script.js             (يُنسخ كما هو، اختياري)
 *
 *   compiler_output/        ← نتاج مراحل التحليل والتوليد نفسها
 *     ├── ast_python.json
 *     ├── ast_jinja.json
 *     ├── semantic_report.txt
 *     └── generation_log.txt
 *
 * ملاحظة مهمة (حسب توضيح الدكتور): app.py / style.css / script.js
 * لا تدخل ضمن عملية "التحليل والتوليد" — فقط تُرفَق كما هي، لذلك
 * نسخها هون هو Files.copy() بسيط، بدون أي Lexer/Parser/Generator.
 */
public class OutputManager {

    // ================= أسماء المجلدات (مرجع مركزي لكل الفريق) =================
    public static final String OUTPUT_DIR = "output";
    public static final String COMPILER_OUTPUT_DIR = "compiler_output";

    private final Path outputPath;
    private final Path compilerOutputPath;

    public OutputManager() {
        this.outputPath = Paths.get(OUTPUT_DIR);
        this.compilerOutputPath = Paths.get(COMPILER_OUTPUT_DIR);
    }

    /**
     * الخطوة الأولى الإلزامية: تجهيز هيكل المجلدات فارغًا وتنظيف ملفات التفاصيل القديمة.
     * لازم تُستدعى قبل أي عملية كتابة أو نسخ تانية.
     */
    public void prepareStructure() throws IOException {
        Files.createDirectories(outputPath);
        Files.createDirectories(compilerOutputPath);

        // تنظيف صفحات التفاصيل القديمة لمنع تراكم الملفات للمنتجات المحذوفة
        cleanOldProductDetails();

        System.out.println("=== OutputManager: Structure Prepared ===");
        System.out.println("  ✔ " + outputPath.toAbsolutePath());
        System.out.println("  ✔ " + compilerOutputPath.toAbsolutePath());
    }

    /**
     * دالة تنظيف: مسح ملفات التفاصيل القديمة (product_detail_*.html) من مجلد output/
     * تضمن عدم بقاء أي ملف لمنتج تم حذفه من ملف البايثون.
     */
    public void cleanOldProductDetails() {
        if (!Files.exists(outputPath) || !Files.isDirectory(outputPath)) {
            return;
        }

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(outputPath, "product_detail_*.html")) {
            for (Path entry : stream) {
                Files.deleteIfExists(entry);
            }
        } catch (IOException e) {
            System.err.println("  ⚠️ تنبيه: تعذر مسح بعض ملفات التفاصيل القديمة: " + e.getMessage());
        }
    }

    // ================================================================
    // القسم الأول: output/  (الخرج النهائي القابل للتشغيل)
    // ================================================================

    /**
     * كتابة صفحة HTML مُولَّدة فعليًا (ناتج JinjaEvaluator.render())
     * داخل output/. مثال: writeGeneratedPage("index.html", htmlContent)
     */
    public void writeGeneratedPage(String fileName, String htmlContent) throws IOException {
        Path target = outputPath.resolve(fileName);
        Files.writeString(target, htmlContent, StandardCharsets.UTF_8);
        System.out.println("  ✔ Generated: output/" + fileName);
    }

    /**
     * نسخ ملف مرافق (app.py / style.css / script.js) كما هو تمامًا،
     * بدون أي معالجة أو تحليل — حسب توضيح الدكتور صراحةً.
     *
     * @param sourcePath المسار الأصلي للملف (مثلاً "src/Input/flask_app.py")
     * @param targetFileName الاسم النهائي داخل output/ (مثلاً "app.py")
     */
    public void copySupportingFile(String sourcePath, String targetFileName) throws IOException {
        Path source = Paths.get(sourcePath);
        if (!Files.exists(source)) {
            System.err.println("  ❌ Supporting file not found, skipped: " + sourcePath);
            return;
        }
        Path target = outputPath.resolve(targetFileName);
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("  ✔ Copied as-is: output/" + targetFileName);
    }

    // ================================================================
    // القسم الثاني: compiler_output/  (نتاج التحليل والتوليد)
    // ================================================================

    /** كتابة أي ملف نصي داخل compiler_output/ (JSON أو TXT). */
    public void writeCompilerArtifact(String fileName, String content) throws IOException {
        Path target = compilerOutputPath.resolve(fileName);
        Files.writeString(target, content, StandardCharsets.UTF_8);
        System.out.println("  ✔ Compiler artifact: compiler_output/" + fileName);
    }

    // ================= Getters (لباقي أعضاء الفريق) =================

    public Path getOutputPath() { return outputPath; }
    public Path getCompilerOutputPath() { return compilerOutputPath; }
}