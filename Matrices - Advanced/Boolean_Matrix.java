class Solution {
    void booleanMatrix(int mat[][]) {
        int n = mat.length, m = mat[0].length;
        boolean row[] = new boolean[n];
        boolean col[] = new boolean[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] || col[j]) mat[i][j] = 1;
            }
        }
    }
}
