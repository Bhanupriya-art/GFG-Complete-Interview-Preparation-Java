//{ Driver Code Starts
//Initial Template for Java


import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static int[] evenOdd(int[] numbers){

    //write your code here
    //return required array
    int counteven = 0;
    int countodd = 0;
    
    for(int num: numbers){
        if(num %2==0){
            counteven++ ;
        }else{
            countodd++ ;
        }
    }
    int[] even = new int[counteven];
    int[] odd  = new int[countodd];
    
    int indexeven = 0;
    int indexodd  = 0;
    
    for(int num : numbers){
        if(num %2 == 0){
            even [indexeven++] = num;
        }else{
            odd  [indexodd++]  = num;
        }
        
    }
    int[] result = new int[numbers.length];
    for(int i =0; i<counteven; i++){
        result[i] = even[i];
    }
    for(int i = 0; i<countodd; i++){
        result[counteven + i] = odd[i];
    }
    return result;
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
            int[] res = evenOdd(numbers);

            for(int i = 0; i < res.length;i++){
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}
// } Driver Code Ends
