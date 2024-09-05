//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public  static  void utility(int x, int y){
    //Perform addition x+y below
    int p = x+y;
    //Perform subtraction x-y below
    int q = x-y;
    //Perform multiplication x*y below
    int r = x*y;
    //Perform division x/y below
    int s =x/y;
    //Perform modulo operation x%y below
    int t = x%y;

    //The below code prints the output. Don't change it!
    System.out.println(p + " " + q + " " + r + " " + s + " " + t);
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int x = scn.nextInt();
            int y = scn.nextInt();
            utility(x, y);
        }
        scn.close();
    }
}
// } Driver Code Ends
