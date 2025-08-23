class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        int maxRight = arr[n - 1];
        res.add(maxRight);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                res.add(maxRight);
            }
        }
        Collections.reverse(res);
        return res;
    }
}
