class Solution {
    public static String TieBreak(String arr[]) {
        Map<String, Integer> map = new HashMap<>();
        for (String name : arr) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        int maxVotes = 0;
        String winner = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            int votes = entry.getValue();
            if (votes > maxVotes || (votes == maxVotes && name.compareTo(winner) < 0)) {
                maxVotes = votes;
                winner = name;
            }
        }
        return winner;
    }
}
