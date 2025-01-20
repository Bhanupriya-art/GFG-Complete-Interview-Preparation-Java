//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length]; // Creating integer array from the input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            new Solution().binSort(arr);

            // Output the sorted array
            for (int i = 0; i < arr.length; i++) {
                if (i != 0) System.out.print(" ");
                System.out.print(arr[i]);
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    // Function to sort the binary array in non-decreasing order
    public void binSort(int[] arr) {
        // code here
        int cnt = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == 0) {
                cnt++;
            }
        }
        for(int i = 0; i < cnt; i++){
            arr[i] = 0;
        }
        for(int i = cnt; i < arr.length;i++){
            arr[i] = 1;
        }
    }
}
