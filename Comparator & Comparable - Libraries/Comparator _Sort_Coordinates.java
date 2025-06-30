class Solution {
    public static void coordinatesSort(Point[] arr) {
        Arrays.sort(arr, (a, b) -> {
            if (a.x != b.x) return a.x - b.x;
            return a.y - b.y;
        });
    }
}
