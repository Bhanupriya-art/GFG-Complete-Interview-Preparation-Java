class Solution {
    public static ArrayList<Integer> uniqueSorted(ArrayList<Integer> arr, int n) {
        TreeSet<Integer> set = new TreeSet<>(arr);
        return new ArrayList<>(set);
    }
}
