class Solution {
    public static int unique_substring(String s) {
        HashSet<String> set = new HashSet<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < n; j++) {
                sb.append(s.charAt(j));
                set.add(sb.toString());
            }
        }
        return set.size();
    }
}
