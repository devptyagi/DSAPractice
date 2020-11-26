int rowWithMax1s(int arr[][], int n, int m) {
    int maxOne = -1, index = -1;
    for(int i=0;i<n;i++) {
        int firstOccurence = firstOne(arr[i]);
        if(firstOccurence == -1) continue;
        int oneCount = m - firstOccurence + 1;
        if(oneCount > maxOne) {
            maxOne = oneCount;
            index = i;
        }
    }
    return index;
}

int firstOne(int[] a) {
    int low = 0, high = a.length - 1;
    while(low <= high) {
        int mid = (low + high) / 2;
        if(a[mid] == 1) {
            if(mid == 0 || a[mid - 1] != 1) return mid;
            else high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return -1;
}
