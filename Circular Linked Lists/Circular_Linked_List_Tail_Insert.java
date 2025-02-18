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
    public static Node insertNode(Node head, int data)
    {
        if(head == null)
            return new Node(data);
        Node temp = new Node(data);
        Node node = head;
        while(node.next != null)
            node = node.next;

        node.next = temp;
        return head;
    }
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

            int data = Integer.parseInt(read.readLine().trim());
            makeCircular(head);
            head = new Solution().insertInTail(head, data);
            displayList(head);
            System.out.println();
            
            //System.out.println(new Solution().isSorted(head) ? "1" : "0");

        
System.out.println("~");
}
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
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ");
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
    public static Node insertInTail(Node head, int data)
    {
        
        // your code here
        Node newNode = new Node(data);
        if(head == null){
            newNode.next = newNode;
            return newNode;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
        return head;
        
    }
}
