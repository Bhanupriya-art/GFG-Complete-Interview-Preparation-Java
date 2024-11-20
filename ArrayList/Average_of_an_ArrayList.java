//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {

    
// } Driver Code Ends
//User function Template for Java

// function should calculate and return the 
// average of all the non negative integers
// from the arraylist provided in the 
// parameter
public static double posAverage(ArrayList<Integer> numbers){
    int sum = 0;
    int count = 0;
    for(int num : numbers){
        if(num >= 0){
            sum+= num;
            count ++;
        }
    }
    if(count == 0){
        return 0.0;
    }
    return (double) sum/count ;
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

            double average = posAverage(list);
            System.out.println(average);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends
