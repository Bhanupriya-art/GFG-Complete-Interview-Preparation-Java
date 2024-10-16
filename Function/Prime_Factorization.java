//{ Driver Code Starts
//Initial Template for Java




import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            
            printPrimeFactorization(n);
            
            System.out.println();
        }
    }
    
    
// } Driver Code Ends
//User function Template for Java

// This function should print the prime factorization
// of the number n
// The new line is given by the driver's code.
public static void printPrimeFactorization(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        
        if (n > 2) {
            System.out.print(n + " ");
        }
    }




//{ Driver Code Starts.

}
// } Driver Code Ends
