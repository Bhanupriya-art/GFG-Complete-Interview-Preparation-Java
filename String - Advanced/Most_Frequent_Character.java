class Solution {
    public char getMaxOccuringChar(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        char ans = 'a';
        int max = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                max = freq[i];
                ans = (char)(i + 'a');
            }
        }
        return ans;
    }
}
