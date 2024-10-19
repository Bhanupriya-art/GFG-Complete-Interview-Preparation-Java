//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends
//User function Template for Java

public static void arrayTraversalReverse(int[] numbers){
    //Write your code below
    for(int i=numbers.length-1; i>=0; i--){
        System.out.print(numbers[i]+ " ");
    }
    
    
    //Don't add a new line as it is provided by the driver code
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int[] numbers = new int[n];
            for(int i = 0; i < n; i++){
                numbers[i] = scn.nextInt();
            }
            arrayTraversalReverse(numbers);
            System.out.println();
        }
        scn.close();
    }
}
// } Driver Code Ends
