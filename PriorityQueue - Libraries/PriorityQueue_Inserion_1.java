// User function Template for Java
class Solution {
    public static PriorityQueue<Integer> insertion(ArrayList<Integer> arr) {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.addAll(arr);
        return pq;
    }
}
