 //{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;


class Node
{
    int data;
    Node left, right;
    Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}



class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            Node root = null;
            String str[] = read.readLine().trim().split(" ");
            for(int i = 0; i <n; i++)
            {
                int val = Integer.parseInt(str[i]);
                root = insert(root, val);
            }
            
            ArrayList <Integer> res = new DFS().preOrder(root);
            for (int i = 0; i < res.size (); i++)
                    System.out.print (res.get (i) + " ");
            System.out.print("\n");
        
System.out.println("~");
}
    }
    
    
    public static Node insert(Node node, int key)
    {
        if(node == null)
            return new Node(key);
            
        
           /* Otherwise, recur down the tree */
            if (key < node.data) 
                node.left  = insert(node.left, key); 
            else if (key > node.data) 
                node.right = insert(node.right, key);    
          
            /* return the (unchanged) node pointer */
            return node; 
    }
    
}
// } Driver Code Ends


//User function Template for Java


class DFS
{
    // Complete the function
    // root: root node of the BST
    public static ArrayList<Integer> preOrder(Node root)
    {
        // your code here
        ArrayList<Integer> result = new ArrayList<>();
        preOrderTraversal(root, result);
        return result;
    }
    private static void preOrderTraversal(Node node, ArrayList<Integer> result){
        if(node == null) return;
        result.add(node.data);
        preOrderTraversal(node.left, result);
        preOrderTraversal(node.right, result);
    }
}
