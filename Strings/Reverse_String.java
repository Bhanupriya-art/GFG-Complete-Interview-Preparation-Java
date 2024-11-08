//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
class GFG{
    
    
// } Driver Code Ends
//User function Template for Java


// complete the function
// the function should return the reversed string
public static String reverseString(String s){
    // code here
    String b = "";
    int ptr = s.length()-1;
    for(int i = ptr; i>=0; i--){
        b = b+s.charAt(i);
    }
    return b;
}



//{ Driver Code Starts.
    
    
    public static void main(String args[])throws IOException{
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while( t-- > 0){
            
            String s = read.readLine().trim();
            String reversed = reverseString(s);
            System.out.println(reversed);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends
