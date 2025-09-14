class Solution {
    public int findPages(int[] arr, int k) {
        int n = arr.length;
        if (k > n) return -1;
        int low = 0, high = 0;
        for (int pages : arr) {
            low = Math.max(low, pages);
            high += pages;
        }
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canAllocate(arr, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    
    private boolean canAllocate(int[] arr, int k, int maxPages) {
        int students = 1, pages = 0;
        for (int num : arr) {
            if (pages + num > maxPages) {
                students++;
                pages = num;
                if (students > k) return false;
            } else {
                pages += num;
            }
        }
        return true;
    }
}
