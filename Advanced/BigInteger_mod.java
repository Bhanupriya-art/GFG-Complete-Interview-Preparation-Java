//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.math.BigInteger;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

/* Class MathematicalOperation with mod fucntion
* x, y : Two parameters of BigIntegers to find mod
*/
class MathematicalOperation{
    
    static BigInteger mod(BigInteger x, BigInteger y){
        // Your code here  
        
        return y.mod(x);
    }
    
}


//{ Driver Code Starts.

// Driver class with main function
class GFG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        while (testcase-- > 0) {
            // Taking first element
            // in BigInteger x
            BigInteger x = sc.nextBigInteger();

            // Taking second element in
            // BigInteger y
            BigInteger y = sc.nextBigInteger();

            // Calling function add to find mod two BigIntegers
            MathematicalOperation obj = new MathematicalOperation();
            System.out.println(obj.mod(x, y));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends
