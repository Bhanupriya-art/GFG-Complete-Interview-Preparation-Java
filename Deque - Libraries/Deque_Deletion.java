// User function Template for Java
class Solution {
    // Function to erase the element from specified position X in deque.
    public static void eraseAt(ArrayDeque<Integer> deq, int X) {
        // Your code here
        ArrayList<Integer> temp = new ArrayList<>(deq);
        temp.remove(X);
        deq.clear();
        deq.addAll(temp);
    }

    // Function to erase the elements in range start (inclusive), end (exclusive).
    public static void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {

        if(start == end) return;
        ArrayList<Integer> temp = new ArrayList<>(deq);
        for(int i = end - 1; i >= start; i--) {
            temp.remove(i);
        }
        deq.clear();
        deq.addAll(temp);
        // Your code here
    }

    // Function to erase all the elements in the deque.

        
    public static void eraseAll(ArrayDeque<Integer> deq) {
        // Your code here
        deq.clear();
    }
}
