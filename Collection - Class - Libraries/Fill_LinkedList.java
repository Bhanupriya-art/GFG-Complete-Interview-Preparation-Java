class Solution {
    public static void fillLinkedList(LinkedList<Integer> ll, int k) {
        for (int i = 0; i < ll.size(); i++) {
            ll.set(i, k);
        }
    }
}
