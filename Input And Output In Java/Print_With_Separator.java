//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static void utility(String a, String b, String separator){

    //Your code below
      System.out.println(a+separator+b);
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
        while(t-- > 0) {
            String a = scn.nextLine();
            String b = scn.nextLine();
            String separator = scn.nextLine();
            utility(a, b, separator);
        }
        scn.close();
    }
}
// } Driver Code Ends
