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
        this.next = null;
    }
}


class Driver
{
    public static Node insertNode(Node head, int x)
    {
        Node node = new Node(x);
        if(head == null)
            return new Node(x);
            
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = node;
        
        return head;
    }
    
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
            
            System.out.println(new Get().maximum(head) + " " + new Get().minimum(head));
        
System.out.println("~");
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
        this.next = null;
    }
}
*/

class Get
{
    static int maximum(Node head)
    {
        // your code here
        int maxval = head.data;
        while(head != null){
            if(head.data > maxval ){
                maxval = head.data;
            }
            head = head.next;
        }
        return maxval;
        
    }

    static int minimum(Node head)
    {
        // your code here
        int minval = head.data;
        while(head != null){
            if(head.data < minval){
                minval = head.data;
            }
            head = head.next;
        }
        return minval;
    }
}
