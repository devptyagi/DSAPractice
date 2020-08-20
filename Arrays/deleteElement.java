public static int deleteElement(int[] a, int size, int element) {
        int i;
        for(i = 0; i < size; i++) {
            if(a[i] == element) break;
        }
        if(i == size) return size;
        for(int j = i; j < size - 1; j++) {
            a[j] = a[j + 1];
        }
        return (size - 1);
    }
