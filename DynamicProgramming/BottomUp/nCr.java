static int nCr(int n, int r) {
  int[][] dp = new int[n+1][r+1];
  for(int i=0;i<=n;i++) {
    dp[i][0] = 1;
    if(i <= r) dp[i][i] = 1;
  }
  for(int i=1;i<=n;i++) {
    for(int j=1;j<=r;j++) {
      dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
    }
  }
  return dp[n][r];
}
