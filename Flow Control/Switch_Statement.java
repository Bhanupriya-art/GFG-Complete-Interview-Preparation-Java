//{ Driver Code Starts
//Initial Template for Java



import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends
//User function Template for Java

public static void utility(int number){
    switch(number){
        case 1 :
            System.out.println("One");
                break;
        default :
            System.out.println("Not One");
    }
    //write your code here
    
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
