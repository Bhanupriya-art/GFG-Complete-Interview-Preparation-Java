class Solution {
    public int maxOccured(List<Integer> L, List<Integer> R) {
        int n = L.size();
        int maxVal = 0;
        for (int i = 0; i < n; i++) {
            maxVal = Math.max(maxVal, R.get(i));
        }
        int[] freq = new int[maxVal + 2];
        for (int i = 0; i < n; i++) {
            freq[L.get(i)]++;
            freq[R.get(i) + 1]--;
        }
        int maxOcc = freq[0], res = 0;
        for (int i = 1; i <= maxVal; i++) {
            freq[i] += freq[i - 1];
            if (freq[i] > maxOcc) {
                maxOcc = freq[i];
                res = i;
            }
        }
        return res;
    }
}
