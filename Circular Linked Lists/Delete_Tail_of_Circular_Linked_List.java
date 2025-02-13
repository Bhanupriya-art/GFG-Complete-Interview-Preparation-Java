//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.io.*;

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
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            String str[] = read.readLine().trim().split(" ");
            Node head = null, tail = null;
            head = new Node(Integer.parseInt(str[0]));
            tail = head;
            for(int i = 1; i < n ; i++)
            {
                tail.next = new Node(Integer.parseInt( str[i]));
                tail = tail.next;
            }
            makeCircular(head);
            head = new Solution().deleteTail(head);
            displayList(head);
            System.out.println();
        
System.out.println("~");
}
    }
    
    public static void displayList(Node head)
    {
        Node temp = head;
        while(temp.next != head)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ");
    }
    
    
    
    
    
    
    
    public static void makeCircular(Node head)
    {
        Node temp = head;
        
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = head;
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
    public static Node deleteTail(Node head)
    {
        // your code here
        if(head == null || head.next == head) return null;
        Node temp = head;
        while(temp.next.next != head){
            temp = temp.next;
        }
        temp.next = head;
        return head;
    }
}
