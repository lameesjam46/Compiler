package Integrator;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormServer {

    public static void startServer() {
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
            server.createContext("/add-product", new AddProductHandler());
            server.createContext("/delete-product", new DeleteProductHandler());
            server.setExecutor(null);
            server.start();
            System.out.println("🌐 سيرفر الاستقبال التلقائي شغال على: http://localhost:8080");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class AddProductHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            try {
                if ("POST".equalsIgnoreCase(exchange.getRequestMethod())) {
                    InputStream is = exchange.getRequestBody();
                    String formData = new String(is.readAllBytes(), StandardCharsets.UTF_8);
                    Map<String, String> params = parseFormData(formData);

                    String name = params.getOrDefault("name", "منتج جديد");
                    double price = 0;
                    try { price = Double.parseDouble(params.getOrDefault("price", "0")); } catch (Exception ignored) {}
                    String details = params.getOrDefault("details", "");
                    String image = params.getOrDefault("image", "default.jpg");
                    if (image.isBlank()) image = "default.jpg";

                    List<Map<String, Object>> currentProducts = parseCurrentProductsFromAppPy();

                    int maxId = 0;
                    for (Map<String, Object> p : currentProducts) {
                        int id = ((Number) p.get("id")).intValue();
                        if (id > maxId) maxId = id;
                    }

                    Map<String, Object> newProd = new LinkedHashMap<>();
                    newProd.put("id", maxId + 1);
                    newProd.put("name", name);
                    newProd.put("price", price);
                    newProd.put("details", details);
                    newProd.put("image", image);
                    currentProducts.add(newProd);

                    AppPyManager.updateProductsInAppPy(buildPythonArrayString(currentProducts));
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                redirectToReferrer(exchange);
            }
        }
    }

    static class DeleteProductHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            try {
                String query = exchange.getRequestURI().getQuery();
                if (query != null && query.contains("id=")) {
                    int deleteId = Integer.parseInt(query.split("id=")[1].split("&")[0]);

                    List<Map<String, Object>> currentProducts = parseCurrentProductsFromAppPy();
                    currentProducts.removeIf(p -> ((Number) p.get("id")).intValue() == deleteId);

                    AppPyManager.updateProductsInAppPy(buildPythonArrayString(currentProducts));
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                redirectToReferrer(exchange);
            }
        }
    }

    private static Map<String, String> parseFormData(String formData) {
        Map<String, String> map = new HashMap<>();
        if (formData == null || formData.isBlank()) return map;
        for (String pair : formData.split("&")) {
            String[] kv = pair.split("=");
            if (kv.length > 1) {
                map.put(URLDecoder.decode(kv[0], StandardCharsets.UTF_8),
                        URLDecoder.decode(kv[1], StandardCharsets.UTF_8));
            }
        }
        return map;
    }

    // إجابة السيرفر وتوجيه المتصفح للعودة تلقائياً للمستند المحلي
    private static void redirectToReferrer(HttpExchange exchange) throws IOException {
        String htmlRedirect = "<!DOCTYPE html><html><head><meta charset='UTF-8'>"
                + "<script>"
                + "if (document.referrer) { window.location.href = document.referrer; }"
                + "else { window.location.href = 'products.html'; }"
                + "</script></head><body><p>تمت العملية بنجاح، جاري العودة...</p></body></html>";

        byte[] responseBytes = htmlRedirect.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
        exchange.sendResponseHeaders(200, responseBytes.length);
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(responseBytes);
            os.flush();
        }
    }

    private static List<Map<String, Object>> parseCurrentProductsFromAppPy() {
        List<Map<String, Object>> list = new ArrayList<>();
        try {
            String content = Files.readString(Paths.get("Input/flask_app.py"));
            Matcher m = Pattern.compile("\\{\\s*\"id\":\\s*(\\d+)[^}]*\"name\":\\s*\"(.*?)\"[^}]*\"price\":\\s*([\\d.]+)[^}]*\"details\":\\s*\"(.*?)\"[^}]*\"image\":\\s*\"(.*?)\"\\s*\\}", Pattern.DOTALL).matcher(content);
            while (m.find()) {
                Map<String, Object> p = new LinkedHashMap<>();
                p.put("id", Integer.parseInt(m.group(1)));
                p.put("name", m.group(2));
                p.put("price", Double.parseDouble(m.group(3)));
                p.put("details", m.group(4));
                p.put("image", m.group(5));
                list.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    private static String buildPythonArrayString(List<Map<String, Object>> products) {
        StringBuilder sb = new StringBuilder("[\n");
        for (int i = 0; i < products.size(); i++) {
            Map<String, Object> p = products.get(i);
            sb.append("    {\n");
            sb.append("        \"id\": ").append(p.get("id")).append(",\n");
            sb.append("        \"name\": \"").append(p.get("name")).append("\",\n");
            sb.append("        \"price\": ").append(p.get("price")).append(",\n");
            sb.append("        \"details\": \"").append(p.get("details")).append("\",\n");
            sb.append("        \"image\": \"").append(p.get("image")).append("\"\n");
            sb.append("    }");
            if (i < products.size() - 1) sb.append(",");
            sb.append("\n");
        }
        sb.append("]");
        return sb.toString();
    }
}