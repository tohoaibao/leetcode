package techiedelight;

import java.util.*;

class FindAllSubArrayWithZeroSum {

    // https://www.techiedelight.com/find-sub-array-with-0-sum/
    List<List<Integer>> findAllSubArrayWithZeroSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                List<Integer> list = map.get(sum);
                for (Integer val : list) {
                    ans.add(Arrays.asList(val + 1, i));
                }
            } else {
                map.put(sum, new ArrayList<>());
                map.get(sum).add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, 3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        List<List<Integer>> ans = new FindAllSubArrayWithZeroSum().findAllSubArrayWithZeroSum(arr);
        for (List<Integer> list : ans) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
}