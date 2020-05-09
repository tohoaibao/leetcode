import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) throws Exception {
        int nums[] = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}

