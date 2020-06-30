import java.util.Arrays;

public class MoveZeroes {

    // https://leetcode.com/problems/move-zeroes/
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[i++] = num;
            }
        }
        while (i < n) {
            nums[i++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        new MoveZeroes().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
