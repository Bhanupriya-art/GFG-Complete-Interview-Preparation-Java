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

class Driver
{
    static Node insertNode(Node head, int data)
    {
        if(head == null)
            return new Node(data);
            
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
            
        temp.next = new Node(data);
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
            int pos = sc.nextInt();
            int data = sc.nextInt();
            
            new Insert().insertAtPosition(head, pos, data);
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
class Insert
{
    
    static void insertAtPosition(Node head, int pos, int data)
    {
        // your code here
        Node newNode = new Node(data);
        Node temp = head;
        int count = 1;
        while(temp != null && count < pos){
            temp = temp.next;
            count++;
        }
        if(temp == null) return;
        newNode.next = temp.next;
        temp.next = newNode;
    }
}
