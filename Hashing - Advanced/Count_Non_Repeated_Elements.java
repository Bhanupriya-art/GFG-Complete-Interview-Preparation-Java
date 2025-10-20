class Solution {
    public int countNonRepeated(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) map.put(num, map.getOrDefault(num, 0) + 1);
        int count = 0;
        for (int freq : map.values()) if (freq == 1) count++;
        return count;
    }
}
