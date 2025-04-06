//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currrNode = q.remove();
        
              // Get the currrent node's value from the string
              String currrVal = s[i];
        
              // If the left child is not null
              if(!currrVal.equals("N")) 
              {
        
                  // Create the left child for the currrent node
                  currrNode.left = new Node(Integer.parseInt(currrVal));
        
                  // Push it to the queue
                  q.add(currrNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currrVal = s[i];
        
              // If the right child is not null
              if(!currrVal.equals("N")) 
              {
        
                  // Create the right child for the currrent node
                  currrNode.right = new Node(Integer.parseInt(currrVal));
        
                  // Push it to the queue
                  q.add(currrNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            int k = Integer.parseInt(br.readLine().trim());
            
            Solution T = new Solution();
            System.out.println(T.printKDistantfromLeaf(root,k));
            t--;
        
System.out.println("~");
}
    }
}



// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
    //Function to return count of nodes at a given distance from leaf nodes.
    int printKDistantfromLeaf(Node root, int k)
    {
        // Write your code here
        Set<Node> result = new HashSet<>();
        List<Node> path = new ArrayList<>();
        dfs(root,k,path,result);
        return result.size();
    }
    void dfs(Node node, int k, List<Node> path, Set<Node> result){
        if(node == null) return;
        path.add(node);
        if(node.left == null && node.right == null){
            if(path.size() > k){
                result.add(path.get(path.size() - k - 1));
            }
        }else{
            dfs(node.left, k, path, result);
            dfs(node.right, k, path, result);
        }
        path.remove(path.size() - 1);
    }

}
