class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : b) {
            if(map.getOrDefault(num, 0) > 0) {
                res.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        Collections.sort(res);
        return res;
    }
}
