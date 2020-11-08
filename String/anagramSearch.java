// Given a text and a pattern, the task is to find if there is anagram of pattern present in text.

static int CHAR = 256;

static boolean anagramSearch(String text, String pattern) {
  int[] ct = new int[CHAR];
  int[] cp = new int[CHAR];
  for(int i=0;i<pattern.length();i++) {
    ct[text.charAt(i)]++;
    cp[pattern.charAt(i)]++;
  }
  for(int i=pattern.length();i<text.length();i++) {
    if(areSame(ct, cp)) return true;
    ct[text.charAt(i)]++;
    ct[text.charAt(i - pattern.length())]--;
  }
  return false;
}

static boolean areSame(int[] a, int[] b) {
  for(int i=0;i<CHAR;i++) {
    if(a[i] != b[i]) return false;
  }
  return true;
}
