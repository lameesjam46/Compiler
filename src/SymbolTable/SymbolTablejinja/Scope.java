package SymbolTable.SymbolTablejinja;

import java.util.*;

public class Scope {
    private final String name;
    private final Scope parent;
    private final Map<String, Symbol> symbols = new HashMap<>();

    public Scope(String name, Scope parent) {
        this.name = name;
        this.parent = parent;
    }

    public boolean containsLocally(String name) {
        return symbols.containsKey(name);
    }

    public void addSymbol(Symbol s) {
        symbols.put(s.getName(), s);
    }

    public Symbol lookup(String name) {
        return symbols.get(name);
    }

    public Scope getParent() {
        return parent;
    }
    public Set<String> getSymbolsNames() {
        return symbols.keySet();
    }
    public String getName() {
        return name;
    }

    public void printSymbols() {
        for (Symbol s : symbols.values()) {
            System.out.println("  - " + s.getName() + " : " + s.getType());
        }
    }
    @Override
    public String toString() {
        return name + " { symbols=" + symbols.keySet() + " }";
    }
}