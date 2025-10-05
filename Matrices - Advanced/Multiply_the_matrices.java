class Solution {
    static boolean multiplyMatrix(int mat1[][], int mat2[][], int result[][]) {
        int n = 4;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    res[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (res[i][j] != result[i][j]) return false;
            }
        }
        return true;
    }
}
