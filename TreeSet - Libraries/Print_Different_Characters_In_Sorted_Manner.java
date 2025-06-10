class Solution {
    public static String Sorted_Characters(String s) {
        boolean[] present = new boolean[26];
        for (char c : s.toCharArray()) {
            present[c - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (present[i]) sb.append((char)('a' + i));
        }
        return sb.toString();
    }
}
