import java.util.*;

public class WeightedGraph<Vertex> {
    private final boolean dir;
    private Map<Vertex, List<Edge<Vertex>>> graph = new HashMap<>();

    public WeightedGraph(boolean dir) {
        this.dir = dir;
    }

    public void putVertex(Vertex v) {
        graph.put(v, new LinkedList<>());
    }

    public void putEdge(Vertex source, Vertex dest, double weight) {
        if (hasVertex(source))
            putVertex(source);
        if (hasVertex(dest))
            putVertex(dest);
        if (hasEdge(source, dest) || source.equals(dest))
            return;
        graph.get(source).add(new Edge<>(source, dest, weight));
        if (dir)
            graph.get(dest).add(new Edge<>(dest, source, weight));
    }

    public boolean hasVertex(Vertex v) {
        return !graph.containsKey(v);
    }

    public boolean hasEdge(Vertex source, Vertex dest) {
        if (hasVertex(source)) return false;
        return graph.get(source).contains(new Edge<>(source, dest));
    }

    public Iterable<Edge<Vertex>> getEdges(Vertex v) {
        if (hasVertex(v)) return null;
        return graph.get(v);
    }

    public Iterable<Vertex> adjacencyList(Vertex v) {
        if (hasVertex(v)) return null;
        List<Vertex> vertices = new LinkedList<>();
        for (Edge<Vertex> e : graph.get(v)) {
            vertices.add(e.getDest());
        }
        return vertices;
    }
}