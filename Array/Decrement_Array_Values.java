//{ Driver Code Starts
//Initial Template for Java


import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java
public static int[] decrementArrayElements(int[] numbers){
    //Write your code here
    for(int i=0;i<numbers.length;i++){
        numbers[i] -=1;
    }
    return numbers;
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
            int[] res = decrementArrayElements(numbers);

            for(int i = 0; i < n; i++){
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}
// } Driver Code Ends
