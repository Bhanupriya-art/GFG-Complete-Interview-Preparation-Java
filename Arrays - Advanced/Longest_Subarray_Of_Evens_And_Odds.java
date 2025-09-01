class Solution {
    public static int maxEvenOdd(int arr[]) {
        int n = arr.length;
        int maxLen = 1, currLen = 1;
        for (int i = 1; i < n; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            } else {
                currLen = 1;
            }
        }
        return maxLen;
    }
}
