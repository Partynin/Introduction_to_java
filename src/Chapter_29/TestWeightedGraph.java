package Chapter_29;

public class TestWeightedGraph {
    public static void main(String[] args) throws Exception {
        String[] vertices = {"Seattle", "San Francisco", "Los Angeles",
                "Denver", "Kansas City", "Chicago", "Boston", "New York",
                "Atlanta", "Miami", "Dallas", "Houston"};

        int[][] edges = {
                {0, 1, 807}, {0, 3, 1331}, {0, 5, 2097},
                {1, 0, 807}, {1, 2, 381}, {1, 3, 1267},
                {2, 1, 381}, {2, 3, 1015}, {2, 4, 1663}, {2, 10, 1435},
                {3, 0, 1331}, {3, 1, 1267}, {3, 2, 1015}, {3, 4, 599},
                {3, 5, 1003},
                {4, 2, 1663}, {4, 3, 599}, {4, 5, 533}, {4, 7, 1260},
                {4, 8, 864}, {4, 10, 496},
                {5, 0, 2097}, {5, 3, 1003}, {5, 4, 533},
                {5, 6, 983}, {5, 7, 787},
                {6, 5, 983}, {6, 7, 214},
                {7, 4, 1260}, {7, 5, 787}, {7, 6, 214}, {7, 8, 888},
                {8, 4, 864}, {8, 7, 888}, {8, 9, 661},
                {8, 10, 781}, {8, 11, 810},
                {9, 8, 661}, {9, 11, 1187},
                {10, 2, 1435}, {10, 4, 496}, {10, 8, 781}, {10, 11, 239},
                {11, 8, 810}, {11, 9, 1187}, {11, 10, 239}
        };

        WeightedGraph<String> graph1 =
                new WeightedGraph<>(vertices, edges);
        System.out.println("The number of vertices in graph1: "
                + graph1.getSize());
        System.out.println("The vertex with index 1 is "
                + graph1.getVertex(1));
        System.out.println("The index for Miami is " +
                graph1.getIndex("Miami"));
        System.out.println("The edges for graph1:");
        graph1.printWeightedEdges();

        edges = new int[][]{
                {0, 1, 2}, {0, 3, 8},
                {1, 0, 2}, {1, 2, 7}, {1, 3, 3},
                {2, 1, 7}, {2, 3, 4}, {2, 4, 5},
                {3, 0, 8}, {3, 1, 3}, {3, 2, 4}, {3, 4, 6},
                {4, 2, 5}, {4, 3, 6}
        };
        WeightedGraph<Integer> graph2 = new WeightedGraph<>(edges, 5);
        System.out.println("\nThe edges for graph2:");
        graph2.printWeightedEdges();


        WeightedGraph<Character> graph = new WeightedGraph<>();
        graph.addVertex('U');
        graph.addVertex('V');
        int indexForU = graph.getIndex('U');
        int indexForV = graph.getIndex('V');
        System.out.println("indexForU is " + indexForU);
        System.out.println("indexForV is " + indexForV);
        graph.addEdge(indexForU, indexForV, 2.5);
        System.out.println("Degree of U is " +
                graph.getDegree(indexForU));
        System.out.println("Degree of V is " +
                graph.getDegree(indexForV));
        System.out.println("Weight of UV is " +
                graph.getWeight(indexForU, indexForV));

        WeightedGraph<Character> graph3 = new WeightedGraph<>();
        graph3.addVertex('U');
        graph3.addVertex('V');
        graph3.addVertex('X');
        indexForU = graph3.getIndex('U');
        indexForV = graph3.getIndex('V');
        int indexForX = graph3.getIndex('X');
        System.out.println("indexForU is " + indexForU);
        System.out.println("indexForV is " + indexForV);
        System.out.println("indexForX is " + indexForV);
        graph3.addEdge(indexForU, indexForV, 3.5);
        graph3.addEdge(indexForV, indexForU, 3.5);
        graph3.addEdge(indexForU, indexForX, 2.1);
        graph3.addEdge(indexForX, indexForU, 2.1);
        graph3.addEdge(indexForV, indexForX, 3.1);
        graph3.addEdge(indexForX, indexForV, 3.1);
        WeightedGraph<Character>.MST mst
                = graph3.getMinimumSpanningTree();
        graph3.printWeightedEdges();
        System.out.println(mst.getTotalWeight());
        mst.printTree();
    }
}
