static void combinationSum(int[] a, int target) {
  Arrays.sort(a);
  combinationSum(a, target, 0, new ArrayList<Integer>(), 0);
}

static void combinationSum(int[] a, int target, int sum, List<Integer> partial, int start) {
  if(sum == target) {
    System.out.println(Arrays.toString(partial.toArray()));
    return;
  }
  for(int i=start;i<a.length;i++) {
    int c = a[i];
    if(c + sum > target || i > start && a[i - 1] == a[i]) {
      continue;
    }
    partial.add(c);
    combinationSum(a, target, sum + c, partial, i + 1);
    partial.remove(partial.size() - 1);
  }
}
