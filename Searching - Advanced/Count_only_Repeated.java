class Solution {
    public ArrayList<Integer> findRepeating(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                int count = 2;
                while (i + 1 < n && arr[i + 1] == arr[i]) {
                    count++;
                    i++;
                }
                ans.add(arr[i]);
                ans.add(count);
                return ans;
            }
        }
        ans.add(-1);
        ans.add(-1);
        return ans;
    }
}
