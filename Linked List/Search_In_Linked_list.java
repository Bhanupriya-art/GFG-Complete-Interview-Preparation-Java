//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Driver {
    static Node insertNode(Node head, int x) {
        Node node = new Node(x);
        if (head == null) return new Node(x);

        Node temp = head;
        while (temp.next != null) temp = temp.next;

        temp.next = node;

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for (int i = 0; i < n - 1; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            int x = sc.nextInt();
            if (new Get().searchLinkedList(head, x))
                System.out.println(1);
            else
                System.out.println(0);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/

class Get {
    public static boolean searchLinkedList(Node head, int x) {
        // Your code here
        int pos = 1;
        Node curr = head;
        
        while(curr != null){
            if(curr.data == x){
                return true;
            }else{
                pos++;
                curr=curr.next;
            }
        }
        return false;
    }
}
