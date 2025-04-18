//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next, prev;
    
    Node(int data)
    {
        this.data = data;
        this.next = this.prev = null;
    }
}

class GFG
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
            for(int i = 0; i < n; i++)
            {
                int data = Integer.parseInt(str[i]);
                if (head == null) 
                {
                    head = new Node(data);
                    tail = head;
                }
                else
                {
                    tail.next = new Node(data);
                    tail.next.prev=tail;
                    tail = tail.next;
                }
            }
            
            makeCircular(head);
            Solution ob = new Solution();
            System.out.println(ob.findMiddle(head));
        
System.out.println("~");
}
    }
    
    public static Node insertNode(Node head, int data)
    {
        if(head == null)
            return new Node(data);
        
        else
        {
            Node  temp=head;
            Node  prev=head;
            while(temp.next != null)
                {
                    prev=temp;
                    temp=temp.next;
                    
                }
            temp.next=new Node(data);
            prev = temp;
            temp = temp.next;
            temp.prev = prev;
        }
        
        return head;
    }
    
    public static void makeCircular(Node head)
    {
        Node temp=head;
        
        while(temp.next != null)
        {
            temp = temp.next;
        }
        
        temp.next = head;
        head.prev =temp;
    }
    
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Complete the function
    public static int findMiddle(Node head)
    {
        // your code here
        Node slow = head, fast = head;
        while(fast.next != head && fast.next.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
};
