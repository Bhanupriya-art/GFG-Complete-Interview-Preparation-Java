//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class CountSort
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            String arr = "";
            arr = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.countSort(arr));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        // code here
        int RANGE = 255;
        int[] count = new int[RANGE+1];
        char[] result = new char[arr.length()];
        
        for(char ch : arr.toCharArray()){
            count[ch]++;
        }
        
        for(int i = 1; i <= RANGE; i++){
            count[i] += count[i-1];
        }
        
        for(int i = arr.length() - 1; i >= 0; i--){
            char ch = arr.charAt(i);
            result[count[ch] - 1] = ch;
            count[ch]--;
        }
        return new String(result);
    }
}
