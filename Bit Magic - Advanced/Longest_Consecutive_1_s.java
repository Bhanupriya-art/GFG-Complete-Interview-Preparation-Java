class Solution {
    public static int maxConsecutiveOnes(int n) {
        int maxCount = 0, count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
            n >>= 1;
        }
        return maxCount;
    }
}
