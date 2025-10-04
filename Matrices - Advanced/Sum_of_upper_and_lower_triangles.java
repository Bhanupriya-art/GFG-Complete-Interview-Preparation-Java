class Solution {
    public ArrayList<Integer> sumTriangles(int mat[][]) {
        int n = mat.length;
        int upper = 0, lower = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) upper += mat[i][j];
                if (i >= j) lower += mat[i][j];
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(upper);
        res.add(lower);
        return res;
    }
}
