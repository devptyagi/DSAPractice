static int binarySearchFirstOccurence(int[] a, int x) {
  return binarySearchFirstOccurence(a, x, 0, a.length - 1);
}

static int binarySearchFirstOccurence(int[] a, int x, int low, int high) {
  if(low > high) return -1;
  int mid = (low + high) / 2;
  if(a[mid] == x) {
    if(mid != 0 && a[mid - 1] == x) return binarySearchFirstOccurence(a, x, low, mid - 1);
    return mid;
  }
  else if(a[mid] > x) return binarySearchFirstOccurence(a, x, low, mid - 1);
  else return binarySearchFirstOccurence(a, x, mid + 1, high);
}
