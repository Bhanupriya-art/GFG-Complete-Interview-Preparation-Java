class Solution {
    static void exchangeColumns(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][m - 1];
            matrix[i][m - 1] = temp;
        }
    }
}
