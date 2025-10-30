class Solution {
    public ArrayList<Integer> filterByDigits(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int num : arr) {
            String s = String.valueOf(num);
            boolean valid = true;
            for (char c : s.toCharArray()) {
                if (c != '1' && c != '2' && c != '3') {
                    valid = false;
                    break;
                }
            }
            if (valid) res.add(num);
        }
        if (res.isEmpty()) res.add(-1);
        return res;
    }
}
