class DisjointSet {
    int[] parent;
    int[] rank;
    
    DisjointSet(int n) {
        parent = new int[n];
        rank = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }
    
    int findParent(int v) {
        if(v == parent[v]) {
            return v;
        }
        return parent[v] = findParent(parent[v]);
    }
    
    void union(int u, int v) {
        u = findParent(u);
        v = findParent(v);
        if(u != v) {
            if(rank[u] < rank[v]) {
                parent[u] = v;
            } else if(rank[u] > rank[v]) {
                parent[v] = u;
            } else {
                parent[u] = v;
                rank[v]++;
            }
        }
    }
    
}
