import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class FindKClosestElements {

    // https://leetcode.com/problems/find-k-closest-elements/
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        for (int e : arr) {
            list.add(e);
        }
        Collections.sort(list, (a, b) -> a.equals(b) ? a - b : Math.abs(a-x)-Math.abs(b-x));
        list = list.subList(0, k);
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 4;
        int x = 3;
        System.out.println(Arrays.toString(new FindKClosestElements().findClosestElements(arr, k, x).toArray()));
    }
}