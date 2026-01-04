package SymbolTable.SymbolTablejinja;
import java.util.*;

public class Scope {
    private final String name;
    private final Map<String, Symbol> symbols;

    public Scope(String name) {
        this.name = name;
        this.symbols = new LinkedHashMap<>();
    }

    public void addSymbol(String name, String type, int line) {
        symbols.put(name, new Symbol(name, type, line));
    }

    public Symbol lookup(String name) {
        return symbols.get(name);
    }

    public void printScope() {
        System.out.println("Scope: " + name);
        for (Symbol s : symbols.values()) {
            System.out.println("  " + s);
        }
    }

    public String getName() { return name; }
}