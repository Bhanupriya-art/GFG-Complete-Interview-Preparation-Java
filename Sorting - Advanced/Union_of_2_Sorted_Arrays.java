class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        int n = a.length, m = b.length;
        
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                if (union.isEmpty() || union.get(union.size()-1) != a[i]) {
                    union.add(a[i]);
                }
                i++;
            } else if (a[i] > b[j]) {
                if (union.isEmpty() || union.get(union.size()-1) != b[j]) {
                    union.add(b[j]);
                }
                j++;
            } else {
                if (union.isEmpty() || union.get(union.size()-1) != a[i]) {
                    union.add(a[i]);
                }
                i++;
                j++;
            }
        }
        
        while (i < n) {
            if (union.isEmpty() || union.get(union.size()-1) != a[i]) {
                union.add(a[i]);
            }
            i++;
        }
        
        while (j < m) {
            if (union.isEmpty() || union.get(union.size()-1) != b[j]) {
                union.add(b[j]);
            }
            j++;
        }
        
        return union;
    }
}
