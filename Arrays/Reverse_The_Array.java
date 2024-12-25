//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            String str[] = read.readLine().trim().split(" ");

            int input[] = new int[n];
            for (int i = 0; i < n; i++) {
                input[i] = Integer.parseInt(str[i]);
            }

            // int x = Integer.parseInt(read.readLine());
            Get obj = new Get();
            obj.reverseArray(input, n);

            for (int i = 0; i < n; i++) System.out.print(input[i] + " ");

            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends




// User function Template for Java

class Get {
    public static void reverseArray(int arr[], int n) {
        // Your code here
        int start = 0;
        int end = n-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
