import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Kruskals {

    static class Edge {
        int source;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.source = s;
            this.dest = d;
            this.weight = w;
        }
    }

    // Union-Find Algorithm.
    static int findParent(int v, int[] parent) {
        if(parent[v] == v) {
            return v;
        }
        return findParent(parent[v], parent);
    }

    static void kruskals(Edge[] input, int n, int E) {
        // Sort the edges in ascending order of Weights.
        Arrays.sort(input, Comparator.comparingInt(o -> o.weight));

        Edge[] output = new Edge[n - 1];

        // Array for Union-Find Cycle Detection Algorithm.
        int[] parent = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int count = 0;
        int i = 0;

        while(count != n - 1) {
            Edge currentEdge = input[i];

            // Use Union-Find Algorithm for detecting cycle in a graph.
            int sourceParent = findParent(currentEdge.source, parent);
            int destParent = findParent(currentEdge.dest, parent);

            // Add current graph into the output only if it does not create a cycle.
            if(sourceParent != destParent) {
                output[count] = currentEdge;
                count++;
                parent[sourceParent] = destParent;
            }
            i++;
        }

        // Print the edges of the MST.
        for(i = 0; i < n - 1; i++) {
            if(output[i].source < output[i].dest) {
                System.out.println(output[i].source + " " + output[i].dest + " " + output[i].weight);
            } else {
                System.out.println(output[i].dest + " " + output[i].source + " " + output[i].weight);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int E = sc.nextInt();

        Edge[] input = new Edge[E];

        for (int i = 0; i < E; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            int w = sc.nextInt();
            input[i] = new Edge(s, d, w);
        }

        kruskals(input, n, E);
    }
}
