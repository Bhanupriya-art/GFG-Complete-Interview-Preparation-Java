class Solution {

    public static boolean isPanagram(String str) {
        boolean[] seen = new boolean[26];
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }
        for (boolean b : seen) {
            if (!b) return false;
        }
        return true;
    }
}
