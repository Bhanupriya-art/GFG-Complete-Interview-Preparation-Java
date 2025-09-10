class Solution {
    public int maxWater(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1, ans = 0;
        while (left < right) {
            ans = Math.max(ans, (right - left - 1) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) left++;
            else right--;
        }
        return ans;
    }
}
