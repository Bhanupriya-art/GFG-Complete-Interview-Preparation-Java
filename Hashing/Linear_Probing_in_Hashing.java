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
            int array_size = sc.nextInt();
            
            int arr[] = new int[array_size];
            for(int i = 0; i < array_size; i++)
             arr[i] = sc.nextInt();
             
            // int hash_table[] = new int[hash_size];
            // for(int i = 0; i < hash_size; i++)
            //     hash_table[i] = -1;
            Solution obj = new Solution();
            int hash_table[] = obj.linearProbing(hash_size, arr, array_size);
            
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
    //using Linear Probing to handle collisions.
    int[] linearProbing(int hash_size, int arr[], int sizeOfArray)
    {
        //Your code here
        int[] hashtable = new int[hash_size];
        for(int i = 0; i < hash_size; i++){
            hashtable[i] = -1;
        }
        for(int i = 0; i < sizeOfArray; i++){
            int key = arr[i];
            int hashIndex = key % hash_size;
            if(hashtable[hashIndex] == -1){
                hashtable[hashIndex] = key;
            }else{
                int j = hashIndex;
                while(hashtable[j] != -1 && hashtable[j] != key){
                    j = (j + 1) % hash_size;
                    if(j == hashIndex){
                        break;
                    }
                }
                if(hashtable[j] == -1){
                    hashtable[j] = key;
                }
            }
        }
        return hashtable; 
    }
}
