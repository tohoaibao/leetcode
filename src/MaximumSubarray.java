public class MaximumSubarray {

    // https://leetcode.com/problems/maximum-subarray/
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE, ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            //Kadane's Algorithm
            sum = Math.max(0, sum) + nums[i];
            ans = Math.max(ans, sum);
        }

        return ans;
    }

    public static void main(String[] args) {
       int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new MaximumSubarray().maxSubArray(nums));
    }
}
