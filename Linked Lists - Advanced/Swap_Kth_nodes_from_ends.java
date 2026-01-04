/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node swapKth(Node head, int k) {
        int n = 0;
        Node curr = head;
        while (curr != null) {
            n++;
            curr = curr.next;
        }
        if (k > n) return head;
        if (2 * k - 1 == n) return head;
        Node x_prev = null, x = head;
        for (int i = 1; i < k; i++) {
            x_prev = x;
            x = x.next;
        }
        Node y_prev = null, y = head;
        for (int i = 1; i < n - k + 1; i++) {
            y_prev = y;
            y = y.next;
        }
        if (x_prev != null) x_prev.next = y;
        if (y_prev != null) y_prev.next = x;
        Node temp = x.next;
        x.next = y.next;
        y.next = temp;
        if (k == 1) head = y;
        if (k == n) head = x;
        return head;
    }
}
