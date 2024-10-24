//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            int M[][] = new int[N][N];
            String arr[] = in.readLine().trim().split("\\s+");
            for(int i = 0;i < N*N; i++)
                M[i/N][i%N] = Integer.parseInt(arr[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.distinct(M, N));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution{
    static int distinct(int M[][], int N)
    {
        // code here
        int maxElement = 1001;
        int[] count = new int[maxElement];

        for (int j = 0; j < N; ++j) {
            count[M[0][j]] = 1;
        }

        for (int i = 1; i < N; ++i) {
            boolean[] rowPresent = new boolean[maxElement];

            for (int j = 0; j < N; ++j) {
                rowPresent[M[i][j]] = true;
            }

            for (int k = 0; k < maxElement; ++k) {
                if (count[k] == i && rowPresent[k]) {
                    count[k] = i + 1;
                }
            }
        }

        int distinctCount = 0;
        for (int i = 0; i < maxElement; ++i) {
            if (count[i] == N) {
                distinctCount++;
            }
        }
        return distinctCount;
    }
}
