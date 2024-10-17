//{ Driver Code Starts
//Initial Template for Java


import java.util.Scanner;

class Main {
    
// } Driver Code Ends
//User function Template for Java

public static int arrayLength(int[] numbers){
    
    //Write your code here
    //return length of array
    return numbers.length;
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int[] numbers = new int[n];
            for(int i=0; i < n; i++){
                numbers[i] = scn.nextInt();
            }
            System.out.println(arrayLength(numbers));
        }
        scn.close();
    }
}
// } Driver Code Ends
