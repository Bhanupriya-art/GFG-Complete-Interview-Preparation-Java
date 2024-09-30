//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends
//User function Template for Java

public static void triangle(int S){
     for (int i = 1; i <= S; i++) {
            if (i == S) {
                // Print the last row with S stars and a single space between them
                for (int j = 1; j <= S; j++) {
                    System.out.print("* ");
                }
            } else {
                // Print the first star of the row
                System.out.print("*");
                // Print 2*(i-1) spaces between the stars
                for (int j = 1; j < i; j++) {
                    System.out.print("  ");
                }
                // Print the second star of the row if not the first line
                if (i > 1) {
                    System.out.print(" *");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
   
    
    
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int s = scn.nextInt();
            triangle(s);
        }
        scn.close();
    }
}
// } Driver Code Ends
