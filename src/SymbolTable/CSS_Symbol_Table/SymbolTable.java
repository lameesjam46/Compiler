package SymbolTable.CSS_Symbol_Table;


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

        printScope("Global Scope", globalScope);

        for (Scope media : mediaScopes) {
            printScope(media.scopeName, media);
        }
    }

    private void printScope(String title, Scope scope) {
        System.out.println("\n" + title + ":");

        String line = "+----------------------+------------------------------------------+";
        System.out.println(line);
        System.out.printf("| %-20s | %-40s |\n", "Name", "Properties");
        System.out.println(line);

        for (Symbol sym : scope.symbols.values()) {
            System.out.printf(
                    "| %-20s | %-40s |\n",
                    sym.name,
                    sym.propertiesToString()
            );
        }

        System.out.println(line);
    }

}