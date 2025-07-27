class Solution {
    public static int getFirstSetBit(int n) {
        if (n == 0) return 0;
        return Integer.numberOfTrailingZeros(n) + 1;
    }
}
