//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        // Making an of class Scanner
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // taking testcase
        sc.nextLine();
        while (t-- > 0) {
            String temp[] = sc.nextLine().trim().split(" ");
            int n = temp.length;
            // Declaring and initializing array arr
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(temp[i]);
                arr[i] = x;
            }

            // Calling the fillArrayList method
            ArrayList<Integer> ans = fillArrayList(arr);

            // Printing the elements of the array
            for (int x : ans) System.out.print(x + " ");

            System.out.println();

            System.out.println("~");
        }
    }

    
// } Driver Code Ends
//User function Template for Java


public static ArrayList<Integer> fillArrayList(int arr[], int n)
{
    //Your code here
    ArrayList<Integer> list= new ArrayList<>();
    for(int i=0;i<n;i++){
        list.add(arr[i]);
    }
    return list;
}


//{ Driver Code Starts.
}
// } Driver Code Ends
