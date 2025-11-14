class Solution {
    public static String caseConversion(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char)(ch - 'a' + 'A'));
            } else {
                sb.append(ch); 
            }
        }
        return sb.toString();
    }
}
