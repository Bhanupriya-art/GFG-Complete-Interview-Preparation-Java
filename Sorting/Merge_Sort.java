//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] left = new int[n1]; 
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++){
            left[i] = arr[l + i];
        }
        
        for (int i = 0; i < n2; i++){
            right[i] = arr[m + 1 + i];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2)
        {
            if (left[i] <= right[j])
            arr[k++] = left[i++];
            else
            arr[k++] = right[j++];
        }
        while (i < n1)
        arr[k++] = left[i++];
        while (j < n2)
        arr[k++] = right[j++];
    }

    void mergeSort(int arr[], int l, int r) {
        // code here
        if (l < r){
            int m = l + ( r - l) / 2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
}
