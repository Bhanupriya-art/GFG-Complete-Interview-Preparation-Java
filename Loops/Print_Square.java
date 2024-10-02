//{ Driver Code Starts
// Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
// User function Template for Java

public static void square(int s) {
    // Complete the code given below
   for(int i=1;i<=s;i++){
       for(int j=1;j<=s;j++){
           if(i==s || i==1 || j==1||j==s){
               System.out.print("* ");
           }
           else{
               System.out.print("  ");
           }
       }
       System.out.println();
   }
   
}


//{ Driver Code Starts.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int s = scn.nextInt();
            square(s);
        }
        scn.close();
    }
}
// } Driver Code Ends
