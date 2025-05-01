//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //Creating an object of Scanner class
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();//taking the number of testcases
		
		while(t-->0)
		{
		  //Declaring and Initializing an ArrayList
		  ArrayList<Integer>arr=new ArrayList<>();
		  
		  //taking the total number of elements
		  int n=sc.nextInt();
		  
		  for(int i=0;i<n;i++)
		  arr.add(sc.nextInt());
		  
		  //taking in the the value of k
		  int k=sc.nextInt();
		  
		  //calling the getSmaller method
		  ArrayList<Integer>ans=getSmaller(arr,k);
		  
		  //printing all the numbers which are smaller than k
		  for(int i:ans)
		  System.out.print(i+" ");
		   
		  System.out.println();
		
System.out.println("~");
}
	}
	
// } Driver Code Ends

// User function Template for Java

public static ArrayList<Integer> getSmaller(ArrayList<Integer> arr, int k) {
    // Your code here
    ArrayList<Integer> result = new ArrayList<>();
    for(int num : arr){
        if(num < k) result.add(num);
    }
    return result;
}


//{ Driver Code Starts.

	
}


// } Driver Code Ends
