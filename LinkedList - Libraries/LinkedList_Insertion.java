//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking the number of testcases
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            // taking input the number the of elements
            String temp[] = sc.nextLine().trim().split(" ");
            int n = temp.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(temp[i]);
            }

            // calling the method insertion
            LinkedList<Integer> ll = insertion(arr);

            // printing all the elements
            for (int i : ll) System.out.print(i + " ");
            System.out.println();
        }
    }

    
// } Driver Code Ends


// User function Template for Java

public static LinkedList<Integer> insertion(int arr[]) {
    // Your code here
    LinkedList<Integer> linkedlist = new LinkedList<>();
    for(int i=0;i<arr.length;i++){
        linkedlist.add(arr[i]);
    }
    return linkedlist;
    
}




//{ Driver Code Starts.
}
// } Driver Code Ends
