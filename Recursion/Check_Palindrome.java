//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            System.out.println(new Solution().isPalin(n)?1:0);
        
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
    static boolean isPalin(int N)
    {
        // Check if the number is palindrome or not
        //You may use a helper function if you like
        int reversed = reverseNum(N,0);
        return reversed == N;
    }
    static int reverseNum(int num , int rev){
        if(num == 0) return rev;
        return reverseNum(num / 10, rev * 10 + num % 10);
    }
}
