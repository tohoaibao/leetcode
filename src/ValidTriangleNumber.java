import java.util.Arrays;

class ValidTriangleNumber {

    // https://leetcode.com/problems/valid-triangle-number/
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;
        for (int i = n - 1; i >= 2; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (nums[l] + nums[r] > nums[i]) {
                    count += r - l;
                    r--;
                } else l++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,4};
        System.out.println(new ValidTriangleNumber().triangleNumber(nums));
    }
}