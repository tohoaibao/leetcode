class LargestNumberAtLeastTwiceOfOthers {

    // https://leetcode.com/problems/largest-number-at-least-twice-of-others/
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != maxIndex && nums[i]*2 > nums[maxIndex]) return -1;
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(new LargestNumberAtLeastTwiceOfOthers().dominantIndex(nums));
    }
}