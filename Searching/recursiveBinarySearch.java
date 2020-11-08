static int binarySearch(int[] a, int x) {
  return binarySearch(a, x, 0, a.length - 1);
}

static int binarySearch(int[] a, int x, int low, int high) {
  if(low > high) return -1;
  int mid = (low + high) / 2;
  if(a[mid] == x) return mid;
  else if(a[mid] > x) return binarySearch(a, x, low, mid - 1);
  else return binarySearch(a, x, mid + 1, high);
}
