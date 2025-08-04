class Solution {
    public static int grayToBinary(int n) {
        int res = n;
        while (n > 0) {
            n = n >> 1;
            res = res ^ n;
        }
        return res;
    }
}
