package SymbolTable.SymbolFlask;

import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {

    private String name;
    private Scope parent;
    private Map<String, Symbol> symbols = new LinkedHashMap<>();

    public Scope(String name, Scope parent) {
        this.name = name;
        this.parent = parent;
    }

    public void define(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    public Symbol resolve(String name) {
        if (symbols.containsKey(name)) {
            return symbols.get(name);
        }
        if (parent != null) {
            return parent.resolve(name);
        }
        return null;
    }

    public void print(String indent) {
        System.out.println(indent + "Scope: " + name);

        for (Symbol s : symbols.values()) {
            System.out.println(indent + "  -> " + s.getName() + " [" + s.getKind() + "]");

            if (s.getInnerScope() != null) {
                s.getInnerScope().print(indent + "      ");
            }
        }
    }
}
