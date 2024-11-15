//{ Driver Code Starts
//Initial Template for Java

import java.io.*;

// } Driver Code Ends

// create a class addition
// with a static function add
// this should return the sum of
// two values(a,b) passed in the parameter
class Addition{
     public static int add(int a, int b){
         return a+b;
     }
}
// code here


//{ Driver Code Starts.


class GFG{
    public static void main(String args[]) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String input[] = read.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            System.out.println(Addition.add(a,b));
        }
    }
}
// } Driver Code Ends
