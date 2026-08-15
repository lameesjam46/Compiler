package Integrator;

import java.io.IOException;
import java.nio.file.*;

/**

 *
 * السيناريو:
 *   1) تشغّلي هالبرنامج مرة وحدة — بيضل شغال بالخلفية (Infinite Loop)
 *   2) تفتحي flask_app.py، تعدّلي (تضيفي/تحذفي منتج)، تحفظي (Ctrl+S)
 *   3) الـ WatchService بيكتشف حدث "تعديل" على الملف فورًا
 *   4) بينادي MainIntegration.generate() تلقائيًا (نفس الكلاس، بلا
 *      أي استدعاء خارجي)
 *   5) output/*.html تتحدث تلقائيًا، خلال ثواني من الحفظ
 *
 * لإيقاف المراقبة: زر الإيقاف الأحمر ⏹ بـ IntelliJ.
 */
public class AutoRegenerateWatcher {

    // ⚠ عدّلي المسار لو مختلف عندك (نفس مجلد flask_app.py)
    private static final String WATCHED_DIRECTORY = "Input";
    private static final String WATCHED_FILE = "flask_app.py";

    public static void main(String[] args) throws Exception {

//        FormServer.startServer();

        System.out.println("=== AutoRegenerateWatcher: بدء المراقبة ===");
        System.out.println("  يراقب: " + WATCHED_DIRECTORY + "/" + WATCHED_FILE);

        // ============================================================
        // توليد أولي فور بدء التشغيل، عشان output/ يكون محدّث من
        // أول لحظة، مش بس بعد أول تعديل يصير لاحقًا
        // ============================================================
        System.out.println("\n--- توليد أولي عند بدء التشغيل ---");
        MainIntegration.generate();

        // ============================================================
        // بدء المراقبة الفعلية (الحلقة اللانهائية)
        // ============================================================
        Path dir = Paths.get(WATCHED_DIRECTORY);
        WatchService watchService = FileSystems.getDefault().newWatchService();
        dir.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);

        System.out.println("\n✔ المراقبة شغالة الآن. عدّلي وسجّلي " + WATCHED_FILE + " لتجربة التوليد التلقائي.");
        System.out.println("  (لإيقاف المراقبة، أوقفي التشغيل يدويًا من IntelliJ — الزر الأحمر ⏹)\n");

        while (true) {
            WatchKey key = watchService.take(); // ينتظر هون لحد ما يصير حدث فعليًا (بلا استهلاك معالج بلا داعي)

            for (WatchEvent<?> event : key.pollEvents()) {
                Path changedFile = (Path) event.context();

                if (changedFile != null && changedFile.toString().equals(WATCHED_FILE)) {
                    System.out.println("\n🔄 تم رصد تعديل على " + WATCHED_FILE + " — بدء إعادة التوليد...");

                    try {
                        // مهلة بسيطة قبل القراءة، عشان نتأكد إنه المحرر
                        // خلص يكتب الملف بالكامل على القرص (خصوصًا IntelliJ
                        // أحيانًا بيبعت أكتر من حدث تعديل متتالي بسرعة)
                        Thread.sleep(300);
                        MainIntegration.generate();
                        System.out.println("✔ إعادة التوليد اكتملت بنجاح.\n");
                    } catch (Exception e) {
                        System.err.println("❌ خطأ أثناء إعادة التوليد: " + e.getMessage());
                    }
                }
            }

            boolean valid = key.reset();
            if (!valid) {
                System.err.println("⚠ توقفت المراقبة (المجلد أصبح غير قابل للوصول).");
                break;
            }
        }
    }
}