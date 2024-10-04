//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static void squareWall(int s){
    for(int i = 0; i < s; i++){
        for(int j=0; j<s; j++){
            System.out.print("* ");
        }
        System.out.println();
        //Write your code here
        
    }
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int s = scn.nextInt();
            squareWall(s);
        }
        scn.close();
    }
}
// } Driver Code Ends
