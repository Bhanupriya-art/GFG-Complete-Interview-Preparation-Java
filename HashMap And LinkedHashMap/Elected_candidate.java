class Solution {
    public static String electionWinner(String arr[]) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String name : arr) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        String winner = "";
        int maxVotes = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String candidate = entry.getKey();
            int votes = entry.getValue();
            if (votes > maxVotes || (votes == maxVotes && candidate.compareTo(winner) < 0)) {
                maxVotes = votes;
                winner = candidate;
            }
        }
        return winner;
    }
}
