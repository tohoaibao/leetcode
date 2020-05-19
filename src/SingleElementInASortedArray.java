public class Solution {

    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        for (int i = 1; i < n; i+= 2) {
            if (nums[i] != nums[i - 1]) {
                return nums[i - 1];
            }
        }

        return nums[n-1];
    }

    public static void main(String[] args) {
        int nums[] = {1,3,3,7,7,11,11};
        System.out.println(new Solution().singleNonDuplicate(nums));
    }
}
