/*

There is a row of N houses, each house can be painted with one of the 3 colors: RED, BLUE, GREEN. The cost of painting each house with a certain color is different.
You have to paint all houses such that no adjacent houses have the same color. Find the minimum cost of painting all houses.

*/


static final int RED = 0, BLUE = 1, GREEN = 2;

static int minCost(int[][] cost) {
  int[][] dp = new int[cost.length][cost[0].length];
  for(int[] row : dp) {
    Arrays.fill(row, -1);
  }
  int costRed = minCost(cost, 0, RED, dp);
  int costBlue = minCost(cost, 0, BLUE, dp);
  int costGreen = minCost(cost, 0, GREEN, dp);
  return Math.min(costRed, Math.min(costBlue, costGreen));
}

static int minCost(int[][] cost, int i, int color, int[][] dp) {
  if(i == cost.length) return 0;
  if(dp[i][color] != -1) {
    return dp[i][color];
  }
  switch(color) {
    case RED: {
      int costBlue = minCost(cost, i + 1, BLUE, dp);
      int costGreen = minCost(cost, i + 1, GREEN, dp);
      return dp[i][color] = cost[i][RED] + Math.min(costGreen, costBlue);
    }
    case BLUE: {
      int costRed = minCost(cost, i + 1, RED, dp);
      int costGreen = minCost(cost, i + 1, GREEN, dp);
      return dp[i][color] = cost[i][RED] + Math.min(costGreen, costRed);
    }
    case GREEN: {
      int costRed = minCost(cost, i + 1, RED, dp);
      int costBlue = minCost(cost, i + 1, BLUE, dp);
      return dp[i][color] = cost[i][RED] + Math.min(costBlue, costRed);
    }
  }
  return 0;
}
