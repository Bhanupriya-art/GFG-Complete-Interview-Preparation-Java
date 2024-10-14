//{ Driver Code Starts
//Initial Template for Java


import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends
//User function Template for Java

//Write the complete argumentFunction below.
//The function should take two arguments a and b
//The function should have only one statement
public static void argumentFunction(int a,int b){
    System.out.println(a+b);
}
//Write the complete argumentFunction below.
//The function should take two arguments a and b
//The function should have only one statement


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t-->0) {
            int a=scn.nextInt();
            int b=scn.nextInt();
            argumentFunction(a,b);
        }
        scn.close();
    }
}
// } Driver Code Ends
