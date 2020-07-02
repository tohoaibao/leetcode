
public class ShortestUnsortedContinuousSubarray {

    // https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
    public int findUnsortedSubarray(int[] nums) {
        int start = 0, end = -1;
        int n = nums.length;
        int min = nums[n - 1];
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(nums[i], max);
            min = Math.min(nums[n - i - 1], min);
            if (nums[i] < max) end = i;
            if (nums[n - i - 1] > min) start = n - i - 1;
        }

        return end - start + 1;
    }


    public static void main(String[] args) {
        int[] nums = {1,3,2,4};
        System.out.println(new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(nums));
    }
}
