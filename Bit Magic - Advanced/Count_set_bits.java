class Solution {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            int x = highestPowerOf2(n);
            count += x * (1 << (x - 1)) + (n - (1 << x) + 1);
            n = n - (1 << x);
        }
        return count;
    }

    private static int highestPowerOf2(int n) {
        int x = 0;
        while ((1 << (x + 1)) <= n) {
            x++;
        }
        return x;
    }
}
