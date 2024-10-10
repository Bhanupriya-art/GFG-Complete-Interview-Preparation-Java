//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static int nextPrime(int n){
      
        
    //code here to find next prime number
    //return next prime number
    n++;
    while(true){
        int i;
        for(i = 2; i <= n; i++){
            if(n%i == 0){
                break;
            }
        }
        if(i == n)return n;
        n++;
    }
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int ans = nextPrime(n);
            System.out.println(ans);
        }
        scn.close();
    }
}
// } Driver Code Ends
