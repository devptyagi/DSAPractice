public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k) {
    while(k-- != 0) {
        deque.addLast(deque.pollFirst());
    }
}

public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k) {
    while(k-- != 0) {
        deque.addFirst(deque.pollLast());
    }
}
