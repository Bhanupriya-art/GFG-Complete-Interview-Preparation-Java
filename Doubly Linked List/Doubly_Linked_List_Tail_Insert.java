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
            if (head.next != null)
            {
                System.out.print(head.data + " ");
            }
            else 
            {
                System.out.println(head.data);
            }
            head = head.next;
        }
        System.out.print(head.data);
        System.out.println();
        
        //Tail to Head
        while(head.prev != null)
        {
            if (head.prev != null)
            {
                System.out.print(head.data + " ");
            }
            else 
            {
                System.out.println(head.data);
            }
            head = head.prev;
        }
        System.out.print(head.data);
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
            
            int data = Integer.parseInt(read.readLine().trim());
    	    
    	    head = insertInTail(head,data);
    	    
    	    displayList(head);
    	    System.out.println();
            
        
System.out.println("~");
}
    }
    
// } Driver Code Ends

//User function Template for Java

/*
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
*/

public static Node insertInTail(Node head, int data)
{
    // your code here
    Node newNode = new Node(data);
    if(head == null) return newNode;
    Node tail = head;
    while(tail.next != null){
        tail = tail.next;
    }
    tail.next = newNode;
    newNode.prev = tail;
    return head;
}


//{ Driver Code Starts.
    
}



// } Driver Code Ends
