class Solution {
    public static int greyConverter(int n) {
        return n ^ (n >> 1);
    }
}
