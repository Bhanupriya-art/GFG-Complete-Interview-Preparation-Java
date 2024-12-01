//{ Driver Code Starts
// Initial Template for Java

import java.math.BigInteger;
import java.util.Scanner;

// Driver class with main function
class Main {

    
// } Driver Code Ends
//User function Template for Java

public static BigInteger factorial(int x){
        
    //write your code here
    //return factorial of x as datatype of BigInteger
    BigInteger f = new BigInteger("1");
    for(int i=2; i<=x; i++){
        f = f.multiply(BigInteger.valueOf(i));
    }
    return f;
}


//{ Driver Code Starts.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        while (testcase-- > 0) {
            // Taking input x
            int x = sc.nextInt();

            System.out.println(factorial(x));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends
