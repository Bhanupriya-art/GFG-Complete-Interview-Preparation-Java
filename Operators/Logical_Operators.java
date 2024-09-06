//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public  static  void utility(boolean a, boolean b){
    //Do a AND b below
    boolean p = a && b;
    //Do a OR b below
    boolean q = a || b;
    //Do NOT a below
    boolean r =  !a;

    System.out.println(p + " " + q + " " + r);
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            boolean a = scn.nextBoolean();
            boolean b = scn.nextBoolean();
            utility(a, b);
        }
        scn.close();
    }
}
// } Driver Code Ends
