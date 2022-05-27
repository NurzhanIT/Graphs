class Main {
    public static void main(String[] args) {
        WeightedGraph<String> weightedGraph = new WeightedGraph<>(true);

        weightedGraph.putEdge("A", "B", 1);
        weightedGraph.putEdge("A", "C", 2);
        weightedGraph.putEdge("B", "D", 3);
        weightedGraph.putEdge("B", "E", 5);
        weightedGraph.putEdge("C", "B", 4);
        weightedGraph.putEdge("C", "D", 4);
        weightedGraph.putEdge("C", "E", 5);

        System.out.print("DijkstraSearch: ");
        Search<String> dijkstraSearch = new DijkstraSearch<>(weightedGraph, "A");
        dijkstraSearch.print("E");

        System.out.print("BreadthFirstSearch: ");
        Search<String> breadthFirstSearch = new BreadthFirstSearch<>(weightedGraph, "A");
        breadthFirstSearch.print("E");
    }
}