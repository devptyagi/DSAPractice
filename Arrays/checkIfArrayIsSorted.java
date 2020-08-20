public static boolean isSorted(int[] a) {
        for(int i = 1; i < a.length; i++) {
            if(a[i] < a[i - 1]) return false;
        }
        return true;
    }
