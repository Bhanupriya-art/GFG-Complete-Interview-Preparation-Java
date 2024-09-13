//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static void utility(int a, int d, int n){
    //Complete the code above
    int ans = a+(n-1)*d;
    //Complete the code above
    
    //The line below prints the output. Don't change it!
    System.out.println(ans);
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int a = scn.nextInt();
            int d = scn.nextInt();
            int n = scn.nextInt();
            utility(a, d, n);
        }
        scn.close();
    }
}
// } Driver Code Ends
