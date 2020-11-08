public static boolean isAnagram(String s1,String s2) {
    int[] ch = new int[26];
    for(int i=0;i<s1.length();i++) ch[s1.charAt(i) - 'a']++;
    for(int i=0;i<s2.length();i++) ch[s2.charAt(i) - 'a']--;
    for(int i : ch) if(i != 0) return false;
    return true;
}
