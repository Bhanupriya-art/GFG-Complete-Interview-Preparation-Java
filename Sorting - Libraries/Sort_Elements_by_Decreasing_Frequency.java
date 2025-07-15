class Solution {
    public ArrayList<Integer> sortByFreq(int arr[]) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr);

        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(boxedArr, (a, b) -> {
            if (freqMap.get(b).equals(freqMap.get(a))) {
                return a - b;
            } else {
                return freqMap.get(b) - freqMap.get(a);
            }
        });

        result.addAll(Arrays.asList(boxedArr));
        return result;
    }
}
