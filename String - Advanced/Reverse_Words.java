class Solution {
    public String reverseWords(String s) {
        String[] parts = s.split("\\.+");
        List<String> list = new ArrayList<>();
        for (String p : parts) {
            if (!p.isEmpty()) list.add(p);
        }
        Collections.reverse(list);
        return String.join(".", list);
    }
}
