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
            
            ArrayList<Integer> res = new BFS().levelOrder(root);
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

class BFS
{
    // Complete the function
    // root: root node of the BST 
    public static ArrayList<Integer> levelOrder(Node root)
    {
       // Print the nodes of tree levelwise
       ArrayList<Integer> res = new ArrayList<>();
       if(root == null) return res;
       
       Queue<Node> queue = new LinkedList<>();
       queue.add(root);
       
       while(!queue.isEmpty()){
           Node current = queue.poll();
           res.add(current.data);
           
           if(current.left != null) queue.add(current.left);
           if(current.right != null) queue.add(current.right);
       }
       return res;
    }
}
