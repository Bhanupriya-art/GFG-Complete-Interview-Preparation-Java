class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n + 1];
        for (int num : arr) {
            if (num <= n) freq[num]++;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) res.add(freq[i]);
        return res;
    }
}
