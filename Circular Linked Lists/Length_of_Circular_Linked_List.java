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
    public static void makeCircular(Node head)
    {
        Node temp = head;
        
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = head;
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
public static int getLength(Node  head)
{
    //Your code here
    int count = 1;
    Node temp = head;
    while(temp.next != head){
        count++;
        temp = temp.next;
    }
    return count;
}

//{ Driver Code Starts.

    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());

            String str[]= read.readLine().trim().split(" ");
            Node head = null, tail = null;
            head = new Node(Integer.parseInt(str[0]));
            tail = head;
            for(int i = 1; i < n ; i++)
            {
                tail.next = new Node(Integer.parseInt( str[i]));
                tail = tail.next;
            }
                
            makeCircular(head);
            
            System.out.println(getLength(head));
        
System.out.println("~");
}
        
        
    }
    
    
}


// } Driver Code Ends
