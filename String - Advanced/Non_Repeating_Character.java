class Solution {
    char nonrepeatingCharacter(String s) {
        int[] f = new int[26];
        for (char c : s.toCharArray()) f[c - 'a']++;
        for (char c : s.toCharArray()) if (f[c - 'a'] == 1) return c;
        return '$';
    }
}
