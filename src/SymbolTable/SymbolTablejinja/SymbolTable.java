package SymbolTable.SymbolTablejinja;

import java.util.*;

public class SymbolTable {
    private final Deque<Scope> stack = new ArrayDeque<>();
    private final Map<String, Symbol> builtIns = new HashMap<>();
    private final Set<String> closedScopeVariables = new HashSet<>();

    public SymbolTable() {
        enterScope("Global");
        builtIns.put("len", new Symbol("len", Symbol.SymbolType.FUNCTION, 0));
        builtIns.put("range", new Symbol("range", Symbol.SymbolType.FUNCTION, 0));
        builtIns.put("true", new Symbol("true", Symbol.SymbolType.BUILT_IN, 0));
        builtIns.put("false", new Symbol("false", Symbol.SymbolType.BUILT_IN, 0));
        builtIns.put("none", new Symbol("none", Symbol.SymbolType.BUILT_IN, 0));;
    }

    public void enterScope(String name) {
        stack.push(new Scope(name, stack.isEmpty() ? null : stack.peek()));
    }

    public void exitScope() {
        if (stack.size() > 1) {
            Scope closedScope = stack.pop();
            for (String varName : closedScope.getSymbolsNames()) {
                closedScopeVariables.add(varName);
            }
        }
    }

    public void printReport() {
        System.out.println("--- Symbol Table Report ---");
        for (Scope s : stack) {
            System.out.print("Level: " + s.getName() + " -> ");
            s.printSymbols(); // استخدام الدالة التي عرفتها أنت سابقاً
        }
    }
    public boolean addSymbol(String name, Symbol.SymbolType type, int line) {
        if (builtIns.containsKey(name)) return false;
        if (stack.peek().containsLocally(name)) return false;

        stack.peek().addSymbol(new Symbol(name, type, line));
        closedScopeVariables.remove(name);
        return true;
    }

    public boolean existsInAnyScope(String name) {
        Scope current = stack.peek();
        while (current != null) {
            if (current.containsLocally(name)) return true;
            current = current.getParent();
        }
        return false;
    }
    public Symbol lookup(String name) {
        if (builtIns.containsKey(name)) return builtIns.get(name);

        Scope current = stack.peek();
        while (current != null) {
            Symbol sym = current.lookup(name);
            if (sym != null) return sym;
            current = current.getParent();
        }
        return null;
    }
    public boolean wasDefinedInClosedScope(String name) {
        return closedScopeVariables.contains(name);
    }

    public boolean isBuiltIn(String name) {
        return builtIns.containsKey(name);
    }

    public boolean isDefined(String name) {
        return lookup(name) != null;
    }

}
