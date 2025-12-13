class Solution {
    public static int minIndexChar(String s1, String s2) {
        boolean[] present = new boolean[26];
        for (int i = 0; i < s2.length(); i++) {
            present[s2.charAt(i) - 'a'] = true;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (present[s1.charAt(i) - 'a']) {
                return i;
            }
        }
        return -1;
    }
}
