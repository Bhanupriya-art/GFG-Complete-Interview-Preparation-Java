class Solution {
    long maximum_sum(int N, int[] A, int K) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : A) freq.put(num, freq.getOrDefault(num, 0) + 1);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] == b[1] ? b[0] - a[0] : b[1] - a[1]);
        for (var e : freq.entrySet()) pq.add(new int[]{e.getKey(), e.getValue()});
        long sum = 0;
        while (K-- > 0) {
            int[] top = pq.poll();
            sum += top[0];
            top[1]--;
            if (top[1] > 0) pq.add(top);
        }
        return sum;
    }
}
