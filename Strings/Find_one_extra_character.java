//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static char extraChar(String s1, String s2){

    //write your code here
    int res = 0;
    int n = s1.length();
    for(int i = 0; i<n ; i++){
        res = res ^ s1.charAt(i) ^ s2.charAt(i);
        
        
    }
    res = res ^ s2.charAt(n);
    return (char) (res);
}



//{ Driver Code Starts.

    public static void main(String[] args) throws IOException
    {
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while( t-- > 0) {
            String s1 = read.readLine().trim();
            String s2 = read.readLine().trim();
            System.out.println(extraChar(s1, s2));
        
System.out.println("~");
}
    }
}





// } Driver Code Ends
