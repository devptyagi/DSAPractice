static void merge(int[] a, int[] b) {
  int m = a.length;
  int n = b.length;
  int i = 0, j = 0;
  while(i < m && j < n) {
    if(a[i] < b[j]) {
      System.out.print(a[i++] + " ");
    } else {
      System.out.print(b[j++] + " ");
    }
  }
  while(i < m) System.out.print(a[i++] + " ");
  while(j < n) System.out.print(b[j++] + " ");
}
