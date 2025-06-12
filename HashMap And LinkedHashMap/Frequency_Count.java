class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.contains(num)) {
                result.add(map.get(num));
                seen.add(num);
            }
        }
        return result;
    }
}
