//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Taking all the testcases
		int t = sc.nextInt();
		
		while(t-->0)
		{
		    //taking input total number people
		    int n=sc.nextInt();
		    
		    //taking input interval number
		    int k=sc.nextInt();
		    
		    //calling the method josephus
		    System.out.println(josephus(n,k));
		
System.out.println("~");
}
	}
	
// } Driver Code Ends

// User function Template for Java

public static int josephus(int n, int k) {
    // Your code here
    if(n == 1) return 0;
    return (josephus(n - 1, k) + k) % n;
}


//{ Driver Code Starts.

	
}
// } Driver Code Ends
