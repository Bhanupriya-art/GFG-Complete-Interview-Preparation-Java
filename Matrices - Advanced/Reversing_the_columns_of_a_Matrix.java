class Solution {
    static void reverseCol(int matrix[][]) {
        int n = matrix.length;       
        int m = matrix[0].length;    
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = m - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                
                left++;
                right--;
            }
        }
    }
}
