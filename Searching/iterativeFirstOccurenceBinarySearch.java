static int binarySearchFirstOccurence(int[] a, int x) {
  int low = 0;
  int high = a.length - 1;
  while(low <= high) {
    int mid = (low + high) / 2;
    if(a[mid] == x) {
      if(mid != 0 && a[mid - 1] == x) high = mid - 1;
      else return mid;
    } else if(a[mid] > x) {
      high = mid - 1;
    }
    else {
      low = mid + 1;
    }
  }
  return -1;
}
