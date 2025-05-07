//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            // Creating an ArrayList

            // Taking input the total number of elements
            String temp[] = sc.nextLine().trim().split(" ");
            int n = temp.length;
            int arr[] = new int[n];

            // adding all the elements to the ArrayList
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(temp[i]);
                arr[i] = x;
            }

            // Calling the push method and passing
            // ArrayList and the it's size
            Stack<Integer> mys = _push(arr);

            // Calling the pop method
            // and passing Stack
            _pop(mys);

            System.out.println();
        }
    }

    
// } Driver Code Ends

// User function Template for Java

public static Stack<Integer> _push(int arr[]) {
    // Your code here
    Stack<Integer> stack = new Stack<>();
    for(int num : arr){
        stack.push(num);
    }
    return stack;
}

public static void _pop(Stack<Integer> s) {
    
    // Your code here
    while(!s.isEmpty()) {
        System.out.print(s.pop() + " ");
    }
}


//{ Driver Code Starts.
}
// } Driver Code Ends
