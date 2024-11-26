//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {

    
// } Driver Code Ends
//User function Template for Java


public static ArrayList<ArrayList<Integer>> evenOdd(ArrayList<Integer> numbers){
   ArrayList<Integer>even = new ArrayList<>();
   ArrayList<Integer>odd = new ArrayList<>();
   for(int i=0;i<numbers.size();i++){
       if(numbers.get(i) %2 == 0){
           even.add(numbers.get(i));
       }
       else{
           odd.add(numbers.get(i));
       }
   }
   ArrayList<ArrayList<Integer>> result= new ArrayList<>();
   result.add(even);
   result.add(odd);
   
   return result;
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

            ArrayList<ArrayList<Integer>> evenOdd = evenOdd(list);

            Iterator<Integer> even = evenOdd.get(0).iterator();

            while (even.hasNext()) {
                System.out.print(even.next() + " ");
            }

            System.out.println();

            Iterator<Integer> odd = evenOdd.get(1).iterator();

            while (odd.hasNext()) {
                System.out.print(odd.next() + " ");
            }
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends
