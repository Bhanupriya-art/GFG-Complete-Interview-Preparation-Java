//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str = read.readLine();
            System.out.println(new Solution().isPanagram(str)? "1":"0");
        
System.out.println("~");
}
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution
{

    // Complete the function
    // str: input string
    public static boolean isPanagram(String str)
    {
        // Check if given string is panagram
             int n = str.length();
             if(n<26){
                 return false;
             }
             boolean visited[] = new boolean[26];
             for(int i=0;i<n;i++){
                 char x = str.charAt(i);
                 if(x>='a' && x<= 'z')
                 visited [x-'a'] = true;
                 if(x>='A' && x <= 'Z')
                 visited[x-'A'] = true;
             }
             for(int i=0;i<26;i++){
             if(visited [i] == false)
             return false;
             }  
             return true;
         }
    };
