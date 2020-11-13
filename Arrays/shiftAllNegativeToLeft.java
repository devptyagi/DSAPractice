static void shiftNegative(int[] a) {
  int l = 0, r = a.length - 1;
  while(l <= r) {
    if(a[l] < 0 && a[r] < 0) {
      l++;
    } else if(a[l] > 0 && a[r] < 0) {
      int temp = a[l];
      a[l] = a[r];
      a[r] = temp;
      r--;
      l++;
    } else if(a[l] > 0 && a[r] > 0) {
      r--;
    } else {
      r--;
      l++;
    }
  }
}
