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
    
    
    public static void displayList(Node head)
    {
          //Head to Tail
        while(head.next != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.print(head.data);
        System.out.println();
        
        //Tail to Head
        while(head.prev != null)
        {
            System.out.print(head.data+" ");
            head = head.prev;
        }
        System.out.print(head.data);
    }
    
    public static void makeCircular(Node head)
    {
        Node temp=head;
        
        while(temp.next != null)
        {
            temp=temp.next;
        }
        
        temp.next = head;
        head.prev=temp;
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
            int x = Integer.parseInt(read.readLine().trim());
            if(x == 1)
                makeCircular(head);
            Solution ob = new Solution();
            System.out.println(ob.isCircular(head) ? "1" : "0");
            
            
            
        
System.out.println("~");
}
    }
}


// } Driver Code Ends


//User function Template for Java



/*class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = this.prev = null;
    }
}*/

class Solution{
    public static boolean isCircular(Node head)
    {
          // your code here
          if(head == null) return false;
          Node temp = head;
          while(temp.next != null && temp.next != head) temp = temp.next;
          return temp.next == head;
    }
};
