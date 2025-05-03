//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.ListIterator;

class GFG {
    public static void main(String[] args) {
        // Creating an object of class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking input the total number of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // Taking the total number of rows
            int n = sc.nextInt();
            sc.nextLine();
            // Declaring and Initalizing an ArrayList
            ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                // Taking the number of columns
                String tempS[] = sc.nextLine().trim().split(" ");
                // Declaring and Intializing an ArrayList for each row
                ArrayList<Integer> temp = new ArrayList<>();
                int m = tempS.length;
                for (int j = 0; j < m; j++) {
                    temp.add(Integer.parseInt(tempS[j]));
                }

                arr.add(temp);
            }

            // Calling the method minimum_verical_sum
            System.out.println(minimumVerticalSum(arr));
        }
    }

    
// } Driver Code Ends


// User function Template for Java

public static int minimumVerticalSum(ArrayList<ArrayList<Integer>> arr) {
    if(arr==null|| arr.isEmpty()){
        return 0;
    }
    int maxCols=0;
    for(int i=0; i<arr.size(); i++){
        ArrayList<Integer> row= arr.get(i);
        if (row.size() > maxCols){
            maxCols= row.size();
        }
    }
    int colSum[]= new int[maxCols];
    for(int i=0; i<arr.size(); i++){
        ArrayList<Integer> row= arr.get(i);
        for(int col=0; col<row.size(); col++){
            colSum[col]= colSum[col] + row.get(col);
        }
    }
    int minSum= colSum[0];
    for(int i=0; i< colSum.length; i++){
        int sum= colSum[i];
        if(sum< minSum){
            minSum=sum;
        }
    }
    return minSum;
}




//{ Driver Code Starts.
}
// } Driver Code Ends
