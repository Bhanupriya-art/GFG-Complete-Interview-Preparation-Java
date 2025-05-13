//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the number of testcases
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String temp[] = sc.nextLine().trim().split(" ");
            // Taking the number of elements
            int n = temp.length;
            int V[] = new int[n];
            // adding all the elements to the ArrayList
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(temp[i]);
                V[i] = x;
            }
            Solution ob = new Solution();
            // calling the method profit
            // and printing the result
            System.out.println(ob.profit(V));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int profit(int V[]) {
        int n = V.length;
        int[] nextGreaterOrEqual = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && V[stack.peek()] < V[i]) {
                stack.pop();
            }
            nextGreaterOrEqual[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        
        int totalProfit = 0;
        for (int i = 0; i < n; i++) {
            if (nextGreaterOrEqual[i] == -1) {
                totalProfit += V[i];
            } else {
                totalProfit += V[nextGreaterOrEqual[i]] - V[i];
            }
        }
        
        return totalProfit;
    }
}
