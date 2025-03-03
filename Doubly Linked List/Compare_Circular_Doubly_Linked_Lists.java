//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int data;
    Node next, prev;
    Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

class GFG {
    public static void makeCircular(Node head) {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = head;
        head.prev = temp;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            int n1 = Integer.parseInt(read.readLine());
            String str1[] = read.readLine().trim().split(" ");
            Node head1 = null, tail1 = null;
            for (int i = 0; i < n1; i++) {
                int data = Integer.parseInt(str1[i]);
                if (head1 == null) {
                    head1 = new Node(data);
                    tail1 = head1;
                } else {
                    tail1.next = new Node(data);
                    tail1.next.prev = tail1;
                    tail1 = tail1.next;
                }
            }

            int n2 = Integer.parseInt(read.readLine());
            String str2[] = read.readLine().trim().split(" ");
            Node head2 = null, tail2 = null;
            for (int i = 0; i < n2; i++) {
                int data = Integer.parseInt(str2[i]);
                if (head2 == null) {
                    head2 = new Node(data);
                    tail2 = head2;
                } else {
                    tail2.next = new Node(data);
                    tail2.next.prev = tail2;
                    tail2 = tail2.next;
                }
            }
            makeCircular(head1);
            makeCircular(head2);
            Solution ob = new Solution();
            System.out.println(ob.compareCLL(head1, head2) == true ? "1" : "0");
        
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
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next= this.prev = null;
    }
}

*/
class Solution{
    public static boolean compareCLL(Node head1, Node head2) {
    // Your code here
        if(head1 == null || head2 == null) return head1 == head2;
        Node temp1 = head1, temp2 = head2;
        do{
            if (temp1.data != temp2.data) return false;
            temp1= temp1.next;
            temp2 = temp2.next;
        }while(temp1 != head1 && temp2 != head2);
        return temp1 == head1 && temp2 == head2;
    }
};
