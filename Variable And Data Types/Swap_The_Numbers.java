//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            Solution oj = new Solution();
            oj.utility(a,b);
        }
    }
}

// } Driver Code Ends




//User function Template for Java


class Solution
{
    public void utility(int a, int b){
        //code here
        int temp=a;
        a=b;
        b=temp;
        
        System.out.println(a+" "+b);
    }
}

