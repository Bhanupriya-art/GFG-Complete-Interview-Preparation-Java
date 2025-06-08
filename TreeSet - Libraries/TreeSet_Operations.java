class Solution {
    public static TreeSet<Integer> insert(int arr[]) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set;
    }

    public static void display(TreeSet<Integer> s) {
        for (int num : s) {
            System.out.print(num + " ");
        }
    }

    public static void erase(TreeSet<Integer> s, int x) {
        if (s.remove(x)) {
            System.out.print("erased " + x);
        } else {
            System.out.print("not found");
        }
    }
}
