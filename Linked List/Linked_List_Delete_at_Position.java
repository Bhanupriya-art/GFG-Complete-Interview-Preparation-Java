//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}

class Main
{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            int pos = sc.nextInt();
            head = new Delete().deleteAtPosition(head, pos);
            displayList(head);
            System.out.println();
        
System.out.println("~");
}
    }


    static void displayList(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}


// } Driver Code Ends


//User function Template for Java


/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Delete
{
    Node deleteAtPosition(Node head, int pos)
    {
        // your code here
        if(pos == 1) return head.next;
        Node temp = head;
        for(int i = 1; i < pos-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
        
    }
}

