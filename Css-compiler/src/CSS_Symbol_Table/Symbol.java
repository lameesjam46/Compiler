package CSS_Symbol_Table;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Symbol {
    public String name;
    public Map<String, String> properties = new HashMap<>();

    public Symbol(String name) {
        this.name = name;
    }

    public void addProperty(String propName, String value) {
        properties.put(propName, value);
    }

    public String propertiesToString() {
        if (properties.isEmpty()) {
            return "-";
        }

        StringJoiner joiner = new StringJoiner(", ");
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            joiner.add(entry.getKey() + "=" + entry.getValue());
        }
        return joiner.toString();
    }

    @Override
    public String toString() {
        return String.format(
                "| %-20s | %-40s |",
                name,
                propertiesToString()
        );
    }
}
