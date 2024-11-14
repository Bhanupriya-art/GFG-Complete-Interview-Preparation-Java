//{ Driver Code Starts
//Initial Template for Java

import java.io.*;

// } Driver Code Ends
//User function Template for Java

// design a class with two constructor
// one default, the other parameterized

// code here
class User{
    String name;
    User(){
        this.name = "Default";
    }
    User(String name){
        this.name = name;
    }
}




//{ Driver Code Starts.


class GFG{
    public static void main(String args[]) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            User user = new User();
            System.out.println(user.name);
            
            String name = read.readLine();
            
            User user2 = new User(name);
            System.out.println(user2.name);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends
