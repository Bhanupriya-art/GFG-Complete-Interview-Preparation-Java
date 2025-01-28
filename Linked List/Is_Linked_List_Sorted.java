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

public class Main
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
            System.out.println(new Solution().isSorted(head) ? "1" : "0");
        
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

class Solution
{
    public static boolean isSorted(Node head)
    {
        // your code here 
        if(head == null  || head.next == null) return true;
        boolean ndec = true, ninc = true;
        Node current = head;
        while(current.next != null){
            if(current.data > current.next.data) ndec = false;
            if(current.data < current.next.data) ninc = false;
            current = current.next;
        }
        return ndec || ninc;
    }
}
