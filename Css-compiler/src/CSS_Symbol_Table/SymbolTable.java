package CSS_Symbol_Table;


import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    public Scope globalScope = new Scope("Global");
    public List<Scope> mediaScopes = new ArrayList<>();
    public int mediaCount = 0;

    public Scope createMediaScope() {
        mediaCount++;
        Scope media = new Scope("Media Query " + mediaCount);
        mediaScopes.add(media);
        return media;
    }

    public void print() {
        System.out.println("\n========= SYMBOL TABLE =========");
        System.out.println("Global Scope:");
        for (Symbol sym : globalScope.symbols.values()) {
            System.out.println("  " + sym);
        }

        for (Scope media : mediaScopes) {
            System.out.println("\n" + media.scopeName + ":");
            for (Symbol sym : media.symbols.values()) {
                System.out.println("  " + sym);
            }
        }
    }
}