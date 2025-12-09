class Solution {
    public static String concatenatedString(String s1, String s2) {
        boolean[] present1 = new boolean[256];
        boolean[] present2 = new boolean[256];

        for (char c : s1.toCharArray()) present1[c] = true;
        for (char c : s2.toCharArray()) present2[c] = true;

        StringBuilder res = new StringBuilder();

        for (char c : s1.toCharArray()) {
            if (!present2[c]) res.append(c);
        }

        for (char c : s2.toCharArray()) {
            if (!present1[c]) res.append(c);
        }

        return res.length() == 0 ? "-1" : res.toString();
    }
}
