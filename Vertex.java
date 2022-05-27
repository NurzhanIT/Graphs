import java.util.*;

public class Vertex<V> {
    private final Map<Vertex<V>, Double> adjacentVertices;

    public Vertex(V data, Map<Vertex<V>, Double> adjacentVertices) {
        this.adjacentVertices = adjacentVertices;
    }

    public void addAdjacentVertices(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }

    public Vertex<V> getVertex(Vertex<V> v) {
        return v;
    }
}