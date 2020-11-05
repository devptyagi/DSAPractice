static void combination(int[] a, int k) {
  combination(a, k, new HashSet<Integer>(), 0);
}

static void combination(int[] a, int k, HashSet<Integer> set, int start) {
  if(set.size() == k) {
    System.out.println(set);
    return;
  }
  if(start == a.length) return;
  for(int i=start;i<a.length;i++) {
    set.add(a[i]);
    combination(a, k, set, i + 1);
    set.remove(a[i]);
  }
}
