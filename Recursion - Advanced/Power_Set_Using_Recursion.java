class Solution {
    public ArrayList<String> powerSet(String s) {
        ArrayList<String> result = new ArrayList<>();
        generate(s, 0, "", result);
        return result;
    }
    private void generate(String s, int index, String current, ArrayList<String> result) {
        if (index == s.length()) {
            result.add(current);
            return;
        }
        generate(s, index + 1, current + s.charAt(index), result);
        generate(s, index + 1, current, result);
    }
}
