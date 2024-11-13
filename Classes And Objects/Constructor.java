//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

// } Driver Code Ends
//User function Template for Java

// design a class User 
// instance variable: name(String)
// Constructor: no parameter, initialize name to "Default"


// code here

class User{
    String name;
     User(){
         this.name = "Default";
     }
}



//{ Driver Code Starts.



class GFG{
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0){
            User user = new User();
            System.out.println(user.name);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends
