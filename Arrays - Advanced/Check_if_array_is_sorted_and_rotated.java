class Solution {
    public boolean isSortedRotated(int[] arr) {
        int n = arr.length;
        int inc = 0, dec = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) inc++;
            if (arr[i] < arr[(i + 1) % n]) dec++;
        }
        return (inc == 1 || dec == 1);
    }
}
