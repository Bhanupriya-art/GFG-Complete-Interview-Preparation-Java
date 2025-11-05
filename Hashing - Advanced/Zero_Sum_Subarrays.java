class Solution {
    public int findSubarray(int[] arr) {
        Map<Long, Integer> map = new HashMap<>();
        long sum = 0;
        int count = 0;
        map.put(0L, 1);
        for (int num : arr) {
            sum += num;
            if (map.containsKey(sum))
                count += map.get(sum);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
