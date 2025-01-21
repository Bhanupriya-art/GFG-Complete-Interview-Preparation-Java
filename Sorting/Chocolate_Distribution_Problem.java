//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> arr = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                arr.add(Integer.parseInt(token));
            }

            int m = Integer.parseInt(br.readLine());
            Solution ob = new Solution();

            System.out.println(ob.findMinDiff(arr, m));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        int n = arr.size();
        Collections.sort(arr);
        int min_dif = Integer.MAX_VALUE;
        for(int i = 0; i + m - 1 < n;i++){
            int diff = arr.get(i + (int)m - 1) - arr.get(i);
            min_dif = Math.min(min_dif,diff);
        }
        return min_dif;
    }
}
