static void swap(int[] a, int i, int j) {
  int temp = a[i];
  a[i] = a[j];
  a[j] = temp;
}

static int partition(int[] a, int l, int r) {
  int pivot = a[r];
  int i = l - 1;
  for(int j=l;j<r;j++) {
    if(a[j] < pivot) {
      i++;
      swap(a, i, j);
    }
  }
  swap(a, i + 1, r);
  return i + 1;
}

static void quickSort(int[] a, int l, int r) {
  if(l < r) {
    int pi = partition(a, l, r);
    quickSort(a, l, pi - 1);
    quickSort(a, pi + 1, r);
  }
}

static void quickSort(int[] a) {
  quickSort(a, 0, a.length - 1);
}
