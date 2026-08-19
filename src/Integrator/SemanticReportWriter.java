package Integrator;

import java.time.LocalDateTime;
import java.util.List;

/**
 * ===============================================================
 * SemanticReportWriter — تقرير موحّد لأخطاء التحليل الدلالي
 * ===============================================================
 *
 * يجمع أخطاء SemanticAnalyzer تبع Python وJinja بملف نصي واحد
 * (semantic_report.txt)، مطلوب صراحة بإعلان الدكتورة.
 */
public class SemanticReportWriter {

    public static String buildReport(List<String> pythonErrors, List<String> jinjaErrors) {
        StringBuilder sb = new StringBuilder();

        sb.append("===============================================\n");
        sb.append("      تقرير التحليل الدلالي (Semantic Report)  \n");
        sb.append("===============================================\n");
        sb.append("تاريخ التوليد: ").append(LocalDateTime.now()).append("\n\n");

        sb.append("--- Python (flask_app.py) ---\n");
        appendErrorList(sb, pythonErrors);

        sb.append("\n--- Jinja (templates/*.html) ---\n");
        appendErrorList(sb, jinjaErrors);

        int total = pythonErrors.size() + jinjaErrors.size();
        sb.append("\n===============================================\n");
        sb.append("الإجمالي: ").append(total).append(total == 1 ? " مشكلة" : " مشكلة/مشاكل").append(".\n");
        sb.append(total == 0
                ? " لم يتم رصد أي أخطاء دلالية.\n"
                : " راجعي القائمة أعلاه لتفاصيل كل مشكلة.\n");

        return sb.toString();
    }

    private static void appendErrorList(StringBuilder sb, List<String> errors) {
        if (errors == null || errors.isEmpty()) {
            sb.append("   لا يوجد أخطاء دلالية.\n");
            return;
        }
        for (String e : errors) {
            sb.append(e).append("\n");
        }
    }
}