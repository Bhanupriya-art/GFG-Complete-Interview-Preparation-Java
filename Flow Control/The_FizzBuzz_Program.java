//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static void fizzBuzz(int number){
    // Write your code here.
    if(number % 3 == 0 && number % 5 == 0){
        System.out.println("FizzBuzz");
    }
    else if(number % 3 == 0){
        System.out.println("Fizz");
    }
    else if(number % 5 == 0){
        System.out.println("Buzz");
    }else{
        System.out.println(number);
        
    }
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int number = scn.nextInt();
            fizzBuzz(number);
        }
        scn.close();
    }
}
// } Driver Code Ends
