static void DFS(List<List<Integer>> adj, int source, boolean[] visited) {
  visited[source] = true;
  System.out.print(source + " ");
  for(int u : adj.get(source)) {
    if(!visited[u]) {
      DFS(adj, u, visited);
    }
  }
}

static void DFS(List<List<Integer>> adj, int n, int source) {
  boolean[] visited = new boolean[n];
  DFS(adj, source, visited);
}
