    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static void moveZeroToEnd(int[] a) {
        int count = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] != 0) {
                swap(a, i, count);
                count++;
            }
        }
    }
