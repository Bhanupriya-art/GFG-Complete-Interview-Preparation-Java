//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends
//User function Template for Java

public static void invTriangleWall(int s){
    
    //Write your code here
    int i=1;
    while(i<=s){
        int j=i;
        while(j<=s){
            System.out.print("* ");
            j++;
        }
        System.out.println();
        i++;
    }
    
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int s = scn.nextInt();
            invTriangleWall(s);
        }
        scn.close();
    }
}
// } Driver Code Ends
