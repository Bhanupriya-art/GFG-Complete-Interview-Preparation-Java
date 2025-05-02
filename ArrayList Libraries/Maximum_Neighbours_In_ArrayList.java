//{ Driver Code Starts
// Initial Template for Java
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.ListIterator;

class GFG {
    public static void main(String[] args) {
        // Creating an Object of class Scanner
        Scanner sc = new Scanner(System.in);
        // Taking input all the testcases
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {

            // Declaring and Initializing an ArrayList of type Integer
            ArrayList<Integer> arr = new ArrayList<>();
            String temp[] = sc.nextLine().trim().split(" ");
            int n = temp.length;
            // adding all the elements to the ArrayList
            for (int i = 0; i < n; i++) {
                arr.add(Integer.parseInt(temp[i]));
            }

            // Calling the method maxNeighbour
            ArrayList<Integer> ans = maxNeighbour(arr);

            // Printing the elements
            for (int x : ans) System.out.print(x + " ");

            System.out.println();
        }
    }

    
// } Driver Code Ends


// User function Template for Java

public static ArrayList<Integer> maxNeighbour(ArrayList<Integer> arr) {
    // Your code here
    ArrayList<Integer> result = new ArrayList<>();
    for(int i=0; i<arr.size() - 1; i++)
    {
        result.add(Math.max(arr.get(i), arr.get(i+1)));
    }
    return result;
}





//{ Driver Code Starts.
}

// } Driver Code Ends
