// User function Template for Java
class Solution {
    public static int countOnce(int arr[]) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr) {
            set.add(num);
        }
        return set.size();
    }
}
