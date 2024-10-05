//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static int nFactorial(int n){
    int ans = 1;
    for(int i=n;i>0;i--){
        ans *=i;
    }
    //Write your code here
    
    return ans;
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int ans = nFactorial(n);
            System.out.println(ans);
        }
        scn.close();
    }
}
// } Driver Code Ends
