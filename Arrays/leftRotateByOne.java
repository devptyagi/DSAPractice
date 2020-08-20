public static void leftRotateByOne(int[] a) {
    int temp = a[0];
    int n = a.length;
    for(int i=0;i<n-1;i++) {
        a[i] = a[i + 1];
    }
    a[n - 1] = temp;
}
