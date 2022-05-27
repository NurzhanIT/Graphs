import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<Vertex> extends Search<Vertex>{
    public BreadthFirstSearch(WeightedGraph<Vertex> graph, Vertex source) {
        super(source);
        firstSearch(graph, source);
    }

    private void firstSearch(WeightedGraph<Vertex> graph, Vertex current) {
        marked.add(current);
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(current);
        while (!queue.isEmpty()) {
            Vertex v = queue.remove();
            for (Vertex vertex : graph.adjacencyList(v)) {
                if (!marked.contains(vertex)) {
                    marked.add(vertex);
                    edgeTo.put(vertex, v);
                    queue.add(vertex);
                }
            }
        }
    }
}
