class GfG {
    void add_Value(TreeMap<Integer, Integer> hm, int x, int y) {
        hm.put(x, y);
    }

    int find_value(TreeMap<Integer, Integer> hm, int x) {
        return hm.getOrDefault(x, -1);
    }

    int getSize(TreeMap<Integer, Integer> hm) {
        return hm.size();
    }

    void removeKey(TreeMap<Integer, Integer> hm, int x) {
        hm.remove(x);
    }

    void sorted_By_Key(TreeMap<Integer, Integer> hm) {
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.print(entry.getKey() + " ");
        }
        System.out.println();
    }
}
