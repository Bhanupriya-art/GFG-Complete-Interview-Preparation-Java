//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- >0)
        {
            int hash_size = sc.nextInt();
            int N= sc.nextInt();
            
            int arr[] = new int[N];
            
            for(int i = 0; i < N ; i++)
             arr[i] = sc.nextInt();
             
            int hash_table[] = new int[hash_size];
            Solution obj = new Solution();
            obj.quadraticProbing(hash_table, hash_size, arr, N);
            
            for(int i = 0; i <hash_size; i++)
             System.out.print(hash_table[i] + " ");
             
             System.out.println();
             
        
System.out.println("~");
}
    }
    
}

// } Driver Code Ends




class Solution{
    //Function to fill the array elements into a hash table 
    //using Quadratic Probing to handle collisions.
    static void quadraticProbing(int[] hash, int hashSize, int arr[], int n)
    {
        for (int i = 0; i < hashSize; i++) {
            hash[i] = -1;
        }

        // Insert each element into the hash table
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int index = key % hashSize; // Compute hash index
            int j = 0;

            // Use Quadratic Probing to resolve collisions
            while (hash[(index + j * j) % hashSize] != -1 && hash[(index + j * j) % hashSize] != key) {
                j++;
                // If all slots are probed, exit (should not happen given constraints)
                if (j == hashSize) {
                    break;
                }
            }

            // Insert the element if an empty slot is found
            int targetIndex = (index + j * j) % hashSize;
            if (hash[targetIndex] == -1) {
                hash[targetIndex] = key;
            }
        }
    }
}
