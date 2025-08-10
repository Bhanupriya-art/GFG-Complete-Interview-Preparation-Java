class Solution {
    public static boolean isLucky(int n) {
        int counter = 2;
        while (counter <= n) {
            if (n % counter == 0) return false;
            n -= n / counter;
            counter++;
        }
        return true;
    }
}
