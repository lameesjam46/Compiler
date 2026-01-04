package SymbolTable.CSS_Symbol_Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 public class Scope {
    public String scopeName; //
    public Map<String, Symbol> symbols = new HashMap<>();
    public List<Scope> childScopes = new ArrayList<>();

    public Scope(String scopeName) {
        this.scopeName = scopeName;
    }

    public void addSymbol(Symbol symbol) {
        symbols.put(symbol.name, symbol);
    }

    public Symbol getSymbol(String name) {
        return symbols.get(name);
    }
}