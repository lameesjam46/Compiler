package SymbolTable.SymbolFlask;

public class Symbol {

    private String name;
    private String kind;
    private Scope innerScope;
    private int line;

    public Symbol(String name, String kind, int line) {
        this.name = name;
        this.kind = kind;
        this.line = line;
    }


    public String getKind() {
        return kind;
    }

    public int getLine() {
        return line;
    }

    public String getName() {
        return name;
    }


    public Scope getInnerScope() {
        return innerScope;
    }

    public void setInnerScope(Scope innerScope) {
        this.innerScope = innerScope;
    }

    @Override
    public String toString() {
        return name + " : " + kind + " (line " + line + ")";
    }
}