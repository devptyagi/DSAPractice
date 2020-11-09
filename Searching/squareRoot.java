static int squareRoot(int x) {
  int low = 1, high = x;
  int ans = -1;
  while(low <= high) {
    int mid = (low + high) / 2;
    if(mid * mid == x) return mid;
    else if(mid * mid > x) high = mid - 1;
    else {
      low = mid + 1;
      ans = mid;
    }
  }
  return ans;
}
