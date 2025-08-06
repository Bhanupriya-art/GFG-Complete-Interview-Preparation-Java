class Solution {
    public static int swapBits(int n) {
        int evenBits = n & 0xAAAAAAAA;
        int oddBits = n & 0x55555555;
        evenBits >>= 1;
        oddBits <<= 1;
        return (evenBits | oddBits);
    }
}
