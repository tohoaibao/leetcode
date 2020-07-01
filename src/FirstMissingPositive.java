import java.util.Arrays;

public class FirstMissingPositive {

    // https://leetcode.com/problems/first-missing-positive/
    public int firstMissingPositive(int[] nums) {
        if (nums.length == 0) return 1;
        Arrays.sort(nums);
        int i = 0;
        int n = nums.length;
        while (i < n && nums[i] <= 0) i++;
        if (i >= n || nums[i] != 1) return 1;
        int j = 1;
        while (i < n && nums[i] == j) {
            while (i < n && nums[i] == j) i++;
            j++;
        }

        return j;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
//        int[] nums = {1,2,0};
//        int[] nums = {0,2,2,1,1};
        System.out.println(new FirstMissingPositive().firstMissingPositive(nums));
    }
}
