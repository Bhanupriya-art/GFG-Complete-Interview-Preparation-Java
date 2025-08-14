class Solution {
    public static ArrayList<String> permute(String s) {
        ArrayList<String> res = new ArrayList<>();
        backtrack(s.toCharArray(), 0, res);
        return res;
    }
    
    private static void backtrack(char[] arr, int idx, ArrayList<String> res) {
        if (idx == arr.length) {
            res.add(new String(arr));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            swap(arr, idx, i);
            backtrack(arr, idx + 1, res);
            swap(arr, idx, i);
        }
    }
    
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
