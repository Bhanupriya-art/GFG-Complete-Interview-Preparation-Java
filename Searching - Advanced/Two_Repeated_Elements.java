class Solution {
    public int[] twoRepeated(int[] arr) {
        int n = arr.length - 2;
        int[] res = new int[2];
        int idx = 0;
        boolean[] seen = new boolean[n + 1];
        for (int x : arr) {
            if (seen[x]) {
                res[idx++] = x;
                if (idx == 2) break;
            } else {
                seen[x] = true;
            }
        }
        return res;
    }
}
