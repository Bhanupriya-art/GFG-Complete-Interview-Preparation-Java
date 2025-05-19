//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Reversing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Reading total number of test cases
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            // Creating a Queue
            Queue<Integer> queue = new LinkedList<>();

            // Reading all the elements as a string
            String input = br.readLine();

            // Splitting the string into separate elements based on spaces
            String[] elements = input.split(" ");

            // Adding all the elements to the Queue
            for (String element : elements) {
                int value = Integer.parseInt(element);
                queue.add(value);
            }

            // Creating an object of class Solution
            Solution solution = new Solution();

            // Calling reverseQueue method of class Solution
            queue = solution.reverseQueue(queue);

            // Printing the elements of the reversed queue
            while (!queue.isEmpty()) {
                int value = queue.peek();
                queue.poll();
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to reverse the queue.
    public Queue<Integer> reverseQueue(Queue<Integer> queue) {
        // code here.
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        return queue;
    }
}
