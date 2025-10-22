class Solution {
    public static int firstRepeated(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) map.put(num, map.getOrDefault(num, 0) + 1);
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > 1) return i + 1;
        }
        return -1;
    }
}
