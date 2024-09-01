//{ Driver Code Starts
import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static void utility(String a, String b){
     
    //Write your code below. 

System.out.print(a +" "+b);
    //Write your code below.
}



//{ Driver Code Starts.

    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
        while(t-- > 0) {
            String a = scn.nextLine();
            String b = scn.nextLine();
            utility(a, b);
            System.out.println(); //This auto appends the new line
        }
        scn.close();
    }
}
// } Driver Code Ends
