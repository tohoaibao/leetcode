import java.util.Arrays;
import java.util.TreeMap;

class RelativeSortArrayTreeMap {

    // https://leetcode.com/problems/relative-sort-array/
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int i = 0;
        for (int num : arr2) {
            for (int j = 0; j < map.get(num); j++) {
                arr1[i++] = num;
            }
            map.remove(num);
        }

        for (int num : map.keySet()) {
            for (int j = 0; j < map.get(num); j++) {
                arr1[i++] = num;
            }
        }

        return arr1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};

        System.out.println(Arrays.toString(new RelativeSortArrayTreeMap().relativeSortArray(arr1, arr2)));
    }
}