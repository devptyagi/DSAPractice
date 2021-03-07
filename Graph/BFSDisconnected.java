static void BFS(List<List<Integer>> adj, int source, boolean[] visited) {
    Queue<Integer> q = new LinkedList<>();
    visited[source] = true;
    q.add(source);
    while(!q.isEmpty()) {
        int u = q.poll();
        System.out.print(u + " ");
        for(int v: adj.get(u)) {
            if(!visited[v]) {
                visited[v] = true;
                q.add(v);
            }
        }
    }
}

static void BFSDisconnected(List<List<Integer>> adj, int n) {
    boolean[] visited = new boolean[n + 1];
    for(int i=0;i<n;i++) {
        if(!visited[i]) {
            BFS(adj, i, visited);
        }
    }
}
