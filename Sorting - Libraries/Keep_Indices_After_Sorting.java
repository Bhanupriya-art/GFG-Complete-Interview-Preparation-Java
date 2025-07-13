class Sorting {
    public ArrayList<ArrItem> sortedWithIndices(int arr[]) {
        ArrayList<ArrItem> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(new ArrItem(arr[i], i));
        }
        Collections.sort(list, (a, b) -> {
            if (a.item != b.item) return a.item - b.item;
            return a.index - b.index;
        });
        return list;
    }
}
