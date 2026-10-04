import java.util.ArrayList;
import java.util.List;

class Graph {
    private int vertices;
    private List<List<Integer>> adjList;

    // Constructor
    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        // For an undirected graph, uncomment the line below:
        // adjList.get(destination).add(source);
    }

    // Main DFS method
    public void dfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        System.out.print("DFS Traversal starting from vertex " + startVertex + ": ");
        dfsHelper(startVertex, visited);
        System.out.println();
    }

    // Recursive helper method for DFS
    private void dfsHelper(int vertex, boolean[] visited) {
        // Mark the current node as visited and print it
        visited[vertex] = true;
        System.out.print(vertex + " ");

        // Recur for all the vertices adjacent to this vertex
        for (int neighbor : adjList.get(vertex)) {
            if (!visited[neighbor]) {
                dfsHelper(neighbor, visited);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a graph with 5 vertices (numbered 0 to 4)
        Graph graph = new Graph(5);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);

        // Execute DFS traversal
        graph.dfs(0);
    }
}
