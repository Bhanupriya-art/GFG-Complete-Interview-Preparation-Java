//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static void utility(int a, int b, int c, int d){
    //Complete the code above that stores the output of the expression
    int res = (a+b)/c +d;
    //Complete the code above that stores the output of the expression
    
    //This prints the output. Don't change it!
    System.out.println(res);
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            int d = scn.nextInt();
            utility(a, b, c, d);
        }
        scn.close();
    }
}
// } Driver Code Ends
