//{ Driver Code Starts
//Initial Template for Java

import java.math.BigInteger;
import java.util.Scanner;

// Driver class with main function
class Main {
    
    
// } Driver Code Ends
//User function Template for Java

public static BigInteger fib(int n){
        
    //write your code here
    //return nth fibonacci number in BigInteger

    if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;

        BigInteger[] fib = new BigInteger[n + 1];
        
        fib[0] = BigInteger.ZERO;
        fib[1] = BigInteger.ONE;
        
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1].add(fib[i - 2]);
        }
        
        return fib[n];
    }



//{ Driver Code Starts.

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            //Taking input n
            int n = sc.nextInt();

            System.out.println(fib(n));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends
