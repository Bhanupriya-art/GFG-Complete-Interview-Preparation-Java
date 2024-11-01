//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
class GFG{
    
    
// } Driver Code Ends
//User function Template for Java


// functions should slice the given string
// i.e. remove the first and the last character
// of the given string and return the sliced 
// string
public static String sliceString(String s){
    // code here
    if(s.length()>2){
        return s.substring(1,s.length()-1);
    }
    else{
        return "";
    }
}



//{ Driver Code Starts.
    
    public static void main(String args[])throws IOException{
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while( t-- > 0){
            
            String s = read.readLine().trim();
            
            
            String slicedString = sliceString(s);
            
            System.out.println(slicedString);
            
        
System.out.println("~");
}
    }
}
// } Driver Code Ends
