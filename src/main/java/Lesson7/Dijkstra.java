package Lesson7;
import java.util.*;

public class Dijkstra {
    private static final Graph.Edge[] GRAPH = {
            new Graph.Edge("Москва", "Тула", 173),
            new Graph.Edge("Тула", "Липецк", 219),
            new Graph.Edge("Липецк", "Воронеж", 108),
            new Graph.Edge("Москва", "Рязань", 183),
            new Graph.Edge("Рязань", "Тамбов", 240),
            new Graph.Edge("Тамбов", "Саратов", 339),
            new Graph.Edge("Саратов", "Воронеж", 472),
            new Graph.Edge("Москва", "Калуга", 162),
            new Graph.Edge("Калуга", "Орел", 212),
            new Graph.Edge("Орел", "Курск", 161),
            new Graph.Edge("Курск", "Воронеж", 207),
    };
    private static final String START = "Москва";
    private static final String END = "Воронеж";

    public static void main(String[] args) {
        Graph g = new Graph(GRAPH);
        g.dijkstra(START);
        g.printPath(END);
        //g.printAllPaths();
    }
}

class Graph {
    private final Map<String, Vertex> graph;

     public static class Edge {
        public final String v1, v2;
        public final int dist;

        public Edge (String v1, String v2, int dist) {
            this.v1 = v1;
            this.v2 = v2;
            this.dist = dist;
        }
    }

      public static class Vertex implements Comparable<Vertex> {
        public final String name;
        public int dist = Integer.MAX_VALUE; // MAX_VALUE assumed to be infinity
        public Vertex previous = null;
        public final Map<Vertex, Integer> neighbours = new HashMap<>();

        public Vertex (String name) {
            this.name = name;
        }

        private void printPath ( ) {
            if (this == this.previous) {
                System.out.printf("%s", this.name);
            } else if (this.previous == null) {
                System.out.printf("%s(unreached)", this.name);
            } else {
                this.previous.printPath();
                System.out.printf(" -> %s(%d)", this.name, this.dist);
            }
        }

        public int compareTo (Vertex other) {
            return Integer.compare(dist, other.dist);
        }
    }

    public Graph (Edge[] edges) {
        graph = new HashMap<>(edges.length);

           for (Edge e : edges) {
            if (!graph.containsKey(e.v1)) graph.put(e.v1, new Vertex(e.v1));
            if (!graph.containsKey(e.v2)) graph.put(e.v2, new Vertex(e.v2));
        }

           for (Edge e : edges) {
            graph.get(e.v1).neighbours.put(graph.get(e.v2), e.dist);
        }
    }

     public void dijkstra (String startName) {
        if (!graph.containsKey(startName)) {
            System.err.printf("Graph doesn't contain start vertex \"%s\"\n", startName);
            return;
        }
        final Vertex source = graph.get(startName);
        NavigableSet<Vertex> q = new TreeSet<>();


        for (Vertex v : graph.values()) {
            v.previous = v == source ? source : null;
            v.dist = v == source ? 0 : Integer.MAX_VALUE;
            q.add(v);
        }

        dijkstra(q);
    }

    private void dijkstra (final NavigableSet<Vertex> q) {
        Vertex u, v;
        while (!q.isEmpty()) {

            u = q.pollFirst();
            if (u.dist == Integer.MAX_VALUE)
                break;
            for (Map.Entry<Vertex, Integer> a : u.neighbours.entrySet()) {
                v = a.getKey();

                final int alternateDist = u.dist + a.getValue();
                if (alternateDist < v.dist) {
                    q.remove(v);
                    v.dist = alternateDist;
                    v.previous = u;
                    q.add(v);
                }
            }
        }
    }

    public void printPath (String endName) {
        if (!graph.containsKey(endName)) {
            System.err.printf("Graph doesn't contain end vertex \"%s\"\n", endName);
            return;
        }

        graph.get(endName).printPath();
        System.out.println();
    }

     public void printAllPaths ( ) {
        for (Vertex v : graph.values()) {
            v.printPath();
            System.out.println();
        }
    }
}
