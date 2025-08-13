class Solution {
    String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public ArrayList<String> possibleWords(int[] arr) {
        ArrayList<String> res = new ArrayList<>();
        backtrack(arr, 0, new StringBuilder(), res);
        return res;
    }
    void backtrack(int[] arr, int idx, StringBuilder sb, ArrayList<String> res) {
        if (idx == arr.length) {
            res.add(sb.toString());
            return;
        }
        String letters = mapping[arr[idx]];
        for (char c : letters.toCharArray()) {
            sb.append(c);
            backtrack(arr, idx + 1, sb, res);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
