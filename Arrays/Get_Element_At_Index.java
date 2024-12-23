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
            String str[] = read.readLine().trim().split(" ");
            
            int input[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                input[i] = Integer.parseInt(str[i]);
            }
            
            int index = Integer.parseInt(read.readLine());
            Get obj = new Get();
            System.out.println(obj.getByIndex(input, n, index));
            
        
System.out.println("~");
}
    }
}


// } Driver Code Ends




//User function Template for Java


class Get
{
    public static int getByIndex(int arr[], int n, int i)
    {
        // Your code here
        if(i>= 0 && i<n){
            return arr[i];
        }
        return -1;
    }
}
