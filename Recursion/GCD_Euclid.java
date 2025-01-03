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
            String str[] = read.readLine().trim().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            
            System.out.println(new Solution().GCD(a, b));
        
System.out.println("~");
}
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    // Complete the function
    // a: first number
    // b: second number
    public static int GCD(int a, int b)
    {
        // find and return GCD of two numbers;
        if(b == 0) return a;
        return GCD(b, a % b);
    }
}
