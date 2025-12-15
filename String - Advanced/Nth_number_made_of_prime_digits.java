class Solution {
    public static int primeDigits(int n) {
        String[] primes = {"2","3","5","7"};
        List<String> list = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        for(String p : primes) q.add(p);
        while(!q.isEmpty()) {
            String curr = q.poll();
            list.add(curr);
            for(String p : primes) q.add(curr + p);
        }
        return Integer.parseInt(list.get(n-1));
    }
}
