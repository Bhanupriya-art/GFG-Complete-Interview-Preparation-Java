//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.io.*;

class Gfg
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testcases = sc.nextInt();
        while(testcases-- > 0)
        {
            Geeks obj=new Geeks();
            Geeks.top=-1; //For each testcase the stack top starts from -1
            
            int queries=sc.nextInt(); //How many queries we want to execute
            
            
            while(queries-->0) //While queries exist
            {
                
                int queryType=sc.nextInt(); //What's the query type
                 
                if(queryType==1) //If query is push then we input x and push it
                {
                    int x=sc.nextInt();
                   
                    obj.push(x);//pushing x
                }
                else if(queryType==2) //If query is pop the we just pop the top element
                {
                    obj.pop();
                }
                else
                {
                    obj.display(); //The third query is display
                }
                
            }
        
        
System.out.println("~");
}
    }
}

class Geeks
{
    public static final int stackMax=100000;
    public static int stack[]=new int[stackMax];
    public static int top=-1;
    
  
// } Driver Code Ends

//User function Template for Java

//Complete these functions
  //Function to push data at the top of stack
    public void push(int data)
    {
        //Your code here
        if(top == stackMax - 1){
            System.out.println("Stack Full");
            return;
        }
        stack[++top] = data;
    }
    
    //Function to pop the topmost data
    public  void pop()
    {
        //Your code here
        if(top == -1){
            System.out.println("Stack Empty");
            return;
        }
        top--;
        
    }
    
    //Function to display the stack from index 0 
    public  void display()
    {
        //Your code here
        if(top == -1){
            System.out.println("-1");
            return;
        }
        for(int i = 0; i <= top; i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }



//{ Driver Code Starts.

    
}
// } Driver Code Ends
