class MinimumSizeSubarraySum {

    // https://leetcode.com/problems/minimum-size-subarray-sum/
    // Using 2 pointers
    public int minSubArrayLen(int s, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int n = nums.length;
        int start = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum >= s) {
                minLen = Math.min(minLen, i - start + 1);
                sum -= nums[start++];
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        int s = 7;
        int[] nums = {2,3,1,2,4,3};

        System.out.println(new MinimumSizeSubarraySum().minSubArrayLen(s, nums));
    }
}