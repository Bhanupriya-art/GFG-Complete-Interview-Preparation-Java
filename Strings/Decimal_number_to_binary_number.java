//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    
// } Driver Code Ends
//User function Template for Java


public static void toBinary(String N)
{
        // Code here
        int num = Integer.parseInt(N);
        String S = "";
       while(num>0){
            S = (num % 2) + S;
            num = num/2;
        }
        System.out.print(S);
}


//{ Driver Code Starts.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());

            System.out.print(toBinary(N));
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends
