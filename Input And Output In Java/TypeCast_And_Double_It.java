//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Gfg{
    
    
// } Driver Code Ends
//User function Template for Java

public static void utility(String num){
    
    //Complete the syntax below. Convert num to int and double it
    int ans = Integer.parseInt(num)*2;
            
    System.out.println(ans);
}


//{ Driver Code Starts.
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        //input number of test cases
        int t = scn.nextInt();
        while(t-- > 0){
            //input num
            int num_int = scn.nextInt();
            String num = Integer.toString(num_int);
            utility(num);
        }
        
        scn.close();
    }
    
    
}  


// } Driver Code Ends
