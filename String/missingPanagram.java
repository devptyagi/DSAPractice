/*
You are given a string s. You need to find the missing characters in the string to make a panagram.
Note: The output characters will be lowercase and lexicographically sorted.
*/

public static String missingPanagram(String str) {
    String s = str.toLowerCase();
    int[] ch = new int[26];
    for(int i=0;i<s.length();i++) {
        ch[s.charAt(i) - 'a']++;
    }
    StringBuilder res = new StringBuilder();
    for(int i=0;i<26;i++) {
        if(ch[i] == 0) {
            res.append((char)(i+'a'));
        }
    }
    if(res.length() == 0) return "-1";
    else return res.toString();
}
