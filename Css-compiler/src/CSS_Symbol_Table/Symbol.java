package CSS_Symbol_Table;

import java.util.HashMap;
import java.util.Map;

public class Symbol {
    public String name;
    public Map<String, String> properties = new HashMap<>();

    public Symbol(String name) {
        this.name = name;
    }

    public void addProperty(String propName, String value) {
        properties.put(propName, value);
    }

    @Override
    public String toString() {
        return "Symbol: " + name + " → " + properties;
    }
}