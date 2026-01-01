package JinjaAST;

import java.util.*;

public class Program extends Node {
    private final List<Node> nodes = new ArrayList<>();

    public Program(int line) {
        super(line);
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Node n : nodes) sb.append(n);
        return sb.toString();
    }
}
