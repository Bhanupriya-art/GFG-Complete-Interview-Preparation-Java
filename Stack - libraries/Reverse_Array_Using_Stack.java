//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;


public class Driver {

    public static void main(String[] args)throws IOException {
        BufferedReader read = new BufferedReader((new InputStreamReader(System.in)));
        int t = Integer.parseInt(read.readLine());

        while(t-- >0)
        {
            int n = Integer.parseInt(read.readLine());
            int arr[] = new int[n];
            String str[] = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);

            new Solution().reverseArray(n, arr);
            for(Integer x: arr)
                System.out.print(x + " ");
            System.out.println();
        
System.out.println("~");
}
    }

}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Complete the function
    // n: size of array
    // arr[]: input array
    public static void reverseArray(int n, int arr[]) {
        // Reverse the array using stack
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < n; i++){
            stack.push(arr[i]);
        }
        for(int i = 0; i < n; i++){
            arr[i] = stack.pop();
        }
    }
}
