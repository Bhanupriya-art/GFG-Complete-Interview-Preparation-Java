class Solution {
    public int modInverse(int n, int m) {
        for (int x = 1; x < m; x++) {
            if ((n * x) % m == 1) return x;
        }
        return -1;
    }
}
