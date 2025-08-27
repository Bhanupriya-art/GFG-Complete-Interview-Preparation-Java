class Solution {
    int maxIndexDiff(int[] arr) {
        int n = arr.length;
        int[] leftMin = new int[n];
        int[] rightMax = new int[n];
        
        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++) leftMin[i] = Math.min(arr[i], leftMin[i - 1]);
        
        rightMax[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) rightMax[j] = Math.max(arr[j], rightMax[j + 1]);
        
        int i = 0, j = 0, maxDiff = -1;
        while (i < n && j < n) {
            if (leftMin[i] < rightMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }
        return maxDiff;
    }
}
