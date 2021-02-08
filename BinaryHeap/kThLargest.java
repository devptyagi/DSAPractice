public static int KthLargest(int arr[], int n, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int i=0;i<k;i++) {
        pq.add(arr[i]);
    }
    for(int i=k;i<n;i++) {
        if(arr[i] > pq.peek()) {
            pq.poll();
            pq.add(arr[i]);
        }
    }
    return pq.peek();
}
