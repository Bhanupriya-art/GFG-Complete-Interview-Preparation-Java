import java.util.*;

class Solution {
    public static ArrayList<Integer> findPairs(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (set.contains(-num)) {
                if (num > 0) {
                    result.add(-num);
                    result.add(num);
                } else {
                    result.add(num);
                    result.add(-num);
                }
            }
            set.add(num);
        }

        if (result.isEmpty()) result.add(0);
        return result;
    }
}
