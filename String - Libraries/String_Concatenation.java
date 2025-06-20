class Solution {
    public static String concatenateStrings(ArrayList<String> arr) {
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }
}
