class Solution {
    public static int posOfRightMostDiffBit(int m, int n) {
        if (m == n) return -1;
        int xor = m ^ n;
        return Integer.numberOfTrailingZeros(xor) + 1;
    }
}
