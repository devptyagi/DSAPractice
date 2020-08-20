public static int getLargestElementIndex(int[] a) {
        int res = 0;
        for(int i = 1; i < a.length; i++) {
            if(a[i] > a[res]) res = i;
        }
        return res;
    }
