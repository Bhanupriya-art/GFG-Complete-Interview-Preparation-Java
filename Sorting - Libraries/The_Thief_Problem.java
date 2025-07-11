import java.util.*;

class Solution {
    public static int getMaxVal(ArrayList<Integer> arr, int n, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            minHeap.add(arr.get(i));
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int maxVal = 0;
        while (!minHeap.isEmpty()) {
            maxVal += minHeap.poll();
        }

        return maxVal;
    }
}
