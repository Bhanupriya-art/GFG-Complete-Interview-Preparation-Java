class Solution {
    public void threeWayPartition(int arr[], int a, int b) {
        int start = 0, end = arr.length - 1, i = 0;
        while (i <= end) {
            if (arr[i] < a) {
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                start++;
                i++;
            } else if (arr[i] > b) {
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
            } else {
                i++;
            }
        }
    }
}
