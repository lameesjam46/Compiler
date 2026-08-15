package Integrator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class AppPyManager {

    private static final String APP_PY_PATH = "app.py";

    /**
     * تحديث قائمة المنتجات داخل ملف app.py النصي دون إضافة أي دوال إضافية بالبايثون
     */
    public static void updateProductsInAppPy(String newProductsPythonArray) throws IOException {
        // 1. قراءة محتوى ملف app.py بالكامل كـ String
        String content = new String(Files.readAllBytes(Paths.get(APP_PY_PATH)));

        // 2. استبدال الجزء الخاص بـ products = [...] بالمصفوفة الجديدة
        // يبحث عن بداية products = [ وإلى غاية نهاية المربع ]
        String regex = "(?s)products\\s*=\\s*\\[.*?\\]";
        String updatedContent = content.replaceAll(regex, "products = " + newProductsPythonArray);

        // 3. كتابة الملف المعدل على القرص
        Files.write(Paths.get(APP_PY_PATH), updatedContent.getBytes());

        System.out.println("📝 تم تحديث app.py بنجاح! سيتم التقاط التغيير بواسطة WatchService...");
    }

    // مثال للاستخدام: إضافة منتج جديد
    public static void main(String[] args) throws IOException {
        // مصفوفة جديدة بصيغة Python بسيطة يسهل على الـ Python Parser إعرابها
        String updatedArray = "[\n" +
                "    {\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"Phone\",\n" +
                "        \"price\": 100,\n" +
                "        \"details\": \"Smart phone\",\n" +
                "        \"image\": \"phone.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2,\n" +
                "        \"name\": \"Laptop\",\n" +
                "        \"price\": 500,\n" +
                "        \"details\": \"Powerful laptop\",\n" +
                "        \"image\": \"laptop.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 3,\n" +
                "        \"name\": \"Tablet\",\n" +
                "        \"price\": 300,\n" +
                "        \"details\": \"New Tablet\",\n" +
                "        \"image\": \"tablet.jpg\"\n" +
                "    }\n" +
                "]";

        updateProductsInAppPy(updatedArray);
    }
}