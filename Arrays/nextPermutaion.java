static void nextPermutation(int[] a) {
    if(a == null || a.length == 1) return;
    int i = a.length - 2;
    while(i >= 0 && a[i] >= a[i + 1]) i--;
    if(i >= 0) {
        int j = a.length - 1;
        while(a[j] <= a[i]) j--;
        swap(a, i, j);
    }
    reverse(a, i + 1, a.length - 1);
}

static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}

static void reverse(int[] a, int start, int end) {
    while(start < end) swap(a, start++, end--);
}
