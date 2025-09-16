class Solution {
    public static int findMedian(int arr[], int n, int brr[], int m) {
        if (n > m) return findMedian(brr, m, arr, n);
        int low = 0, high = n, total = n + m, half = (total + 1) / 2;
        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = half - cut1;
            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : arr[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : brr[cut2 - 1];
            int r1 = (cut1 == n) ? Integer.MAX_VALUE : arr[cut1];
            int r2 = (cut2 == m) ? Integer.MAX_VALUE : brr[cut2];
            if (l1 <= r2 && l2 <= r1) {
                if (total % 2 == 0)
                    return (int)Math.floor((Math.max(l1, l2) + Math.min(r1, r2)) / 2.0);
                else
                    return Math.max(l1, l2);
            } else if (l1 > r2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }
        return 0;
    }
}
