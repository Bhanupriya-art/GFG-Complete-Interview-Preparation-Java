class Solution {
    static int determinantOfMatrix(int matrix[][], int n) {
        if (n == 1)
            return matrix[0][0];
        if (n == 2)
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        int det = 0;
        for (int p = 0; p < n; p++) {
            int[][] subMatrix = new int[n - 1][n - 1];
            for (int i = 1; i < n; i++) {
                int colIndex = 0;
                for (int j = 0; j < n; j++) {
                    if (j == p)
                        continue;
                    subMatrix[i - 1][colIndex++] = matrix[i][j];
                }
            }
            det += matrix[0][p] * determinantOfMatrix(subMatrix, n - 1) * ((p % 2 == 0) ? 1 : -1);
        }
        return det;
    }
}
