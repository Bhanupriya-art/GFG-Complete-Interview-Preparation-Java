class Solution {
    public static String caseSort(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();
        List<Character> upper = new ArrayList<>();
        List<Character> lower = new ArrayList<>();

        for (char c : chars) {
            if (Character.isUpperCase(c)) upper.add(c);
            else lower.add(c);
        }

        Collections.sort(upper);
        Collections.sort(lower);

        StringBuilder result = new StringBuilder();
        int u = 0, l = 0;
        for (char c : chars) {
            if (Character.isUpperCase(c)) result.append(upper.get(u++));
            else result.append(lower.get(l++));
        }

        return result.toString();
    }
}
