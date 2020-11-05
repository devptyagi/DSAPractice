static void printAnagrams(String s) {
  printAnagrams(s, new StringBuilder(), new boolean[s.length()]);
}

static void printAnagrams(String s, StringBuilder partial, boolean[] used) {
  if(partial.length() == s.length()) {
    System.out.println(partial.toString());
    return;
  }
  for(int i=0;i<s.length();i++) {
    if(!used[i]) {
      used[i] = true;
      char c = s.charAt(i);
      partial.append(c);
      printAnagrams(s, partial, used);
      used[i] = false;
      if(partial.length() > 0){
        partial.deleteCharAt(partial.length() - 1);
      }
    }
  }
}
