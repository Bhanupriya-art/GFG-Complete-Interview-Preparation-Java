class Solution {
    static int[][] sumMatrix(int A[][], int B[][]) {
        if (A.length != B.length || A[0].length != B[0].length) 
            return new int[0][0];
        int n = A.length, m = A[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = A[i][j] + B[i][j];
            }
        }
        return res;
    }
}
