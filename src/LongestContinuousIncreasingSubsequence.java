class LongestContinuousIncreasingSubsequence {

    // https://leetcode.com/problems/longest-continuous-increasing-subsequence/
    public int findLengthOfLCIS(int[] nums) {
        int max = 0, len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i-1] < nums[i]) {
                max = Math.max(max, ++len);
            } else len = 1;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(new LongestContinuousIncreasingSubsequence().findLengthOfLCIS(nums));
    }
}