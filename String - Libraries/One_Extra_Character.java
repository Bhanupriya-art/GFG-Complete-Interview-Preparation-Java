class Solution {
    public static Character oneExtraCharacter(String s1, String s2) {
        int xor = 0;
        for (char ch : s1.toCharArray()) {
            xor ^= ch;
        }

        for (char ch : s2.toCharArray()) {
            xor ^= ch;
        }

        return (char) xor;
    }
}
