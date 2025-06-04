class Solution {
    static class Pair {
        long x;
        long y;

        Pair(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    public static Pair findRepeating(long arr[], int n) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid > 0 && arr[mid] == arr[mid - 1]) {
                long count = high - low + 1 - (arr[high] - arr[low] + 1) + 1;
                return new Pair(arr[mid], count);
            } else if (arr[mid] - arr[low] > mid - low) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new Pair(-1, -1);
    }
}
