static void selectionSort(int[] a) {
  for(int i=0;i<a.length-1;i++) {
    int minIndex = i;
    for(int j=i+1;j<a.length;j++) {
      if(a[j] < a[minIndex]) {
        minIndex = j;
      }
    }
    swap(a, i, minIndex);
  }
}

static void swap(int[] a, int x, int y) {
  int temp = a[x];
  a[x] = a[y];
  a[y] = temp;
}
