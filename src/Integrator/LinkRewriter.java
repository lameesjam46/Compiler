package Integrator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkRewriter {

    private static final Pattern PRODUCT_DETAIL = Pattern.compile("^/product/(\\d+)$");
    private static final Pattern DELETE = Pattern.compile("^/delete/(\\d+)$");

    public static String toStaticFile(String flaskPath) {
        if (flaskPath == null || flaskPath.isBlank()) return flaskPath;
        if (!flaskPath.startsWith("/")) return flaskPath;

        if (flaskPath.equals("/")) return "index.html";
        if (flaskPath.equals("/products")) return "products.html";
        if (flaskPath.equals("/add") || flaskPath.equals("/add_product")) return "add_product.html";
        if (flaskPath.startsWith("/search")) return "search.html";

        Matcher productMatch = PRODUCT_DETAIL.matcher(flaskPath);
        if (productMatch.matches()) {
            return productDetailFileName(productMatch.group(1));
        }

        // --- التعديل المباشر هنا: الحفاظ على ID المنتج للحذف ---
        Matcher deleteMatch = DELETE.matcher(flaskPath);
        if (deleteMatch.matches()) {
            return "products.html?delete=" + deleteMatch.group(1);
        }

        if (flaskPath.startsWith("/static/")) {
            String[] segments = flaskPath.split("/");
            return segments[segments.length - 1];
        }

        return flaskPath;
    }

    public static String productDetailFileName(Object id) {
        return "product_detail_" + id + ".html";
    }
}