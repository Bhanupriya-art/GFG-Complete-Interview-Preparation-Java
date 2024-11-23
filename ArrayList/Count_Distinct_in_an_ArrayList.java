//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {

    
// } Driver Code Ends
//User function Template for Java


// function should return the count of
// distinct integers in the given 
// arraylist.
public static int countDistinct(ArrayList<Integer> numbers){
    HashSet<Integer> a = new HashSet<>(numbers);
    return a.size();
}


//{ Driver Code Starts.

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input[] = read.readLine().trim().split("\\s+");
            ArrayList<Integer> list = new ArrayList<Integer>();

            for (int i = 0; i < input.length; i++) {
                list.add(Integer.parseInt(input[i]));
            }
            System.out.println(countDistinct(list));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends
