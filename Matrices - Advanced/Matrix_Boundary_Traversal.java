class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = mat.length, m = mat[0].length;
        if (n == 1) {
            for (int j = 0; j < m; j++) res.add(mat[0][j]);
            return res;
        }
        if (m == 1) {
            for (int i = 0; i < n; i++) res.add(mat[i][0]);
            return res;
        }
        for (int j = 0; j < m; j++) res.add(mat[0][j]);
        for (int i = 1; i < n; i++) res.add(mat[i][m - 1]);
        for (int j = m - 2; j >= 0; j--) res.add(mat[n - 1][j]);
        for (int i = n - 2; i > 0; i--) res.add(mat[i][0]);
        return res;
    }
}
