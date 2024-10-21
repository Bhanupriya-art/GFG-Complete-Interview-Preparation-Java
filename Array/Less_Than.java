//{ Driver Code Starts
//Initial Template for Java


import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends
//User function Template for Java

public static int[] lessThan(int[] numbers,int k){
    
    //write your code here
    //return array with elements less than k
    int count = 0;
    for(int num : numbers){
        if(num < k){
            count++;
        }
    }
    
    int arr[] = new int[count];
    int index=0;
    for(int num : numbers){
        if(num < k){
            arr[index++] = num;
        }
    }
    return arr;
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
            }int k = scn.nextInt();
            int[] res = lessThan(numbers,k);

            for(int i = 0; i < res.length; i++){
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}
// } Driver Code Ends
