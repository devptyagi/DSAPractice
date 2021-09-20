class Solution {
  
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < V; i++) {
            if(!visited[i]) {
                dfs(adj, i, stack, visited);
            }
        }
        int[] topoSort = new int[stack.size()];
        int i = 0;
        while(!stack.isEmpty()) {
            topoSort[i++] = stack.pop();
        }
        return topoSort;
    }
    
    static void dfs(ArrayList<ArrayList<Integer>> adj, int source, Stack<Integer> stack, boolean[] visited) {
        visited[source] = true;
        for(int i : adj.get(source)) {
            if(!visited[i]) {
                dfs(adj, i, stack, visited);
            }
        } 
        stack.push(source);
    }
}
