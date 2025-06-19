class Solution {
    class Pair {
        int val, index;
        Pair(int v, int i) {
            val = v;
            index = i;
        }
    }

    int[] constructLowerArray(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(arr[i], i);
        }
        mergeSort(pairs, 0, n - 1, res);
        return res;
    }

    void mergeSort(Pair[] pairs, int left, int right, int[] res) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(pairs, left, mid, res);
        mergeSort(pairs, mid + 1, right, res);
        merge(pairs, left, mid, right, res);
    }

    void merge(Pair[] pairs, int left, int mid, int right, int[] res) {
        List<Pair> temp = new ArrayList<>();
        int i = left, j = mid + 1, count = 0;
        while (i <= mid && j <= right) {
            if (pairs[i].val <= pairs[j].val) {
                res[pairs[i].index] += count;
                temp.add(pairs[i++]);
            } else {
                count++;
                temp.add(pairs[j++]);
            }
        }
        while (i <= mid) {
            res[pairs[i].index] += count;
            temp.add(pairs[i++]);
        }
        while (j <= right) {
            temp.add(pairs[j++]);
        }
        for (int k = left; k <= right; k++) {
            pairs[k] = temp.get(k - left);
        }
    }
}
