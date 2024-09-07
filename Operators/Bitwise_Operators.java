//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static void utility(int a, int b, int c){
    //Do a^a below
    int d= a^a;
    //Do c^b below
    int e=c^b;
    //Do a&b below
    int f=a&b;
    //Do c|(a^a) below
    int g=c |(a^a);
    //Do ~e below
    e= ~e;

    //The line below prints the output. Don't change it!
    System.out.println(d + " " + e + " " + f + " " + g);
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
            utility(a, b, c);
        }
        scn.close();
    }
}
// } Driver Code Ends
