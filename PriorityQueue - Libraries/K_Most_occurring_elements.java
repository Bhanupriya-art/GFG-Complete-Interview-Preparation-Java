class Solution {
    int kMostFrequent(int arr[], int n, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int freq : freqMap.values()) {
            maxHeap.add(freq);
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += maxHeap.poll();
        }

        return sum;
    }
}
