class Solution {
    int closer(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) return mid;
            if (mid - 1 >= l && arr[mid - 1] == x) return mid - 1;
            if (mid + 1 <= r && arr[mid + 1] == x) return mid + 1;
            if (arr[mid] > x) r = mid - 2;
            else l = mid + 2;
        }
        return -1;
    }
}
