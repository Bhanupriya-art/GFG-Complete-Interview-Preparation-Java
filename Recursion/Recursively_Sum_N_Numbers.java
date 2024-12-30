//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            System.out.println(new Solution().recursiveSum(n));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    // Complete the function
    // N: input element
    public static int recursiveSum(int N)
    {
        // recursively sum from 1 to N
        if (N == 0) return 0;
        return N + recursiveSum(N - 1);
        
    }
}
