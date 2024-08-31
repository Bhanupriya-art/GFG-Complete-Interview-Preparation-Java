//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends
//User function Template for Java

public static void utility(String MyInput){
    //Write your code below that prints myInput
    System.out.println(MyInput);

    //Write your code below that prints myInput
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
        while(t-- > 0) {
            String MyInput = scn.nextLine();
            utility(MyInput);
        }
        scn.close();
    }
}
// } Driver Code Ends
