class Solution {
    static boolean search(String pat, String txt) {
        int n = txt.length(), m = pat.length();
        int[] lps = new int[m];
        int i = 1, len = 0;
        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }
        int a = 0, b = 0;
        while (a < n) {
            if (txt.charAt(a) == pat.charAt(b)) {
                a++; b++;
                if (b == m) return true;
            } else if (b > 0) {
                b = lps[b - 1];
            } else {
                a++;
            }
        }
        return false;
    }
}
