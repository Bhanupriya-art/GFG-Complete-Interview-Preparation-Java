import java.util.*;

class Solution {
    public ArrayList<Integer> sortByFreq(int arr[]) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) freq.put(num, freq.getOrDefault(num, 0) + 1);
        List<Integer> list = new ArrayList<>();
        for (int num : arr) list.add(num);
        Collections.sort(list, (a, b) -> {
            if (!freq.get(a).equals(freq.get(b))) return freq.get(b) - freq.get(a);
            return a - b;
        });
        return new ArrayList<>(list);
    }
}
