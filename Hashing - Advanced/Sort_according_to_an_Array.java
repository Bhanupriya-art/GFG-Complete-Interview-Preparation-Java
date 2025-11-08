import java.util.*;
class Solution {
    static void relativeSort(int[] a1, int[] a2) {
        Map<Integer, Integer> order = new HashMap<>();
        for (int i = 0; i < a2.length; i++) order.put(a2[i], i);
        Integer[] arr = Arrays.stream(a1).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, (x, y) -> {
            if (order.containsKey(x) && order.containsKey(y))
                return order.get(x) - order.get(y);
            else if (order.containsKey(x))
                return -1;
            else if (order.containsKey(y))
                return 1;
            else
                return x - y;
        });
        for (int i = 0; i < a1.length; i++) a1[i] = arr[i];
    }
}
