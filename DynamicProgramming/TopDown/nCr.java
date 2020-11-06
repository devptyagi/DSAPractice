static int nCr(int n, int r) {
  return nCr(n, r, new int[n+1][r+1]);
}

static int nCr(int n, int r, int[][] dp) {
  if(n == r || r == 0) return 1;
  if(dp[n][r] != 0) return dp[n][r];
  int ans = nCr(n-1, r-1) + nCr(n-1, r);
  dp[n][r] = ans;
  return ans;
}
