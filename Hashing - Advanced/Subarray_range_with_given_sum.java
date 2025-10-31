// User function Template for Java
class Solution {
    static int subArraySum(int arr[], int tar) {
        Map<Integer, Integer> prevSum = new HashMap<>();
        int count = 0, currSum = 0;
        for (int num : arr) {
            currSum += num;
            if (currSum == tar) count++;
            if (prevSum.containsKey(currSum - tar)) count += prevSum.get(currSum - tar);
            prevSum.put(currSum, prevSum.getOrDefault(currSum, 0) + 1);
        }
        return count;
    }
}
