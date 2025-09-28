class Solution {
    public ArrayList<Integer> mergeThree(int[] a, int[] b, int[] c) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < a.length || j < b.length || k < c.length) {
            int val = Integer.MAX_VALUE;
            if (i < a.length) val = Math.min(val, a[i]);
            if (j < b.length) val = Math.min(val, b[j]);
            if (k < c.length) val = Math.min(val, c[k]);
            if (i < a.length && a[i] == val) {
                res.add(a[i]);
                i++;
            } else if (j < b.length && b[j] == val) {
                res.add(b[j]);
                j++;
            } else if (k < c.length && c[k] == val) {
                res.add(c[k]);
                k++;
            }
        }
        return res;
    }
}
