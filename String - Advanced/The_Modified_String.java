class Solution {
    public int modified(String s) {
        int n = s.length();
        int count = 1;
        int ans = 0;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                ans += (count - 1) / 2;
                count = 1;
            }
        }
        ans += (count - 1) / 2;
        return ans;
    }
}
