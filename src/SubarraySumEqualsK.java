import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    // https://leetcode.com/problems/subarray-sum-equals-k/
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }


    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0,0,0,0,0,0};
        int k = 0;
        System.out.println(new SubarraySumEqualsK().subarraySum(nums, k));
    }
}
