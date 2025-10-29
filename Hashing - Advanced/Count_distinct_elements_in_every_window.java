class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        res.add(map.size());
        for (int i = k; i < arr.length; i++) {
            if (map.get(arr[i - k]) == 1)
                map.remove(arr[i - k]);
            else
                map.put(arr[i - k], map.get(arr[i - k]) - 1);
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            res.add(map.size());
        }
        return res;
    }
}
