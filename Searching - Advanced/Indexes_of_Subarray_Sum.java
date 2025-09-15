import java.util.*;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        int left = 0, right = 0, sum = 0;
        while (right < n) {
            sum += arr[right];
            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }
            if (sum == target) {
                res.add(left + 1);
                res.add(right + 1);
                return res;
            }
            right++;
        }
        res.add(-1);
        return res;
    }
}
