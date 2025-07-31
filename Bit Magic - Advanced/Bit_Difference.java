class Solution {
    public static int countBitsFlip(int a, int b) {
        int xor = a ^ b;
        int count = 0;
        while (xor != 0) {
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }
}
