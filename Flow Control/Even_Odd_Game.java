//{ Driver Code Starts
//Initial Template for Java



import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends
//User function Template for Java

public static void utility(int number){
    if(number % 2 == 0){
        System.out.print("Friend");
    }
    else{
        System.out.print("You");
    }
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int number = scn.nextInt();
            utility(number);
            System.out.println();
        }
        scn.close();
    }
}
// } Driver Code Ends
