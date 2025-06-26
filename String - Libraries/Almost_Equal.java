class Geeks {

    static int coutChars(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (char c : s1.toCharArray()) freq1[c - 'a']++;
        for (char c : s2.toCharArray()) freq2[c - 'a']++;
        int count = 0;
        for (int i = 0; i < 26; i++) count += Math.abs(freq1[i] - freq2[i]);
        return count;
    }
}
