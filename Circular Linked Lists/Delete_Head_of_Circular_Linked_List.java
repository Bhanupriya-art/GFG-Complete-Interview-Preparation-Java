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


class GFG
{
    public static Node insertNode(Node head, int data)
    {
        if(head == null)
            return new Node(data);
            
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        
        temp.next = new Node(data);
        return head;
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
    
    public static void displayList(Node head)
    {
        Node temp = head;
        while(temp.next != head)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data+" ");
    }
    
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
	    
    	    Node oldHead = head;
    	    head = new Solution().deleteHead(head);
    	    
    	    if(oldHead.next == null)
    	    {
    	    
        	    displayList(head);
    	    }
    	    else
    	    {
    	        System.out.print("Please set the next of original head to null");
    	    }
    	    
    	    System.out.println();
        
System.out.println("~");
}
    }
}







// } Driver Code Ends


//User function Template for Java


class Solution
{
    public static Node deleteHead(Node head)
    {
         // your code here
        if(head == null || head.next == head) return null;
        Node newHead = head.next;
        Node temp = head;
        while(temp.next != head) temp = temp.next;
        temp.next = newHead;
        head.next = null;
        return newHead;
    }
}
