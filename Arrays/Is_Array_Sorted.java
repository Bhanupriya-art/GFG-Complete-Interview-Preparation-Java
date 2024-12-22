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
            int arr[] = new int[n];
            
            String str[] = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
            
            System.out.println(new Solution().isSorted(arr, n));
            
        
System.out.println("~");
}
    }
    
}
// } Driver Code Ends




//User function Template for Java


class Solution
{
    //Complete the function
    
    public static int isSorted(int arr[], int n)
    {
       /// Your code here
       boolean ascending = true;
       boolean descending = true;
       for(int i=0;i<n -1;i++){
           if(arr[i] > arr[i+1]){
               ascending = false;
           }
           if(arr[i] < arr[i + 1]){
               descending = false;
           }
       }
       if( ascending || descending){
           return 1;
       }else{
           return 0;
       }
    }
};

