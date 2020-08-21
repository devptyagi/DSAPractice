static int countNonRepeated(int arr[], int n) {
    Map<Integer, Integer> map = new HashMap<>();
    for(int i : arr) {
        if(map.get(i) != null) {
            map.put(i, map.get(i) + 1);
        } else {
            map.put(i, 1);
        }
    }
    int count = 0;
    for(Map.Entry<Integer, Integer> e : map.entrySet()) {
        if(e.getValue() == 1) count++;
    }
    return count;
}
