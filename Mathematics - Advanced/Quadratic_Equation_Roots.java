class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> res = new ArrayList<>();
        int d = b * b - 4 * a * c;
        if (d < 0) {
            res.add(-1);
        } else {
            double sqrt_val = Math.sqrt(d);
            int root1 = (int)Math.floor((-b + sqrt_val) / (2 * a));
            int root2 = (int)Math.floor((-b - sqrt_val) / (2 * a));
            if (root1 >= root2) {
                res.add(root1);
                res.add(root2);
            } else {
                res.add(root2);
                res.add(root1);
            }
        }
        return res;
    }
}
