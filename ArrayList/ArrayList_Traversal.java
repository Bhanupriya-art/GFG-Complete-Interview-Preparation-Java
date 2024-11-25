//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {

    
// } Driver Code Ends
//User function Template for Java

// fucntion should print the list 
// space separated. The new line is
// given by the driver's code.
public static void listTraversal(ArrayList<Integer> numbers){
    for(int i=0 ; i<numbers.size();i++){
    System.out.print(numbers.get(i)+" ");
    }
    // code here
}


//{ Driver Code Starts.

    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            String input[] = read.readLine().split("\\s+");
            ArrayList<Integer> list = new ArrayList<Integer>();

            for (int i = 0; i < input.length; i++) {
                list.add(Integer.parseInt(input[i]));
            }

            listTraversal(list);
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends
