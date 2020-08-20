/*

I/P : a[] = {5, 10, 20, _, _}

        element = 7
        pos = 2
        
O/P : a[] = {5, 7, 10, 20, _}

*/


public static int insert(int[] a, int size, int element, int pos, int capacity) {
        if(size == capacity)
                return size;
        int idx = pos - 1;
        for(int i = size - 1; i >= idx; i--) {
                a[i + 1] = a[i];
        }
        a[idx] = element;
        return size + 1;
}
