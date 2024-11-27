//{ Driver Code Starts
// Initial Template for Java

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static ArrayList<Integer> getSmaller(int arr[], int x){
    
    //write your code here
    //return an arraylist with elements smaller than x
    //maintain the order while traversing
    ArrayList<Integer> a = new ArrayList<>();
    for(int i = 0; i<arr.length; i++){
        if(arr[i] < x){
            a.add(arr[i]);
        }
    }return a;
    
    
}


//{ Driver Code Starts.

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String temp[] = sc.nextLine().trim().split(" ");
            int n = temp.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(temp[i]);
            }
            int target = sc.nextInt();
            sc.nextLine();
            ArrayList<Integer> ans = getSmaller(arr, target);

            for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends
