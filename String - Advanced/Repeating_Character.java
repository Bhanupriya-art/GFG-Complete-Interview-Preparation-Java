class Solution {
    public int repeatedCharacter(String S) {
        int[] freq = new int[256];
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (freq[c] == 1) return i;
            freq[c]++;
        }
        return -1;
    }
}
