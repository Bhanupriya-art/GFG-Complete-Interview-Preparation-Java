class Solution {
    // Function to return kth largest element from an array.
    public static int KthLargest(int arr[], int k) {
        // Your code here
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int num : arr) {
            minheap.add(num);
            if(minheap.size() > k) {
                minheap.poll();
            }
        }
        return minheap.peek();
    }
}
