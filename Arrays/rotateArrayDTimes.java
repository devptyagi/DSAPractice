static void reverse(int[] a, int i, int j) {
    while(i < j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        i++;
        j--;
    }
} 

static void rotateArr(int arr[], int d, int n) {
    reverse(arr, 0, d-1);
    reverse(arr, d, n-1);
    reverse(arr, 0, n-1);
}
