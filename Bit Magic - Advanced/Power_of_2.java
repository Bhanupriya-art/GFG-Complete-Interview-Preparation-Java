class Solution {
    public static boolean isPowerofTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
