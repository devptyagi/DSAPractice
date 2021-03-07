static void BFS(List<List<Integer>> adj, int source, boolean[] visited) {
    Queue<Integer> q = new LinkedList<>();
    visited[source] = true;
    q.add(source);
    while(!q.isEmpty()) {
        int u = q.poll();
        for(int v: adj.get(u)) {
            if(!visited[v]) {
                visited[v] = true;
                q.add(v);
            }
        }
    }
}

static int CountConnected(List<List<Integer>> adj, int n) {
    int count = 0;
    boolean[] visited = new boolean[n + 1];
    for(int i=0;i<n;i++) {
        if(!visited[i]) {
            BFS(adj, i, visited);
            count++;
        }
    }
    return count;
}
