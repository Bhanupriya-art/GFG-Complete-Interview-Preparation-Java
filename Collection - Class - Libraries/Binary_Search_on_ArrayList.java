class Solution {
    public static int binarySearchAL(ArrayList<Integer> list, int k) {
        int low = 0, high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = list.get(mid);

            if (midVal == k) {
                return mid; 
            } else if (midVal < k) {
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }

        return -1; 
    }
}
