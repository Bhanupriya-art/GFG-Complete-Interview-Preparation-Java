//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Solution sln = new Solution();
            System.out.println(sln.findMin(a, b));

            System.out.println("~");
        }
    }
}


// } Driver Code Ends
//User function Template for Java

class TestClass
{   
    int a, b, Min;
    
    TestClass(){};
    
    TestClass(int x,int y)
    {
        this.a = x;
        this.b = y;
        this.Min = Integer.MAX_VALUE;
    }
    public void findMin()
    {
        
        // Add your code here. 
        // method findMin() which prints the Minimum value of a$b.
        
        int minValue = Integer.MAX_VALUE;
        
        try {
            int result = a + b;
            minValue = Math.min(minValue, result);
        } catch (Exception e) {}
        
        try {
            int result = a - b;
            minValue = Math.min(minValue, result);
        } catch (Exception e) {}
        
        try {
            int result = a * b;
            minValue = Math.min(minValue, result);
        } catch (Exception e) {}
        
        try {
            if (b != 0) {
                int result = a / b;
                minValue = Math.min(minValue, result);
            }
        } catch (Exception e) {}
        
        System.out.print(minValue);
        
        
    }
    
}


//{ Driver Code Starts.
// } Driver Code Ends
