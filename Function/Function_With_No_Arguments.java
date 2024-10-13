//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends
//User function Template for Java

//Write the helloFunction body below. It should have one statement
//System.out.println("Hello")
public static void helloFunction(){
    System.out.print("Hello");
}
//Write the helloFunction body above. It should have one statement
//System.out.println("Hello")


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t-->0) {
            helloFunction();
        }
        scn.close();
    }
}
// } Driver Code Ends
