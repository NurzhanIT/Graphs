import java.util.*;

public class Search<Vertex> {
    protected final Vertex source;
    protected Set<Vertex> marked;
    protected Map<Vertex, Vertex> edgeTo;

    public Search(Vertex source) {
        this.source = source;
        marked = new HashSet<>();
        edgeTo = new HashMap<>();
    }

    public boolean hasPathTo(Vertex v) {
        return marked.contains(v);
    }

    public void print(Vertex v) {
        if (!hasPathTo(v)) return;
        LinkedList<Vertex> ls = new LinkedList<>();
        for (Vertex i = v; i != source; i = edgeTo.get(i)) ls.push(i);

        ls.push(source);
        System.out.println(ls);
    }
}