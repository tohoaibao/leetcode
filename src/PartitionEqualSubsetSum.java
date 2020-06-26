import java.util.Arrays;

class PartitionEqualSubsetSum {

    // https://leetcode.com/problems/partition-equal-subset-sum/
    /*
        Each of the array element will not exceed 100.
        The array size will not exceed 200.
     */
    public boolean canPartition(int[] nums) {

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // If sum is old number --> return false
        if ((sum & 1) == 1) return false;

        sum /= 2;

        int n = nums.length;
        boolean[] dp = new boolean[sum + 1];
        Arrays.fill(dp, false);
        dp[0] = true;

        for (int num : nums) {
            for (int i = sum; i > 0; i--) {
                if (i >= num) {
                    dp[i] = dp[i] || dp[i - num];
                }
            }
        }

        return dp[sum];
    }

    public boolean canPartitionBacktrack(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // If sum is old number --> return false
        if ((sum % 2) == 1) return false;

        sum /= 2;

        Arrays.sort(nums);

        return backtrack(sum, nums.length - 1, nums);
    }

    private boolean backtrack(int sum, int start, int[] nums) {
        if (start < 0) return false;

        if (sum == nums[start]) return true;

        if (sum < nums[start]) return false;

        return backtrack(sum - nums[start], start - 1, nums)
                || backtrack(sum, start - 1, nums);
    }


    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 6};
        System.out.println(new PartitionEqualSubsetSum().canPartitionBacktrack(nums));
    }
}