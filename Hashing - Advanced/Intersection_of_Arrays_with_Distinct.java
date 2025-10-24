class Solution {
    public static int intersectSize(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : a) set.add(num);
        int count = 0;
        for (int num : b) {
            if (set.contains(num)) {
                count++;
                set.remove(num);
            }
        }
        return count;
    }
}
