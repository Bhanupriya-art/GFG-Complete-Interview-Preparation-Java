//{ Driver Code Starts
// Initial Template for Java

import java.io.*;

class GFG {

    
// } Driver Code Ends
//User function Template for Java

// function to check if s is palindrome
// It should return true is the given
// string is palindrome otherwise false
public static boolean isPalin(String s){
    // code here
    int start = 0;
    int end = s.length() - 1;
    boolean ispal = true;
    s = s.toLowerCase();
    while(start<end){
        if(s.charAt(start) != s.charAt(end)){
            ispal = false;
            break;
        }
        start ++; 
        end--;
        }
        if(ispal ==  true){
            return true;
        }
        else{
            return false;
            
     }
}


//{ Driver Code Starts.

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String s = read.readLine().trim();

            boolean palindrome = isPalindrome(s);
            if (palindrome)
                System.out.println("True");
            else
                System.out.println("False");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends
