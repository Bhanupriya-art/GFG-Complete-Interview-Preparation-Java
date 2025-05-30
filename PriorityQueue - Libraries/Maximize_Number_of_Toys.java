// User function Template for Java

class Solution {
    public static int max_toys(int arr[], int k) {
        // Your code here
        Arrays.sort(arr);
        int count = 0;
        for(int price : arr) {
            if(k >= price) {
                k -= price;
                count++;
            } else{
                break;
            }
        }
        return count;
    }
}
