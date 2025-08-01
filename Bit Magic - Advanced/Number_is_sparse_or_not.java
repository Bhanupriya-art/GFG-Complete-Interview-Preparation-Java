class Solution {
    public static boolean isSparse(int n) {
        return (n & (n >> 1)) == 0;
    }
}
