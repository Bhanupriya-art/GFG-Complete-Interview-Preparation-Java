//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
class GFG{
    
    
// } Driver Code Ends
//User function Template for Java


// function to print the two string
// first string: the first character is changed 
// to uppercase
// second string: complete string is changed
// to upper case.
// print both the string in new line.

public static void changeCase(String s){
    // code here
    System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
    System.out.println(s.toUpperCase());
    
}


//{ Driver Code Starts.
    
    
    public static void main(String args[])throws IOException{
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while( t-- > 0){
            
            String s = read.readLine().trim();
            
            changeCase(s);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends
