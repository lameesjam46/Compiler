package app.Integration;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

/**
 * ===============================================================
 * MainLiveApp — تشغيل التطبيق الحقيقي (Live) تلقائيًا بضغطة واحدة
 * ===============================================================
 *
 * بعكس MainIntegration (يلي بيولّد ملفات HTML ثابتة بمجلد output/)،
 * هاد الكلاس بيشغّل flask_app.py الأصلي كـ سيرفر حقيقي حي، وبيفتح
 * المتصفح تلقائيًا — البحث/الحذف/الإضافة كلهم شغالين فعليًا هون،
 * لأنه فلاسك الحقيقية (مش المترجم تبعنا) هي يلي عم تخدم الطلبات.
 *
 * الفرق الجوهري بين الكلاسين:
 *   MainIntegration → يثبت صحة "المترجم" (Lexer/Parser/AST/Generator)
 *   MainLiveApp      → يشغّل "التطبيق نفسه" (demo حي وتفاعلي كامل)
 */
public class MainLiveApp {

    // ⚠ عدّلي هالقيم الثلاث حسب مكان ملفاتك الفعلي عندك
    private static final String PYTHON_FILE_DIRECTORY = "Input"; // المجلد يلي فيه flask_app.py
    private static final String PYTHON_FILE_NAME = "flask_app.py";
    private static final String SERVER_URL = "http://127.0.0.1:5000/";

    public static void main(String[] args) throws Exception {

        System.out.println("=== MainLiveApp: تشغيل التطبيق الحقيقي (Live) ===");

        // ============================================================
        // 1. تشغيل flask_app.py كعملية منفصلة بالخلفية
        // ============================================================
        ProcessBuilder pb = new ProcessBuilder("python", PYTHON_FILE_NAME);
        pb.directory(new File(PYTHON_FILE_DIRECTORY));
        pb.redirectErrorStream(true);
        pb.inheritIO(); // عشان نشوف مخرجات فلاسك (Running on http://127.0.0.1:5000) بنفس التيرمينال

        Process serverProcess;
        try {
            serverProcess = pb.start();
        } catch (IOException e) {
            System.err.println("❌ فشل تشغيل Python. تأكدي إنه Python مثبت وموجود بالـ PATH.");
            System.err.println("   التفاصيل: " + e.getMessage());
            return;
        }

        System.out.println("✔ تم إطلاق سيرفر Flask بالخلفية...");

        // ============================================================
        // 2. الانتظار الفعلي لحد ما السيرفر يصير جاهز يستقبل طلبات
        //    (بدل انتظار ثابت أعمى، منجرب نتصل فعليًا كل نص ثانية)
        // ============================================================
        boolean serverReady = waitForServer(SERVER_URL, 15); // حتى 15 محاولة (~7.5 ثانية)

        if (!serverReady) {
            System.err.println("⚠ السيرفر ما استجاب بالوقت المتوقع. جربي تفتحي "
                    + SERVER_URL + " يدويًا بعد شوي.");
        }

        // ============================================================
        // 3. فتح المتصفح تلقائيًا على الصفحة الرئيسية
        // ============================================================
        openBrowser(SERVER_URL);

        System.out.println("\n✔ التطبيق شغال حاليًا على: " + SERVER_URL);
        System.out.println("  (لإيقاف السيرفر، أوقفي التشغيل يدويًا من IntelliJ — الزر الأحمر ⏹)");

        // نبقي البرنامج شغال طالما السيرفر شغال (وإلا العملية بتنقتل مع إغلاق JVM)
        serverProcess.waitFor();
    }

    /**
     * يحاول الاتصال بالسيرفر بشكل متكرر لحد ما يستجيب أو ينتهي عدد
     * المحاولات — أدق وأسرع من مجرد Thread.sleep() ثابت وأعمى.
     */
    private static boolean waitForServer(String url, int maxAttempts) {
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            try {
                Thread.sleep(500);
                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setConnectTimeout(500);
                conn.setRequestMethod("HEAD");
                int code = conn.getResponseCode();
                if (code > 0) return true; // أي استجابة (حتى لو خطأ) تعني السيرفر شغال
            } catch (Exception ignored) {
                // السيرفر لسا مش جاهز، منجرب تاني بالجولة الجاية
            }
        }
        return false;
    }

    /** يفتح المتصفح الافتراضي تلقائيًا على رابط السيرفر. */
    private static void openBrowser(String url) {
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(new URI(url));
            } else {
                // بديل احتياطي لأنظمة ويندوز لو Desktop API مش مدعوم
                new ProcessBuilder("cmd", "/c", "start", url).start();
            }
            System.out.println("✔ تم فتح المتصفح تلقائيًا.");
        } catch (Exception e) {
            System.err.println("⚠ ما قدرنا نفتح المتصفح تلقائيًا. افتحي الرابط يدويًا: " + url);
        }
    }
}