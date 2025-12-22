class Solution {
    public int findRank(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            if (freq[c - 'a']++ > 0) return 0;
        }

        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) fact[i] = fact[i - 1] * i;

        int rank = 1;
        for (int i = 0; i < n; i++) {
            int smaller = 0;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) < s.charAt(i)) smaller++;
            }
            rank += smaller * fact[n - i - 1];
        }
        return rank;
    }
}
