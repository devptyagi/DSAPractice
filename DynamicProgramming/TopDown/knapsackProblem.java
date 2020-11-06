static int knapsack(int[] w, int[] v, int weight) {
  int[][] dp = new int[weight + 1][w.length + 1];
  for(int i=0;i<=weight;i++) {
    for(int j=0;j<=w.length;j++) {
      dp[i][j] = -1;
    }
  }
  return knapsack(w, v, weight, w.length - 1, dp);
}

static int knapsack(int[] w, int[] v, int weight, int i, int[][] dp) {
  if(i == -1 || weight == 0) return 0;
  if(dp[weight][i] != -1) return dp[weight][i];
  if(w[i] <= weight) {
    int include = v[i] + knapsack(w, v, weight - w[i], i - 1, dp);
    int exclude = knapsack(w, v, weight, i - 1, dp);
    dp[weight][i] = Math.max(include, exclude);
    return dp[weight][i];
  } else {
    dp[weight][i] = knapsack(w, v, weight, i - 1, dp);
    return dp[weight][i];
  }
}
