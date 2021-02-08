class HeapSort {
    
    public static void sort(int[] a) {
        int n = a.length;
        for(int i=(n-1)/2;i>=0;i--) {
            heapify(a, n, i);
        }
        for(int i=n-1;i>0;i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, i, 0);
        }
    }
    
    public static void heapify(int[] a, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if(l < n && a[largest] < a[l]) largest = l;
        if(r < n && a[largest] < a[r]) largest = r;
        if(largest != i) {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            heapify(a, n, largest);
        }
    }
    
}
