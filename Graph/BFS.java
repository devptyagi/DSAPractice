static void BFS(ArrayList<ArrayList<Integer>> adj, int n, int source) {
    boolean[] visited = new boolean[n];
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
