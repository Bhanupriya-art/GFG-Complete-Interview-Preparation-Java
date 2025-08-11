class Solution {
    public int reverseExponentiation(int n) {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return (int)Math.pow(n, rev);
    }
}
