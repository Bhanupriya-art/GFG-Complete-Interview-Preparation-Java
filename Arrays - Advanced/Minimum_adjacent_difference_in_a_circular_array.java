class Solution {
    public static int minAdjDiff(int arr[], int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            min = Math.min(min, Math.abs(arr[i] - arr[i + 1]));
        }
        min = Math.min(min, Math.abs(arr[0] - arr[n - 1]));
        return min;
    }
}
