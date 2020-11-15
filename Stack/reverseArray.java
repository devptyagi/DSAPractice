public static void reverseArray(int n, int arr[]) {
    Stack<Integer> s = new Stack<>();
    for(int i : arr) {
        s.push(i);
    }
    for(int i=0;i<n;i++) {
        arr[i] = s.pop();
    }
}
