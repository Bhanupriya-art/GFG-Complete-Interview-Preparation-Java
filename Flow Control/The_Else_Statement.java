//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static void utility(int number){
    //Write your if-else statement below
    if( number > 100){
        System.out.println("Big");
    }
    else{
        System.out.println("Number");
    }
    
    //Write your if-else statement above
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int number = scn.nextInt();
            utility(number);
        }
        scn.close();
    }
}
// } Driver Code Ends
