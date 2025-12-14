class Solution {
    public static String smallestWindow(String s, String p) {
        if (s.length() < p.length()) return "";

        int[] freqP = new int[256];
        int[] freqS = new int[256];
        for (char c : p.toCharArray()) freqP[c]++;

        int start = 0, startIndex = -1, minLen = Integer.MAX_VALUE, count = 0;

        for (int end = 0; end < s.length(); end++) {
            freqS[s.charAt(end)]++;
            if (freqP[s.charAt(end)] != 0 && freqS[s.charAt(end)] <= freqP[s.charAt(end)]) count++;

            if (count == p.length()) {
                while (freqS[s.charAt(start)] > freqP[s.charAt(start)] || freqP[s.charAt(start)] == 0) {
                    if (freqS[s.charAt(start)] > freqP[s.charAt(start)]) freqS[s.charAt(start)]--;
                    start++;
                }
                int len = end - start + 1;
                if (len < minLen) {
                    minLen = len;
                    startIndex = start;
                }
            }
        }
        if (startIndex == -1) return "";
        return s.substring(startIndex, startIndex + minLen);
    }
}
