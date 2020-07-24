import java.util.HashMap;
import java.util.Map;

class LongestHarmoniousSubsequence {

    // https://leetcode.com/problems/longest-harmonious-subsequence/
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        for (int k : map.keySet()) {
            if (map.containsKey(k + 1)) {
                max = Math.max(max, map.get(k) + map.get(k + 1));
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        int[] nums = {1,3,2,2,5,2,3,7};
//        int[] nums = {1,1,1,1};
        int[] nums = {0,3,1,3,3,3,0,1,0,2,0,3,1,3,-3,2,0,3,1,2,2,-3,2,2,3,3};
        System.out.println(new LongestHarmoniousSubsequence().findLHS(nums));
    }
}