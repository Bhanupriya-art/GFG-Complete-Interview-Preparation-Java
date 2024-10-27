//{ Driver Code Starts
// Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static double posAverage(int[] numbers){
    
    
    //Write your code to find average of positive numbers in numbers array
    //return the answer
    int sum = 0;
    int count = 0;
    for(int i = 0; i<numbers.length; i++){
        if(numbers[i] >= 0){
            sum += numbers[i];
            count++;
        }
    }
    if(count == 0){
        return 0.0;
    }
    double avg = (double) sum / count ;
    return avg;
}


//{ Driver Code Starts.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            double avg = posAverage(arr);
            System.out.println(avg);

            System.out.println("~");
        }
        scn.close();
    }
}
// } Driver Code Ends
