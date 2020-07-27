class MaximumAverageSubarrayI {

    // https://leetcode.com/problems/maximum-average-subarray-i/
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }

        return max/k;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
//        int[] nums = {-1};
//        int[] nums = {0,1,1,3,3};
        int k = 4;
        System.out.println(new MaximumAverageSubarrayI().findMaxAverage(nums, k));
    }
}