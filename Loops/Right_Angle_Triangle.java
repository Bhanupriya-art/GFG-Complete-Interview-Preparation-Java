//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends
//User function Template for Java

public static void triangleWall(int s){
    
    //Write your code here
    int i = 1;
    while( i<=s){
        int j = 1;
        while(j<= i){
            System.out.print("* ");
            j++;
        }
        i++;
        System.out.println();
    }
    
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int s = scn.nextInt();
            triangleWall(s);
        }
        scn.close();
    }
}
// } Driver Code Ends
