class Solution {
    static boolean search(String pat, String txt) {
        int n = txt.length();
        int m = pat.length();
        
        if (m > n) return false;
        
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && txt.charAt(i + j) == pat.charAt(j)) {
                j++;
            }
            if (j == m) return true;
        }
        return false;
    }
}
