class Solution {
    public double termOfGP(int a, int b, int n) {
        double r = (double)b / a;
        return a * Math.pow(r, n - 1);
    }
}
