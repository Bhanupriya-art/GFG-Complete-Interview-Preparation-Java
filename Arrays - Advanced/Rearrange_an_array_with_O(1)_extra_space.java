class Solution {
    public void arrange(long[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] += (arr[(int)arr[i]] % n) * n;
        }
        for (int i = 0; i < n; i++) {
            arr[i] /= n;
        }
    }
}
