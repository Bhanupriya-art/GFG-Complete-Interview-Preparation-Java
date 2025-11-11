class Solution {
    public static int countVowels(String str) {
        boolean[] vowels = new boolean[5];
        for (char c : str.toCharArray()) {
            if (c == 'a') vowels[0] = true;
            else if (c == 'e') vowels[1] = true;
            else if (c == 'i') vowels[2] = true;
            else if (c == 'o') vowels[3] = true;
            else if (c == 'u') vowels[4] = true;
        }
        int count = 0;
        for (boolean v : vowels) if (v) count++;
        return count;
    }
}
