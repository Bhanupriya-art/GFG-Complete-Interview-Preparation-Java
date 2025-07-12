class Solution {

    public static int minDiff(int n, int arr[], int m) {
        if (m == 0 || n == 0 || m > n) return 0;
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < minDiff) minDiff = diff;
        }
        return minDiff;
    }
}
