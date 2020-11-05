/*
Input: 
s = "catsanddogs"
dict = {"cat", "cats", "sand", "and", "dogs"}

Output:
[cat, sand, dogs]
[cats, and, dogs]
*/


private static void wordBreak(String s, Set<String> dict) {
  wordBreak(s, dict, new ArrayList<String>());
}

private static void wordBreak(String s, Set<String> dict, ArrayList<String> partial) {
  if(s.length() == 0) {
    System.out.println(Arrays.toString(partial.toArray()));
    return;
  }
  for(int i=0;i<s.length();i++) {
    String word = s.substring(0, i+1);
    if(dict.contains(word)) {
      partial.add(word);
      wordBreak(s.substring(i+1), dict, partial);
      partial.remove(partial.size() - 1);
    }
  }
}
