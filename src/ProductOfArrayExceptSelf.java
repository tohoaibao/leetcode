import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    // https://leetcode.com/problems/product-of-array-except-self/
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] L = new int[n];
        int[] R = new int[n];
        int[] ans = new int[n];

        L[0] = 1;
        for (int i = 1; i < n; i++) {
            L[i] = L[i - 1]*nums[i-1];
        }

        R[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            R[i] = R[i+1]*nums[i+1];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = L[i]*R[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5};
        System.out.println(Arrays.toString(new ProductOfArrayExceptSelf().productExceptSelf(nums)));
    }
}
