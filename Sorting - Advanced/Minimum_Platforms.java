class Solution {
    public int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n = arr.length;
        int i = 0, j = 0, plat_needed = 0, result = 0;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                plat_needed++;
                result = Math.max(result, plat_needed);
                i++;
            } else {
                plat_needed--;
                j++;
            }
        }
        return result;
    }
}
