class Solution {
    public int countSubarray(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, count = 0;
        map.put(0, 1);
        for (int num : arr) {
            sum += (num == 0 ? -1 : 1);
            if (map.containsKey(sum)) count += map.get(sum);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
