static int knapsack(int[] w, int[] v, int weight) {
  int n = w.length;
  int[][] dp = new int[n + 1][weight + 1];
  for(int i=1;i<=n;i++) {
    for(int j=1;j<=weight;j++) {
      if(w[i - 1] <= j) {
        dp[i][j] = Math.max((v[i - 1] + dp[i - 1][j - w[i - 1]]), dp[i - 1][j]);
      } else {
        dp[i][j] = dp[i - 1][j];
      }
    }
  }
  return dp[n][weight];
}
