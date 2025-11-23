class Solution {
    public int binarySubstring(String s) {
        int count1 = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') count1++;
        }
        return count1 * (count1 - 1) / 2;
    }
}
