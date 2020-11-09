static void bubbleSort(int[] a) {
  for(int i=0;i<a.length-1;i++) {
    boolean swapped = false;
    for(int j=0;j<a.length-1-i;j++) {
      if(a[j] > a[j+1]) {
        swap(a, j, j + 1);
        swapped = true;
      }
    }
    if(!swapped) break;
  }
}

static void swap(int[] a, int x, int y) {
  int temp = a[x];
  a[x] = a[y];
  a[y] = temp;
}
