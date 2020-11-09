static void mergeSort(int[] a) {
  mergeSort(a, 0, a.length - 1);
}

static void mergeSort(int[] a, int l, int r) {
  if(r > l) {
    int m = l + (r - l) / 2;
    mergeSort(a, l, m);
    mergeSort(a, m + 1, r);
    merge(a, l, r, m);
  }
}

static void merge(int[] a, int l, int r, int m) {
  int[] left = new int[m - l + 1];
  int[] right = new int[r - m];
  for(int i=0;i<left.length;i++) left[i] = a[l + i];
  for(int i=0;i<right.length;i++) right[i] = a[m + 1 + i];
  int i = 0, j = 0, k = l;
  while(i < left.length && j < right.length) {
    if(left[i] <= right[j]) a[k++] = left[i++];
    else a[k++] = right[j++];
  }
  while(i < left.length) a[k++] = left[i++];
  while(j < right.length) a[k++] = right[j++];
}
