class Solution {
    public ArrayList<Integer> maxAdj(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            res.add(Math.max(arr[i], arr[i + 1]));
        }
        return res;
    }
}
