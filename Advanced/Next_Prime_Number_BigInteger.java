//{ Driver Code Starts
//Initial Template for Java

import java.math.BigInteger;
import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends
//User function Template for Java

public static int nextPrime(int n){
        
    //write your code here
    //Use BigInteger to solve
    BigInteger b = BigInteger.valueOf(n);
    BigInteger a = b.nextProbablePrime();
    return a.intValue();
    
        
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
        
System.out.println("~");
}
        scn.close();
    }
}





// } Driver Code Ends
