/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    static Node addTwoLists(Node num1, Node num2) {
        num1 = reverseList(num1);
        num2 = reverseList(num2);

        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;

        while (num1 != null || num2 != null || carry > 0) {
            int sum = carry;
            if (num1 != null) {
                sum += num1.data;
                num1 = num1.next;
            }
            if (num2 != null) {
                sum += num2.data;
                num2 = num2.next;
            }

            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
        }

        Node result = reverseList(dummy.next);
        return removeLeadingZeros(result);
    }

    static Node reverseList(Node head) {
        Node prev = null, next = null, current = head;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static Node removeLeadingZeros(Node head) {
        while (head != null && head.data == 0) {
            head = head.next;
        }
        return head == null ? new Node(0) : head;
    }
}

