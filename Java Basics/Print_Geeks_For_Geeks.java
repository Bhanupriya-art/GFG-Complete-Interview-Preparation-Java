//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Geeks{
    
    //comment the line that outputs "Hello World"
    static void print(){
        
        //Prints Hello World
        //System.out.println("Hello World");
        //Prints GeeksForGeeks
        System.out.println("GeeksForGeeks");
      
    }
    
}


//{ Driver Code Starts.
 
class gfg{
    
    public static void main(String args[]){
        //Creating an Object of Scanner class
        Scanner sc = new Scanner(System.in);
        
        //Getting number of testcases
        int testcase = sc.nextInt();
        
        // Taking input for all testcases
        while(testcase-- > 0){
            
            //Creating an Object of class Geeks
            Geeks g = new Geeks();
            
            //Calling the comments function of class Geeks
            g.print();
        }
    }
    
} 
// } Driver Code Ends
