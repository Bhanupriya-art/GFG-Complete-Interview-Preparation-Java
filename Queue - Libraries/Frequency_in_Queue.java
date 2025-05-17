//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends

class Geeks {
    static void enqueue(Queue<Integer> q, int k) {
        //  code here
        q.add(k);
    }

    static int findFrequency(Queue<Integer> q, int k) {

        int count = 0;
        for(int item : q){
            if(item == k){
                count++;
            }
        }
        //  code here
        return count;
    }
}


//{ Driver Code Starts.

// Driver class with driver code
class GFG {

    // Driver code
    public static void main(String[] args) {

        // Taking input using scanner class
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();
        while (testcase-- > 0) {
            // Declaring Queue
            Queue<Integer> q = new LinkedList<>();
            String temp[] = sc.nextLine().trim().split(" ");
            int n = temp.length;

            // Invoking object of Geeks class
            Geeks obj = new Geeks();

            for (int i = 0; i < n; i++) {
                int k = Integer.parseInt(temp[i]);
                obj.enqueue(q, k);
            }
            temp = sc.nextLine().trim().split(" ");
            int x = temp.length;
            for (int i = 0; i < x; i++) {
                int k = Integer.parseInt(temp[i]);
                int f = obj.findFrequency(q, k);
                if (f != 0) {
                    System.out.println(f);
                } else {
                    System.out.println("-1");
                }
            }

            System.out.println("~");
        }
    }
}
// } Driver Code Ends
