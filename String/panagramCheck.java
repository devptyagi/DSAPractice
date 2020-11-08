/* 
You are given a string s. You need to find if the string is a panagram or not.
A panagram contains all the letters of english alphabet at least once.
*/

public static boolean isPanagram(String str) {
    String s = str.toLowerCase();
    int[] ch = new int[26];
    for(int i=0;i<s.length();i++) {
        ch[s.charAt(i) - 'a']++;
    }
    for(int i : ch) {
        if(i == 0) return false;
    }
    return true;
}
