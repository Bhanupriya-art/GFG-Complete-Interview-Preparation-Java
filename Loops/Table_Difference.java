//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static void difference(int n1, int n2){
    
    //Write your code here
    for(int i=1;i<=10;i++){
        int table1 = n1*i;
        int table2 = n2*i;
        int difference = table1 - table2 ;
        System.out.print(difference+" ");
    } 
    
    
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
            difference(n1, n2);
            System.out.println();
        }
        scn.close();
    }
}
// } Driver Code Ends
