static void permutation(int[] a) {
  permutation(a, new ArrayList<Integer>(), new boolean[a.length]);
}

static void permutation(int[] a, ArrayList<Integer> partial, boolean[] used) {
  if(partial.size() == a.length) {
    System.out.println(Arrays.toString(partial.toArray()));
    return;
  }
  for(int i=0;i<a.length;i++) {
    if(!used[i]) {
      used[i] = true;
      partial.add(a[i]);
      permutation(a, partial, used);
      used[i] = false;
      partial.remove(partial.size() - 1);
    }
  }
}
