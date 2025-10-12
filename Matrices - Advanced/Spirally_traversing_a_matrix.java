class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        ArrayList<Integer> res = new ArrayList<>();
        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                res.add(mat[top][i]);
            top++;
            for (int i = top; i <= bottom; i++)
                res.add(mat[i][right]);
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    res.add(mat[bottom][i]);
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    res.add(mat[i][left]);
                left++;
            }
        }
        return res;
    }
}
