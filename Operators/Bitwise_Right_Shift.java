//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends
//User function Template for Java

public static void utility(int a, int b){

    //just complete below statement
    int ans = a>>b;

    //print the result
    System.out.println(ans);
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            utility(a, b);
        }
        scn.close();
    }
}
// } Driver Code Ends
