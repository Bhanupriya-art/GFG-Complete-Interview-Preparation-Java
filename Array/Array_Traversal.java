//{ Driver Code Starts
//Initial Template for Java


import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends
//User function Template for Java

public static void arrayTraversal(int[] numbers){
    //Write your code below
    for(int i=0; i< numbers.length; i++){
        System.out.print(numbers[i]+ " ");
    }
    //Don't provide the new line
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int[] numbers = new int[n];
            for(int i = 0; i < n; i++){
                numbers[i] = scn.nextInt();
            }
            arrayTraversal(numbers);
            System.out.println();
        }
        scn.close();
    }
}
// } Driver Code Ends
