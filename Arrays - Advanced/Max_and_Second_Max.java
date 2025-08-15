class Solution {
    public static ArrayList<Integer> largestAndSecondLargest(int arr[]) {
        int max = -1, secondMax = -1;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(max);
        res.add(secondMax);
        return res;
    }
}
