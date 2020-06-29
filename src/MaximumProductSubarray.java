public class MaximumProductSubarray {

    // https://leetcode.com/problems/maximum-product-subarray/
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int max = nums[0];
        int productMax = nums[0];
        int productMin = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                int temp = productMax;
                productMax = productMin;
                productMin = temp;
            }

            productMax = Math.max(nums[i], productMax*nums[i]);
            productMin = Math.min(nums[i], productMin*nums[i]);
            max = Math.max(productMax, max);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,3,-4};
        System.out.println(new MaximumProductSubarray().maxProduct(nums));
    }
}
