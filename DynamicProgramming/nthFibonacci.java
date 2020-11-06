static int fib(int n) {
  return fib(n, new int[n + 1]);
}

static int fib(int n, int[] dp) {
  if(n == 1) return 0;
  if(n == 2) return 1;
  if(dp[n] != 0) return dp[n];
  int res = fib(n - 1, dp) + fib(n - 2, dp);
  dp[n] = res;
  return res;
}
