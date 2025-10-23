class Geeks {
    public static int sumExists(int arr[], int N, int sum) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(sum - num)) return 1;
            set.add(num);
        }
        return 0;
    }
}
