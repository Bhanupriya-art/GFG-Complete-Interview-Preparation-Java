class Solution {
    public int countOccurence(int[] arr, int k) {
        int n = arr.length;
        int threshold = n / k;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (int freq : map.values()) {
            if (freq > threshold) count++;
        }
        return count;
    }
}
