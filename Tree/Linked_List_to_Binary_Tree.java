//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int x) {
        data = x;
        left = null;
        right = null;
    }
}

public class Main {
    public static void push(Node[] headRef, int newData) {
        Node newNode = new Node(newData);
        newNode.next = headRef[0];
        headRef[0] = newNode;
    }

    public static void levelOrder(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }
    }

    public static void reverse(Node[] head) {
        Node prev = null;
        Node cur = head[0];
        Node next;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head[0] = prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while (T-- > 0) {
            Node head = null;
            Node[] headRef = new Node[1];
            headRef[0] = head;
            List<Integer> a = new ArrayList<>();

            String input = sc.nextLine();
            Scanner ss = new Scanner(input);
            while (ss.hasNextInt()) {
                int num = ss.nextInt();
                a.add(num);
                push(headRef, num);
            }

            reverse(headRef);
            Solution obj = new Solution();
            TreeNode root = obj.linkedListToBinaryTree(headRef[0]);

            if (root == null) {
                System.out.println("[]");
            } else {
                levelOrder(root);
                System.out.println();
            }
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java
/*
// Tree class
class Tree {
    int data;
    Tree left;
    Tree right;

    Tree(int d) {
        data = d;
        left = null;
        right = null;
    }
}

// Linked List Node class
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public TreeNode linkedListToBinaryTree(Node head) {
        // code here
        if(head == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(head.data);
        
        queue.add(root);
        head = head.next;
        
        
        while(head != null){
            TreeNode parent = queue.poll();
            TreeNode lc = new TreeNode(head.data);
            queue.add(lc);
            parent.left = lc;
            head = head.next;
            
            if(head != null){
                TreeNode rc = new TreeNode(head.data);
                queue.add(rc);
                parent.right = rc;
                head = head.next;
            }
        }
        return root;
    }
}
