//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
class GFG{
    
    
// } Driver Code Ends
//User function Template for Java


// function should print the alphabets
// from c1 to c2 (space separated)
// No need to print the new line
// The new line will be printed by the
// driver's code.

public static void alphabets(char c1, char c2){
    // code here
    for(char c = c1; c<=c2; c++)
    System.out.print(c + " " );
}


//{ Driver Code Starts.
    
    
    public static void main(String args[])throws IOException{
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while( t-- > 0){
            
            char c1 = read.readLine().trim().charAt(0);
            char c2 = read.readLine().trim().charAt(0);
            
            alphabets(c1, c2);
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends
