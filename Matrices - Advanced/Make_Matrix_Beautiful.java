class Solution {
    public static int balanceSums(int[][] mat) {
        int n = mat.length;
        int[] rowSum = new int[n];
        int[] colSum = new int[n];
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += mat[i][j];
                colSum[j] += mat[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, Math.max(rowSum[i], colSum[i]));
        }

        int ops = 0, i = 0, j = 0;
        while (i < n && j < n) {
            int diff = Math.min(maxSum - rowSum[i], maxSum - colSum[j]);
            mat[i][j] += diff;
            rowSum[i] += diff;
            colSum[j] += diff;
            ops += diff;
            if (rowSum[i] == maxSum) i++;
            if (colSum[j] == maxSum) j++;
        }

        return ops;
    }
}
