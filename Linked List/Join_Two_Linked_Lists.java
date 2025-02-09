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
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            int n1 = Integer.parseInt(read.readLine());

            String str[]= read.readLine().trim().split(" ");
            Node head1 = new Node(Integer.parseInt( str[0]));
            Node tail1 = head1;
            for(int i = 1; i < n1; i++)
            {
                tail1.next = new Node(Integer.parseInt( str[i]));
                tail1 = tail1.next;
            }

            int n2 = Integer.parseInt(read.readLine());

             str = read.readLine().trim().split(" ");
            Node head2 = new Node(Integer.parseInt( str[0]));
            Node tail2 = head2;
            for(int i = 1; i < n2; i++)
            {
                tail2.next = new Node(Integer.parseInt( str[i]));
                tail2 = tail2.next;
            }
            
            Node head = new Join().joinTheLists(head1, head2);
            displayList(head);
            System.out.println();

        
System.out.println("~");
}
    }
    
    public static void displayList(Node head)
    {
        while(head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
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
class Join
{
    public static Node joinTheLists(Node head1, Node head2)
    {
           // your code here
        if(head1 == null) return head2;
        Node temp = head1;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = head2;
        return head1;
    }
}
