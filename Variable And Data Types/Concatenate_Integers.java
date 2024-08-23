//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public  static  void concatenate(int a, int b){
    //Complete the code below to concatenate a and b
    String ans =Integer.toString(a)+Integer.toString(b);
    //Complete the code above to concatenate a and b
    System.out.println(ans);
}



//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            concatenate(a, b);
        }
    }
}
// } Driver Code Ends
