//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends
//User function Template for Java

public static void utility(int d, int n){
    //write your code here
    int x =  (n % 7);
    int ans = d-x;
    if(ans >= 0){
        System.out.print(ans);
    }
    else{
        System.out.print(ans + 7);
    }
    
    
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int d = scn.nextInt();
            int n = scn.nextInt();
            utility(d, n);
            System.out.println();
        }
        scn.close();
    }
}
// } Driver Code Ends
