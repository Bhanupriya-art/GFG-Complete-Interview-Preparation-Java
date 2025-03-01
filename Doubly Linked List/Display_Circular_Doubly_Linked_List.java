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
        this.next= this.prev = null;
    }
}

class GFG
{
    
   
    
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
        int t = Integer.parseInt(read.readLine().trim());
        
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
            ArrayList<Integer> arr = displayList(head);
            for(int i = 0;i<arr.size();i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
            for(int i = arr.size()-1;i>=0;i--){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
            
            
            
            
        
System.out.println("~");
}
    }
    
// } Driver Code Ends

//User function Template for Java


/*
class Node
{
    int data
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next= this.prev = null;
    }
}
*/

public static ArrayList<Integer> displayList(Node head)
{
    // your code here
    ArrayList<Integer> result = new ArrayList<>();
    if(head == null) return result;
    Node temp = head;
    do{
        result.add(temp.data);
        temp = temp.next;
    }while(temp != head);
    return result;
}


//{ Driver Code Starts.
    
}





// } Driver Code Ends
