//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static void utility(int y){
    String isLeap = "False";
    if(y % 4==0 && y % 100 != 0){
        isLeap = "True";
    }
    else if(y % 400 == 0){
        isLeap = "True";
    }
    else {
        isLeap = "False";
    }
    System.out.println(isLeap);
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int y = scn.nextInt();
            utility(y);
        }
        scn.close();
    }
}
// } Driver Code Ends
