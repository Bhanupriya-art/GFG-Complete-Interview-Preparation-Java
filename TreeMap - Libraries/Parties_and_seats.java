class Geeks {
    public static void Election2019(String party[], int seats[], int n) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            map.put(party[i], seats[i]);
        }
        int maxSeats = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            if (entry.getValue() > maxSeats) {
                maxSeats = entry.getValue();
            }
        }
        System.out.println(maxSeats);
    }
}
