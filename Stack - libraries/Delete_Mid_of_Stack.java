//{ Driver Code Starts
// Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String temp[] = sc.nextLine().trim().split(" ");
            Stack<Integer> myStack = new Stack<>();
            int n = temp.length;
            // adding elements to the stack
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(temp[i]);
                myStack.push(x);
            }
            Solution obj = new Solution();
            obj.deleteMid(myStack);

            while (!myStack.isEmpty()) {
                System.out.print(myStack.peek() + " ");
                myStack.pop();
            }
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        deleteMidHelper(s,0,s.size());
    }
    private void deleteMidHelper(Stack<Integer> s, int current, int size){
        if(s.isEmpty() || current == size / 2){
            s.pop();
            return;
        }
        int x = s.pop();
        deleteMidHelper(s, current + 1, size);
        s.push(x);
    }
}
