public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
       int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new MaximumSubarray().maxSubArray(nums));
    }
}
