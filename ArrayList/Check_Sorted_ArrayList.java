//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {

    
// } Driver Code Ends
//User function Template for Java

public static boolean isSorted(ArrayList<Integer> numbers){
    boolean ascending = true;
    boolean descending = true;
    for(int i= 1; i<numbers.size(); i++){
        if((numbers.get(i)) < (numbers.get(i-1))){
            ascending = false;
            break;
        }
    }

    for(int i= 1; i<numbers.size(); i++){
        if((numbers.get(i)) > (numbers.get(i-1))){
            descending =  false;
            break;
        }
    }
    return ascending || descending ;
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

            if (isSorted(list))
                System.out.println("Sorted");
            else
                System.out.println("Not Sorted");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends
