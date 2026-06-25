package SymbolTable.SymbolTablejinja;

public class Symbol {
    public enum SymbolType {
        SET_VAR,
        LOOP_VAR,
        BUILT_IN,
        FUNCTION, // تأكد من وجود هذه القيمة
        VARIABLE
    }

    private String name;
    private SymbolType type;
    private int line;

    public Symbol(String name, SymbolType type, int line) {
        this.name = name;
        this.type = type;
        this.line = line;
    }

    public String getName() { return name; }
    public SymbolType getType() { return type; }
}