class Solution {
    public int countPairs(int x[], int y[]) {
        Arrays.sort(y);
        int n = y.length;
        int[] countY = new int[5];
        for (int val : y) if (val < 5) countY[val]++;
        int total = 0;
        for (int a : x) {
            if (a == 0) continue;
            if (a == 1) {
                total += countY[0];
                continue;
            }
            int idx = upperBound(y, a);
            total += (n - idx);
            total += countY[0] + countY[1];
            if (a == 2) total -= (countY[3] + countY[4]);
            if (a == 3) total += countY[2];
        }
        return total;
    }

    private int upperBound(int[] arr, int val) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] <= val) l = m + 1;
            else r = m;
        }
        return l;
    }
}
