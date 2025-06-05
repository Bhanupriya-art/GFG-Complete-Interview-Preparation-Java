class Solution {
    static ArrayList<Integer> printNonRepeated(int arr[], int n) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (freq.get(num) == 1) {
                result.add(num);
            }
        }
        return result;
    }
}
