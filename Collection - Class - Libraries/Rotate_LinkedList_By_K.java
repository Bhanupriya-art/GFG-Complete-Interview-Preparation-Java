class Solution {
    public static void rotateByK(LinkedList<Integer> ll, int k) {
        int n = ll.size();
        if (n == 0) return;
        k = k % n;
        for (int i = 0; i < k; i++) {
            int last = ll.removeLast();
            ll.addFirst(last);
        }
    }
}
