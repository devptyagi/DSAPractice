static void DFS(List<List<Integer>> adj, int source, boolean[] visited) {
  visited[source] = true;
  System.out.print(source + " ");
  for(int u : adj.get(source)) {
    if(!visited[u]) {
      DFS(adj, u, visited);
    }
  }
}

static void DFS(List<List<Integer>> adj, int n) {
  boolean[] visited = new boolean[n];
  for(int i=0;i<n;i++) {
    if(!visited[i]) DFS(adj, i, visited);
  }
}
