package SymbolTable.SymbolTablejinja;
import java.util.*;
public class SymbolTable {
    private final Deque<Scope> stack;
    private final List<Scope> allScopes;

    public SymbolTable() {
        stack = new ArrayDeque<>();
        allScopes = new ArrayList<>();
        enterScope("Global");
    }

    public void enterScope(String name) {
        Scope scope = new Scope(name);
        stack.push(scope);
        allScopes.add(scope);
    }

    public void exitScope() {
        if (!stack.isEmpty()) stack.pop();
    }

    public void addSymbol(String name, String type, int line) {
        if (!stack.isEmpty()) stack.peek().addSymbol(name, type, line);
    }

    public Symbol lookup(String name) {
        for (Scope s : stack) {
            Symbol sym = s.lookup(name);
            if (sym != null) return sym;
        }
        return null;
    }

    public void print() {
        for (Scope s : allScopes) s.printScope();
    }
}