//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends
//User function Template for Java

public static void countDigits(int n){

    //write your code here
    //print number of digits in n
    int count = 0;
    while(n>0){
        n = n/10;
        count = count + 1;
    }
    System.out.print(count);
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            countDigits(n);
            System.out.println();
        }
        scn.close();
    }
}
// } Driver Code Ends
