class Solution {
    static boolean isIsogram(String data) {
        boolean[] seen = new boolean[26];
        for (char c : data.toCharArray()) {
            int idx = c - 'a';
            if (seen[idx]) return false;
            seen[idx] = true;
        }
        return true;
    }
}
