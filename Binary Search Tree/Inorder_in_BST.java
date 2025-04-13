//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;
import java.math.*;
class Main{
public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static void main(String sp[])throws IOException{
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		while(t-->0){
			Node root = null;
			root = null;
			int n = sc.nextInt();
			for(int i=0;i<n;i++){
				int x = sc.nextInt();
				root = insert(root, x);
			}
			
			BST obj = new BST();
			
			ArrayList<Integer> res = obj.inOrder(root);
			for (int i = 0; i < res.size (); i++)
                    System.out.print (res.get (i) + " ");
            System.out.print("\n");
			
		
System.out.println("~");
}
	}

	
	public static Node insert(Node node, int key){
		
		if(node==null) return new Node(key);
		
		if(key<node.data)
			node.left = insert(node.left, key);
		else if(key>node.data)
			node.right = insert(node.right, key);
		
		return node;
	}
	

	public static class FastReader {
		BufferedReader br;
		StringTokenizer sz;


		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (sz == null || !sz.hasMoreTokens()) {
				try {
					sz = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return sz.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}

}
//Back-end complete function Template for Java

class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data = data;
		left = right = null;
	}
}



// } Driver Code Ends


//User function Template for Java


class BST{
    ArrayList<Integer> inOrder(Node root)
    {
        // your code here
        ArrayList<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }
    void inOrderTraversal(Node node, ArrayList<Integer> list){
        if(node == null) return;
        inOrderTraversal(node.left, list);
        list.add(node.data);
        inOrderTraversal(node.right, list);
    }
}

