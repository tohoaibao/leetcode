package techiedelight;

import java.util.*;

class FindAllSubArrayWithGivenSum {

    // https://www.techiedelight.com/find-subarrays-given-sum-array/
    List<List<Integer>> findAllSubArrayWithGivenSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
            if (map.containsKey(sum - target)) {
                List<Integer> list = map.get(sum - target);
                for (Integer e : list) {
                    ans.add(Arrays.asList(e + 1, i));
                }
            }
            if (!map.containsKey(sum))
                map.put(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
        int target = 7;
        List<List<Integer>> ans = new FindAllSubArrayWithGivenSum().findAllSubArrayWithGivenSum(arr, target);
        for (List<Integer> list : ans) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
}