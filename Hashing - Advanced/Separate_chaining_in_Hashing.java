class Solution {
    public ArrayList<ArrayList<Integer>> separateChaining(int hashSize, int[] arr) {
        ArrayList<ArrayList<Integer>> hashTable = new ArrayList<>();
        for (int i = 0; i < hashSize; i++) hashTable.add(new ArrayList<>());
        for (int num : arr) hashTable.get(num % hashSize).add(num);
        return hashTable;
    }
}
